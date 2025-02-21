package src.restaurants;
public class FastFoodRestaurants extends Restaurant{
    public FastFoodRestaurants(String name, String location, int capacity){
        super(name, location,capacity);
    }

    @Override
    public void showRestaurantInfo(){
        System.out.println("Fast Food Restoranı: " + name + ", Yer: " + location + ", Tutum: " + capacity);
    }
    @Override
    public void makeReservation(String customerName, String date, int peopleCount) {
        System.out.println(customerName + " üçün " + date + " tarixində " + peopleCount + " nəfərlik masa rezerv olundu.");
    }

    @Override
    public void cancelReservation(String customerName) {
        System.out.println(customerName + " üçün rezervasiya ləğv olundu.");
    }


}
