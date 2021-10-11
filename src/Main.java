public class Main {
    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("Basic", "Sausage", 3.56, "White");
        double price = hamburger.itemizeHamburger();
        hamburger.addHamburgerAddition1("Tomato", 0.27);
        hamburger.addHamburgerAddition2("Lettuce", 0.75);
        hamburger.addHamburgerAddition3("Cucumbers", 0.55);
        hamburger.addHamburgerAddition4("Cheese", 1.15);
        System.out.println("Total burger price is: " + price);

        System.out.println("---------");


        HealthyBurger healthyBurger = new HealthyBurger("Bacon", 5.40);
        healthyBurger.addHamburgerAddition1("Egg", 5.40);
        healthyBurger.addHealthAddition1("Spinach", 2.20);
        healthyBurger.addHealthAddition2("Carrots", 0.50);
        System.out.println("Total Healthy burger price: " + healthyBurger.itemizeHamburger() + " dollars.");

        System.out.println("--------------");
        DeluxeBurger db = new DeluxeBurger();
        db.addHamburgerAddition3("Should not do this", 50.50);
        db.itemizeHamburger();
        System.out.println("Total deluxe burgerprice is: " + db.itemizeHamburger() + " dollars");
    }
}
