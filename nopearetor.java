// public class nopearetor {
//      public static void main(String[] args) {
//     int a = 33;
//     int b = 200;

//     if (!(a > b)) {
//       System.out.println("a is NOT greater than b");
//     }
//   }
// }





public class nopearetor {
    public static void main(String[] args) {
        boolean isLoggedIn = true;
        boolean isAdmin = false;
        int securityLevel = 3;

        if (isLoggedIn && (isAdmin || securityLevel <= 2)) {
            System.out.println("Access granted");
        } else {
            System.out.println("Access denied");
        }
    }
}