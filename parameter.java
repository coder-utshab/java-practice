// public class parameter {
    
//   static void myMethod(String fname, int age) {
//     System.out.println(fname + " is " + age);
//   }

//   public static void main(String[] args) {
//     myMethod("Liam", 5);
//     myMethod("Jenny", 8);
//     myMethod("Anja", 31);
//   }
// }










// return values

// public class parameter{
//   static int myMethod(int x){
//     return 5+x;
//     }

//     public static void main(String[] args){
//       System.out.println(myMethod(4));
//     }
// }





// public class parameter{
//   static int doubleGame(int x){
//     return x * 2;
//   }
//   public static void main(String[] args){
//     for (int i = 1; i <=5; i++){
//       System.out.println("Double of " + i + " is " + doubleGame(i));
//     }
//   }
// }








public class parameter{
  static int plusMethod(int x, int y){
    return x + y;
  }
  static double plusMethodDouble(double x, double y){
    return x + y;
  }
  public static void main(String[] args){
    int myNum1 = plusMethod(8,5);
    double myNum2 = plusMethodDouble(4.3, 6.26);

    System.out.println("int:" + myNum1);
    System.out.println("double:" + myNum2);
  }
}