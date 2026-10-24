public class RecursionDemo {

    public void printNumbers(int n) {
        if (n == 0) {
            return;
        }

        System.out.println(n);
        printNumbers(n - 1);
    }

    public static void main(String[] args) {
        RecursionDemo r = new RecursionDemo();
        r.printNumbers(5);
    }
}
