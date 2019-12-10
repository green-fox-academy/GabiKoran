public class Reservation implements Reservationy {

    private String reservationCode;
    private String dayOfTheWeek;

    public Reservation(String reservationCode, String dayOfTheWeek) {   // a kódot automatikusan kellene generálnia, tehát
        this.reservationCode = reservationCode;                         // nem kellene itt lennie a bemeneti paraméterek között
        this.dayOfTheWeek = dayOfTheWeek;
    }

    public String format() {
        //Booking# 1WBA3OMU for THU
        return "Booking# " + getDowBooking() + " for " + getCodeBooking();
    }

    @Override
    public String getDowBooking() {
        return this.dayOfTheWeek;
    }

    @Override
    public String getCodeBooking() {
        return this.reservationCode;
    }
}
