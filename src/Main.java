public class Main {
    public static void main(String[] args) {
        Human h = new Human();
        h.news = "Новости";
        h.experience = 10;
        h.gossip = "Слухи";

        System.out.println("news: " + h.getNews());
        System.out.println("experience: " + h.getExperience());
        System.out.println("gossip: " + h.getGossip());
    }
}
