public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Online Food Delivery System");
    }
}
public class User {
    String name;
    String address;

    public User(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public void displayUser() {
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
    }
}
public class Restaurant {
    String name;

    public Restaurant(String name) {
        this.name = name;
    }

    public void displayRestaurant() {
        System.out.println("Restaurant: " + name);
    }
}
public class MenuItem {
    String itemName;
    double price;

    public MenuItem(String itemName, double price) {
        this.itemName = itemName;
        this.price = price;
    }

    public void displayItem() {
        System.out.println(itemName + " - ₹" + price);
    }
}
import java.util.ArrayList;

public class Cart {
    ArrayList<MenuItem> items = new ArrayList<>();

    public void addItem(MenuItem item) {
        items.add(item);
    }

    public void showCart() {
        for (MenuItem item : items) {
            item.displayItem();
        }
    }
}
public class Order {
    Cart cart;

    public Order(Cart cart) {
        this.cart = cart;
    }

    public void placeOrder() {
        System.out.println("Order placed successfully!");
        cart.showCart();
    }
}
public class Main {
    public static void main(String[] args) {

        User user = new User("Ahana", "Kolkata");

        Restaurant r = new Restaurant("Food Palace");

        MenuItem item1 = new MenuItem("Burger", 120);
        MenuItem item2 = new MenuItem("Pizza", 250);

        Cart cart = new Cart();
        cart.addItem(item1);
        cart.addItem(item2);

        Order order = new Order(cart);

        user.displayUser();
        r.displayRestaurant();
        order.placeOrder();
    }
}