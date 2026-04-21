import java.util.ArrayList;
import java.util.List;

public class MenuCategory implements MenuComponent {
    private String CategoryName;
    private List<MenuComponent> MenuComponents;

    public MenuCategory(String CategoryName) {
        this.CategoryName = CategoryName;
        this.MenuComponents = new ArrayList<>();
    }

    public void addComponent(MenuComponent component) {
        MenuComponents.add(component);
    }

    public void removeComponent(MenuComponent component) {
        MenuComponents.remove(component);
    }  

    @Override
    public double getPrice() {
        double totalPrice = 0;
        for (MenuComponent component : MenuComponents) {
            totalPrice += component.getPrice();
        }
        return totalPrice;
    }

    @Override
    public void print() {
        String categoryLabel = CategoryName.toUpperCase();
        System.out.println(categoryLabel);
        for (MenuComponent component : MenuComponents) {
            component.print();
        }
    }
}