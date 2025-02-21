package src.restaurants;

public class FineDiningRestaurants extends Restaurant {
    private double minimumSpend;

    public FineDiningRestaurants(String name, String location, int capacity, double minimumSpend){
        super(name,location,capacity);
        this.minimumSpend=minimumSpend;

    }

    @Override
    public void showRestaurantInfo() {
        System.out.println("Premium Restoran: " + name + ", Yer: " + location + ", Tutum: " + capacity + ", Minimum Sifariş: " + minimumSpend + " AZN");
    }

    @Override
    public void makeReservation(String customerName, String date, int peopleCount) {
        System.out.println(customerName + " üçün premium rezervasiya edildi. (" + date + ", " + peopleCount + " nəfər)");
    }

    @Override
    public void cancelReservation(String customerName) {
        System.out.println(customerName + " üçün premium rezervasiya ləğv edildi.");
    }


}
