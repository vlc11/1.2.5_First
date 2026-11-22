public class Main {
    public static void main(String[] args) {
        Student s = new Student();
        s.study();

        JavaStudent js = new JavaStudent();
        js.study();

        Student poly = new JavaStudent();
        poly.study();
    }
}