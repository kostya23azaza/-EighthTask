package exception;

public class MyArrayDataException extends RuntimeException {
    public MyArrayDataException(String number) {
        super("Преобразование не вышло " + number);
    }
}
