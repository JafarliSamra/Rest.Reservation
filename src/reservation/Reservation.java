package src.reservation;

public interface Reservation {
    void makeReservation(String customerName, String date, int peopleCount);
    void cancelReservation(String customerName);
}
