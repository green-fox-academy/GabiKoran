import com.sun.deploy.security.BadCertificateDialog;

import java.util.ArrayList;

public class _05PersonalFinance {
    public static void main(String[] args) {
//        We are going to represent our expenses in a list containing integers.
//
//        Create a list with the following items.
//        500, 1000, 1250, 175, 800 and 120
        ArrayList<Integer> expenses = new ArrayList<>();
        expenses.add(500);
        expenses.add(1000);
        expenses.add(1250);
        expenses.add(175);
        expenses.add(800);
        expenses.add(120);

//        Create an application which solves the following problems.
//        How much did we spend?
        int sum = 0;
        for (int i = 0; i < expenses.size(); i++) {
            sum += expenses.get(i);
        }
        System.out.println("We spent: " + sum);

//        Which was our greatest expense?
        int greatest = 0;
        for (int i = 0; i < expenses.size(); i++) {
            if (expenses.get(i) > greatest) {
                greatest = expenses.get(i);
            }
        }
        System.out.println("The greatest expence: " + greatest);

//        Which was our cheapest spending?
        int cheapest = greatest;
        for (int i = 0; i < expenses.size(); i++) {
            if (expenses.get(i) < cheapest) {
                cheapest = expenses.get(i);
            }
        }
        System.out.println("The cheapest spend: " + cheapest);

//        What was the average amount of our spendings?
        System.out.println("The average amount of our spending: " + sum/expenses.size());
    }
}
