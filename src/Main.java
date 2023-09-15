import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("The interest for a $5000 balance is");
        double oneMonthInt;
        double twoMonthInt;
        int INITIAL_BALANCE = 5000;
        double INTEREST_RATE = 0.17;
        oneMonthInt = INITIAL_BALANCE*INTEREST_RATE;
        System.out.println("After one month the interest is $" + oneMonthInt);
        twoMonthInt = (INITIAL_BALANCE + oneMonthInt) * INTEREST_RATE;
        System.out.println("After two months the interest is $" + twoMonthInt);
    }
}