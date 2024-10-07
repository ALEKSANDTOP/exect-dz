package Sem1;

public class Dz {
    public static void main(String[] args) {

        System.out.println(sumIndex(genArray()));

    }
    public static String [] genArray(){
        String [] array = {"1","45","хуй", "50"};
        return array;
    }


    public static int sumIndex(String[] array){
        int sum = 0;
        Integer str = 0;
        for (int i = 0; i < array.length; i++){

            str = Integer.parseInt(array[i]);

            if(str instanceof Integer){
                sum = sum + str;
                str = 0;
            }

            if (sum > 100){
                throw new ArithmeticException("Сумма превышенна");
            }
        }
        return sum;
    }
}
