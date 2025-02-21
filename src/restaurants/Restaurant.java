package src.restaurants;
import src.reservation.Reservation;
public abstract class Restaurant implements Reservation{
    protected String name;
    protected String location;
    protected int capacity;

    public Restaurant(String name, String location, int capacity){
        this.name=name;
        this.location=location;
        this.capacity=capacity;
    }

    public abstract void showRestaurantInfo();

}
