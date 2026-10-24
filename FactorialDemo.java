public class FactorialDemo {

    public int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }

        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        FactorialDemo f = new FactorialDemo();
        System.out.println(f.factorial(5));
    }
}
