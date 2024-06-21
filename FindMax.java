/**
 * FindMax
 */
public class FindMax {

    public static void main(String[] args) {
        int[] numbers = {3, 2, 1};
        int biggestNum = numbers[0];
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] > biggestNum){
                biggestNum = numbers[i];
            }
        }
        System.out.println(biggestNum);
    }
}