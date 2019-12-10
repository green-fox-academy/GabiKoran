import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Reservation> hotel1 = new ArrayList<>();
        hotel1.add(new Reservation("1WBA3OMU", "THU"));
        hotel1.add(new Reservation("0V5OH7VS", "WED"));
        hotel1.add(new Reservation("CV6QOAJO", "MON"));
        hotel1.add(new Reservation("03GHEJMV", "SAT"));
        hotel1.add(new Reservation("M5JFB32I", "THU"));
        hotel1.add(new Reservation("W30PF0E0", "SAT"));
        hotel1.add(new Reservation("S0R70GMN", "SAT"));
        hotel1.add(new Reservation("3E032B3C", "WED"));
        hotel1.add(new Reservation("OD27E36J", "SAT"));
        hotel1.add(new Reservation("4MEU0657", "MON"));

        for(Reservation booking : hotel1) {
            System.out.println(booking.format());
        }
    }
}
