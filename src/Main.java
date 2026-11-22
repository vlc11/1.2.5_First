public class Main {
    public static void main(String[] args) {
        ComplexNumber a = new ComplexNumber();
        a.re = 1.1;
        a.im = 2.2;

        ComplexNumber b = new ComplexNumber();
        b.re = 1.1;
        b.im = 2.2;

        ComplexNumber c = new ComplexNumber();
        c.re = 1.1;
        c.im = 2.2;

        System.out.println(a.equals(b));
        System.out.println(a.equals(c));
        System.out.println(a.hashCode());
        System.out.println(a.hashCode() == b.hashCode());
    }
}