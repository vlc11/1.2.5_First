public class Main {
    public static void main(String[] args) {
        Main obj = new Main();
        System.out.println(obj.priceCalculation(8.50, 2));
    }
    public double priceCalculation(double price, int count) {
        return price * count;
    }
}
