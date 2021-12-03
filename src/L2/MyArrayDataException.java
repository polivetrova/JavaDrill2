package L2;

public class MyArrayDataException extends Exception{

    public MyArrayDataException(int i, int j) {
        super("Ошибка конвертации элемента массива: [" + i + "][" + j + "]");
    }
}
