class Maximum {

    void max(int a, int b) {
        System.out.println("Maximum of 2 numbers: " + Math.max(a, b));
    }

    void max(int a, int b, int c) {
        System.out.println("Maximum of 3 numbers: " + Math.max(a, Math.max(b, c)));
    }

    public static void main(String[] args) {
        Maximum m = new Maximum();

        m.max(8, 5);
        m.max(8, 5, 12);
    }
}
