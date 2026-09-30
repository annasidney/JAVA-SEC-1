import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a[] = new int[5];

        System.out.println("Enter the elements in array:");

        for(int i = 0; i < 5; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Elements in the array are:");

        for(int i = 0; i < 5; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
