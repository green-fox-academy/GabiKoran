public class ConditionalVariableMutation {
    public static void main(String[] args) {

        double a = 24;
        int out = 0;

        if ((a % 2) == 0) {
            out++;                      // if a is even increment out by one
            System.out.println(out);
        }


        int b = 13;
        String out2 = "";

        if ((b >= 10) && (b <= 20)) {   // if b is between 10 and 20
            out2 = "Sweet!";            // set out2 to "Sweet!"
        } else if (b < 10) {            // if less than 10
            out2 = "Less!";             // set out2 to "Less!",
        } else if (b > 20) {            // if more than 20
            out2 = "More!";             // set out2 to "More!"
        }
        System.out.println(out2);


        int c = 123;
        int credits = 100;
        boolean isBonus = false;

        if ((credits >= 50) && (isBonus == false)) {        // if credits are at least 50 and isBonus is false
            c -= 2;                                         // decrement c by 2
        } else if ((credits < 50) && (isBonus == false)) {  // if credits are smaller than 50 and isBonus is false
            c -= 1;                                         // decrement c by 1
        }                                                   // if isBonus is true c should remain the same
        System.out.println(c);


        int d = 8;
        int time = 120;
        String out3 = "";
        if (((d % 4) == 0) && (time <= 200)) {          // if d is dividable by 4 and time is not more than 200
            out3 = "check";                             // set out3 to "check"
        } else if (time > 200) {                        // if time is more than 200
            out3 = "Time out";                          // set out3 to "Time out"
        } else {                                        // otherwise
            out3 = "Run Forrset Run!";                  // set out3 to "Run Forest Run!"
        }
        System.out.println(out3);
    }
}

