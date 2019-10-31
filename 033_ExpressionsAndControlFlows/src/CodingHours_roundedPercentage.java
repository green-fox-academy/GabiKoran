public class CodingHours_roundedPercentage {
    public static void main(String[] args) {
        // An average Green Fox attendee codes 6 hours daily
        // The semester is 17 weeks long
        //
        // Print how many hours is spent with coding in a semester by an attendee,
        // if the attendee only codes on workdays.
        System.out.println();
        System.out.println("The coding hours are " + (17*5*6) + " in the full semester.");

        // Print the percentage of the coding hours in the semester if the average
        // work hours weekly is 52
        System.out.println();
        double percentage = (((5*6.)/52)*100);
        System.out.println("The percentage of the coding hours is " + (Math.round(percentage * 10) / 10. + " %."));
    }
}

