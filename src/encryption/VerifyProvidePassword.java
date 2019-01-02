package encryption;

public class VerifyProvidePassword {
    public static void main(String[] args) {
        String providePassword = "myPassword1234";
        String salt = PasswordUtils.getSalt(30);
        String securePassword = PasswordUtils.generateSecurePassword(providePassword, salt);
        boolean passwordMatch = PasswordUtils.verifyUserPassword(providePassword, securePassword, salt);
        if (passwordMatch) {
            System.out.println("Provided user password " + providePassword + " is correct.");
        } else {
            System.out.println("Provided password is incorrect");
        }
    }
}
