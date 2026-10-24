class StudentMarks {

    void average(int a, int b) {
        System.out.println("Average of 2 subjects: " + (a + b) / 2.0);
    }

    void average(int a, int b, int c) {
        System.out.println("Average of 3 subjects: " + (a + b + c) / 3.0);
    }

    public static void main(String[] args) {
        StudentMarks s = new StudentMarks();

        s.average(80, 90);
        s.average(80, 90, 85);
    }
}
