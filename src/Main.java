public class Main {
    public static void main(String[] args) {
        Student s = new Student();
        s.study();

        LazyStudent lazy = new LazyStudent();
        lazy.study();

        Student poly = new LazyStudent();
        poly.study();
    }
}