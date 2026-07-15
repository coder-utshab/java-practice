public class sum {
    public static void main (String[] args){
   int[]numbers = {1,4,6,8,10};
    int sum = 0;

    for (int i = 0; i < numbers.length; i++) {

        sum += numbers[i];

    }
    System.out.println("sum of the is: " + sum);
    }
 
}
