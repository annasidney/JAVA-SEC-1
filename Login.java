
class Login {

    public void login(String username, String password) {
        System.out.println("Login with username and password");
    }

    public void login(String username, String password, int otp) {
        System.out.println("Login with username, password and numeric OTP");
    }

    public void login(String username, String password, String otp) {
        System.out.println("Login with username, password and text OTP");
    }

    public static void main(String[] args) {
        Login l = new Login();

        l.login("user1", "pass123");
        l.login("user1", "pass123", 1234);
        l.login("user1", "pass123", "ABCD");
    }
}
