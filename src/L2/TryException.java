package L2;

public class TryException {

    private static final int MAX_SIZE = 4;

    public static void main(String[] args) {

        String[][] arr1 = new String[][]{{"1","1","1","1"},{"1","1","1","1"},{"1","1","1","1"}};
        String[][] arr2 = new String[][]{{"1","1","1","1"},{"1","1","1","1"},{"1","1","1","1"},{"1","1","1","1"}};
        String[][] arr3 = new String[][]{{"1","1","1","1"},{"1","1","1","1"},{"1","1","1","1"},{"1","1"}};
        String[][] arr4 = new String[][]{{"1","1","1","1"},{"1","1","1","один"},{"1","один","один","два"},{"добрый день","1","1","1",}};

        try{
            sumArray(arr1);
        } catch (MyArraySizeException | MyArrayDataException e){
            System.out.println(e.getMessage());
        }

        try{
            sumArray(arr2);
        } catch (MyArraySizeException | MyArrayDataException e){
            System.out.println(e.getMessage());
        }

        try{
            sumArray(arr3);
        } catch (MyArraySizeException | MyArrayDataException e){
            System.out.println(e.getMessage());
        }

        try{
            sumArray(arr4);
        } catch (MyArraySizeException | MyArrayDataException e){
            System.out.println(e.getMessage());
        }
    }

    public static void sumArray(String[][] arr) throws MyArrayDataException, MyArraySizeException {

        checkArraySize(arr);
        int arrSum = 0;

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++){
                try {
                    arrSum += Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e){
                    throw new MyArrayDataException(i, j);
                }
            }
        }
        System.out.println("Сумма элементов массива = " + arrSum);
    }
    
    private static void checkArraySize(String[][] arr) throws MyArraySizeException{

        if (arr.length != MAX_SIZE) {
            throw new MyArraySizeException();
        }

        for (String[] strings : arr) {
            if(strings.length != MAX_SIZE){
                throw new MyArraySizeException();
            }
        }
    }
}
