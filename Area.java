
class Area {

    public void answer(double r) {
        System.out.println("Area of circle = " + (3.14 * r * r));
    }

    public void answer(int l, int b) {
        System.out.println("Area of rectangle = " + (l * b));
    }

    public void answer(double l, double b) {
        System.out.println("Area of square = " + (l * b));
    }

    public static void main(String[] args) {
        Area a = new Area();

        a.answer(4.0);
        a.answer(5, 6);
        a.answer(5.0, 5.0);
    }
}
