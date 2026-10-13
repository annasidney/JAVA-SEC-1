
class AverageMarks {

    public void avg(int a, int b, int c) {
        System.out.println("Average = " + (a + b + c) / 3.0);
    }

    public void avg(int a, int b, int c, int d) {
        System.out.println("Average = " + (a + b + c + d) / 4.0);
    }

    public static void main(String[] args) {
        AverageMarks a = new AverageMarks();

        a.avg(75, 95, 92);
        a.avg(89, 92, 85, 90);
    }
}
