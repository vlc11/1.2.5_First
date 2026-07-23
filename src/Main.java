public class Main {
    public static void main(String[] args) {
        Main ob = new Main();
        int a = 11;
        int b =  ob.determineGroup(a);
        System.out.println(b);
        }
        public int determineGroup(int age){
        if (age >= 7){
            if (age <= 13) {
                return 1;
            }
        }
        if (age >= 14){
            if (age <= 17){
                return 2;
            }
        }
        if (age >= 18){
            if (age <=65){
                return 3;
            }
        }
        return -1;
    }
}