public class Main {
    public void testExp() throws MyNewException {
        throw new MyNewException();
    }

    public static void main(String[] args) {
        Main m = new Main();
        try {
            m.testExp();
        } catch (MyNewException e) {
            System.out.println("Найдено исключение: " + e.getMessage());
        }
    }
}