import java.util.Scanner;

public class CountEvenOdd {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int evenCount = 0;
        int oddCount = 0;

        System.out.println("Enter " + n + " numbers:");

        for (int i = 0; i < n; i++) {

            int number = sc.nextInt();

            if (number % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Number of even numbers = " + evenCount);
        System.out.println("Number of odd numbers = " + oddCount);

        sc.close();
    }
}
