import java.util.*;

class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int a[] = new int[n];

        System.out.println("Enter array elements:");

        for(int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Array after removing duplicates:");

        for(int i = 0; i < n; i++) {
            int j;

            for(j = 0; j < i; j++) {
                if(a[i] == a[j])
                    break;
            }

            if(j == i)
                System.out.print(a[i] + " ");
        }
    }
}
