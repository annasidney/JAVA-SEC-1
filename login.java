class login {

    public void accept(String username, String password, int otp) {
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
        System.out.println("OTP: " + otp);
    }

    public static void main(String[] args) {
        login l = new login();
        l.accept("user1", "pass123", 1234);
    }
}
