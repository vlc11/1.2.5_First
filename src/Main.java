public class Main {
    public static class Cat {
        public void sayHello() {
            System.out.println("Мяу!");
        }
    }

    public static class Dog {
        public void sayHello() {
            System.out.println("Ав!");
        }

        public void catchCat(Cat cat) {
            System.out.println("Кошка поймана");
            this.sayHello();
            cat.sayHello();
        }
    }

    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        dog.catchCat(cat);
    }
}
