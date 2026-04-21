public class RestoApp {
    public static void main(String[] args) {
        MenuCategory barkadaSoloMeal = new MenuCategory("---BARKADA SOLO MEAL---");
        MenuComponent classicBurger = new MenuItem("Classic Burger", 250.00);
        MenuComponent largeFries = new MenuItem("Large Fries", 85.00);
        MenuComponent rootBeer = new MenuItem("Root Beer", 60.00);

        barkadaSoloMeal.addComponent(classicBurger);
        barkadaSoloMeal.addComponent(largeFries);
        barkadaSoloMeal.addComponent(rootBeer);

        MenuComponent vanillaSundae = new MenuItem("Vanilla Sundae", 45.00);

        MenuCategory mainMenu = new MenuCategory("---Main Menu---\n");
        mainMenu.addComponent(barkadaSoloMeal);
        mainMenu.addComponent(vanillaSundae);

        mainMenu.print();
        System.out.println();
        System.out.println("============================");
        System.out.printf("Total Menu Value: ₱%.2f%n", mainMenu.getPrice());
    }
}