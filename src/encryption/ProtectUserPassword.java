package encryption;

public class ProtectUserPassword {
    public static void main(String[] args) {
        String myPassword = "myPassword1234";
        String salt = PasswordUtils.getSalt(30);
        String mySecurePassword = PasswordUtils.generateSecurePassword(myPassword, salt);
        System.out.println("My secure Password = " + mySecurePassword);
        System.out.println("Salt value = " + salt);
    }
}
