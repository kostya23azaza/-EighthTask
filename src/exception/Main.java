package exception;

public class Main {
    public static void main(String[] args) throws MyArraySizeException, MyArrayDataException {
        int result = 0;
        String array[][] = {{"2", "1", "1", "1"}, {"1", "1", "1", "1"}};
        String array1[][] = {{"1", "i", "4", "0"}, {"1", "3", "4", "1"}};
        String array2[][] = {{"1", "2", "4", "0", "9"}, {"1", "3", "4", "1"}};
        try {
            result= 0;
            result = sumArr(array);
        } catch (MyArraySizeException e) {
            System.out.println(e.getMessage());
        } catch (MyArrayDataException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Результат суммирования равен " + String.valueOf(result));
            System.out.println();
        }
        try {
            result = 0;
            result = sumArr(array1);
        } catch (MyArraySizeException e) {
            System.out.println(e.getMessage());
        } catch (MyArrayDataException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Результат суммирования равен " + String.valueOf(result));
            System.out.println();
        }
        try {
            result= 0;
            result = sumArr(array2);
        } catch (MyArraySizeException e) {
            System.out.println(e.getMessage());
        } catch (MyArrayDataException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Результат суммирования равен " + String.valueOf(result));
            System.out.println();
        }
    }

    public static int sumArr(String[][] array) throws MyArraySizeException, MyArrayDataException {
        if (array[0].length != 4 || array[1].length != 4 || array.length != 2) {
            throw new MyArraySizeException();
        }
        int resultSum = 0;
        int value;
        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[i].length; j++) {
                try {
                    value = Integer.parseInt(array[i][j]);
                    resultSum += value;
                } catch (IllegalArgumentException e) {
                    String number = ("в строке индексом " + String.valueOf(i) + " и столбце индексом " + String.valueOf(j));
                    throw new MyArrayDataException(number);
                }
            }
        }
        return resultSum;//d
    }
}
