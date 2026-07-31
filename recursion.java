// public class recursion {
//     public static void main(String[] args){
//         sayHi();
//     }
//     private static void sayHi(){
//         System.out.println("Hi");
//         sayHi();
//     }
    
// }


public class recursion {
    public static void main(String[] args){
        sayHi(4);
    }
    private static void sayHi(int count){
        System.out.println("Hi");
       if (count <= 1){
        return;
       }
       sayHi(count - 1);
    }
    
}