// public class recursion {
//     public static void main(String[] args){
//         sayHi();
//     }
//     private static void sayHi(){
//         System.out.println("Hi");
//         sayHi();
//     }
    
// }





// public class recursion {
//     public static void main(String[] args){
//         sayHi(4);
//     }
//     private static void sayHi(int count){
//         System.out.println("Hi");
//        if (count <= 1){
//         return;
//        }
//        sayHi(count - 1);
//     }
    
// }







// public class recursion {
//     static int sum (int k){
//         if (k > 0)
//             return k + sum (k - 1);

//         else
//             return 0;
//     }
//     public static void main (String [] args){
//         System.out.println(sum(5));
//     }
// }

// output 15






// public class recursion {
//     static int print (int x){
//         if(x == 0)
//             return 0;

//         return x + print(x - 1);
//     }
//     public static void main(String[] args){
//         System.out.println(print(4));
//     }
// }