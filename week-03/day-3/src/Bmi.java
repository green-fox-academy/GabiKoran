public class Bmi {
    public static void main(String[] args) {
        double massInKg = 81.2;
        double heightInM = 1.78;

        // Print the Body mass index (BMI) based on these values
        System.out.println("The Body mass index: " + (Math.round((massInKg/(heightInM*heightInM))*10)/10.));
    }
}



