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