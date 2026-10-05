public class Classes {

    String name;
    int age;

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {

        Classes student = new Classes();

        student.name = "Anna";
        student.age = 19;

        student.displayDetails();
    }
}
