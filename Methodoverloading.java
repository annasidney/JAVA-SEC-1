
class Addition {

    public void add(int a, int b) {
        System.out.println(a + b);
    }

    public void add(int a, int b, int c) {
        System.out.println(a + b + c);
    }

    public void add(int a, int b, int c, int d) {
        System.out.println(a + b + c + d);
    }

    public static void main(String[] args) {
        Addition a = new Addition();

        a.add(5, 6);
        a.add(5, 6, 7);
        a.add(5, 6, 7, 8);
    }
}
