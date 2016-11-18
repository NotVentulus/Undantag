import java.util.Random;
import java.util.Scanner;
/**
 * Created by svos14 on 2016-11-18.
 */
public class Undantag {
    public static void upgl(){
        int[] test = new int[10];
        Random r = new Random();
        Scanner in = new Scanner(System.in);
        for (int i = 0 ; i < test.length ; i++) {
            test[i] = r.nextInt();
        }

        int choice;

        do {
            System.out.println("Välj ett tal mellan 1 och 10");
            choice = in.nextInt();
        } while (choice < 0)
    }
}
