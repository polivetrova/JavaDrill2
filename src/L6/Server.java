package L6;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {

    private static String serverMessage;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            ServerSocket serverSocket = new ServerSocket(8081);
            System.out.println("Server socket created");
            System.out.println("Waiting for a client...");

            Socket socket = serverSocket.accept();
            System.out.println("Client connected");

            DataInputStream dataInputStream = new DataInputStream(socket.getInputStream()); //мы принимаем сообщение от клиента
            DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream()); //отправка сообдения клиенту

            String messageFromClient = "";

            // отправка сообдения клиенту из консоли
            new Thread(() -> {
                try {
                    while(true) {
                        serverMessage = scanner.nextLine();
                        dataOutputStream.writeUTF(serverMessage);
                        dataOutputStream.flush();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }).start();

            // принятие и вывод сообщения от клиента
            while(!"\\finish".equalsIgnoreCase(messageFromClient)) {
                messageFromClient = dataInputStream.readUTF();
                System.out.println("Message from client: " + messageFromClient);
            }

        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
