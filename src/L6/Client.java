package L6;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Client {

    private static String clientMessage;

    public static void main(String[] args) throws IOException {

        Socket socket = new Socket("localhost",8081);
        Scanner scanner = new Scanner(System.in);

        DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
        DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());

        // отправка сообщения на сервер
        new Thread (() -> {
            try {
                do {
                    clientMessage = scanner.nextLine();
                    dataOutputStream.writeUTF(clientMessage);
                    dataOutputStream.flush();
                } while(!"\\finish".equalsIgnoreCase(clientMessage));

                socket.close();
                System.exit(0);

            } catch (IOException e) {
                e.printStackTrace();
            }
        }).start();

        // принятие сообщение с сервера
        while(!socket.isInputShutdown()) {
            String messageFromServer = dataInputStream.readUTF();
            System.out.println("Message from server: " + messageFromServer);
        }
    }
}
