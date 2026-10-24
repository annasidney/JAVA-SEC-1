class Area {

    void calculate(double side) {
        System.out.println("Area of Square: " + (side * side));
    }

    void calculate(double length, double breadth) {
        System.out.println("Area of Rectangle: " + (length * breadth));
    }

    void calculate(int radius) {
        System.out.println("Area of Circle: " + (3.14 * radius * radius));
    }

    public static void main(String[] args) {
        Area a = new Area();

        a.calculate(5.0);
        a.calculate(4.0, 6.0);
        a.calculate(7);
    }
}
