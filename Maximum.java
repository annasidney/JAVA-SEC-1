
class Maximum {

    public void max(int a, int b) {
        System.out.println("Maximum = " + (a > b ? a : b));
    }

    public void max(int a, int b, int c) {
        int largest = a;

        if (b > largest) {
            largest = b;
        }

        if (c > largest) {
            largest = c;
        }

        System.out.println("Maximum = " + largest);
    }

    public void max(double a, double b) {
        System.out.println("Maximum = " + (a > b ? a : b));
    }

    public static void main(String[] args) {
        Maximum m = new Maximum();

        m.max(10, 20);
        m.max(10, 20, 15);
        m.max(25.5, 18.5);
    }
}
