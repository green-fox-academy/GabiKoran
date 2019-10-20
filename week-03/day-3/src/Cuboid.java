public class Cuboid {
    public static void main(String[] args) {
        // Write a program that stores 3 sides of a cuboid as variables (doubles)
        int sideA = 10;
        int sideB = 15;
        int sideC = 20;
        // The program should write the surface area and volume of the cuboid like:
        //
        // Surface Area: 600
        // Volume: 1000
        System.out.println("Surface Area: " + 2*((sideA*sideB)+(sideB*sideC)+(sideC*sideA)));
        System.out.println("Volume: " + sideA*sideB*sideC);
    }
}