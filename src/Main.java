package src;

import src.restaurants.FastFoodRestaurants;
import src.restaurants.FineDiningRestaurants;


public class Main {
    public static void main(String[] args) {

        FastFoodRestaurants fastFood = new FastFoodRestaurants("Mc", "Bakı", 50);
        FineDiningRestaurants fineDining = new FineDiningRestaurants("Luxury Steakhouse", "İstanbul", 30, 100.0);

        fastFood.showRestaurantInfo();
        fineDining.showRestaurantInfo();


        fastFood.makeReservation("Elvin", "2025-03-01", 3);
        fineDining.makeReservation("Leyla", "2025-03-05", 2);

        fastFood.cancelReservation("Elvin");

    }
}