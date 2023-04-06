import java.util.Scanner;

public class Main {
        public static boolean check = false;
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        String selectedNumber;

        String menu = "Select item for work:\n" +
                "1. Checking for a leap year\n" +
                "2. Verify colors traffic lights\n" +
                "3. Exit";
        System.out.println(menu);

        while (!check){
            selectedNumber = data.nextLine();
            System.out.println("selected " + selectedNumber);


            switch (selectedNumber) {
                case "1":
                    LeapYear leapYear = new LeapYear();
                    leapYear.VerifyYears();
                    break;


                case "2":
                    TrafficLights trafficLights = new TrafficLights();
                    trafficLights.displaying();
                    break;

                case "3":
                    check = true;
                    break;

                default:
                    System.out.println("No such menu");
                    break;

            }
            System.out.println(menu);
        }
    }
}