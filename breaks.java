
//akhana3 or 7 output a jonno ashba 
//n-ar man number akhon 
//say n-- er man all number 

// akhon akhna n ar man 0 ar choto sa gula bad 
// & boro gula count korcha tahola hocca 3 or 7 
// thaktacha 9 akhon 9  ajonno count hoba nahh karon tar aga break use hoyacha


public class breaks {
    public class Main {
  public static void main(String[] args) {
    int[] numbers = {3, -1, 7, 0, 9};

    for (int n : numbers) {
      if (n < 0) {
        continue; // skip negative numbers
      }
      if (n == 0) {
        break; // stop loop when zero is found
      }
      System.out.println(n);
    }
  }
}
}
