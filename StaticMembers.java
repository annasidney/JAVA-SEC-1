class Student {
    int rollNo;
    String name;

    static String college = "DSU";

    Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    void display() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("College: " + college);
    }

    public static void main(String[] args) {
        Student s1 = new Student(20, "ABC");
        Student s2 = new Student(21, "PQR");

        s1.display();
        s2.display();
    }
}
