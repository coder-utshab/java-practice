public class logical {
    public static void main(String[] args) {


        boolean isLoggedIn = true;
        boolean isAdmin = false;


        System.err.println("Regular user: " + (isLoggedIn && !isAdmin));
        System.err.println("Has access: " + (isAdmin || isLoggedIn));
        System.err.println("Not logged: " + (!isLoggedIn));
    }
}
