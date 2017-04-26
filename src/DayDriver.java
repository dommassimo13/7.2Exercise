import java.util.Scanner;

/**
 * Created by dominicmassimo on 4/26/17.
 */
public class DayDriver {
    public static void main(String [] args) {
        Scanner keyboard = new Scanner(System.in);
        Day today = new Day(keyboard.nextLine());
        System.out.println(today);
        System.out.println("Tomorrow will be :" +today.nextDay());
        System.out.println("Yesterday was :" +today.previousDay());
        System.out.println("Four days ago was :" +today.calculateDay(-4));

        keyboard.close();


    }
}
