import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        try {
            int c = a / b;
        }
        catch (Exception e) {
            System.out.println("You are dividing by 0");
        }
    }
}
