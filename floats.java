public class floats {
    public static void main(String[] args){

        int ages[] = {12,15,20,25,30};

        float avg, sum = 0;

        int length = ages .length;

        for (int age : ages){
            sum += age;
        }

        avg = sum / length;

        System.out.println("The average of age is: " + avg);
        
    }
}
