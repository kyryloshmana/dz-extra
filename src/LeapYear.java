import java.util.Scanner;

public class LeapYear {
    public static boolean check = false;
    public void VerifyYears() {
        System.out.println("Entered your year");

        Scanner enteredYear = new Scanner(System.in);
        int year;

        while (!check) {
            year = enteredYear.nextInt();
            int value = year % 4 % 100 % 400;

            if (value == 0) {
                System.out.println("*********************\n**This year is leap**\n*********************");
                check=true;
            }

            else {
                System.out.println("*********************\n*This year is normal*\n*********************");
                check=true;
            }
            //System.out.println(value);

        }
        check=false;
        }
}
