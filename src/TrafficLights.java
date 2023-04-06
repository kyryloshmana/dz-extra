import java.util.Scanner;

public class TrafficLights {
    public static boolean check = false;
    public void  displaying(){
        System.out.println("Enter a color \nIf you want to back, entered 'exit'");

        Scanner data = new Scanner(System.in);
        String color;

        while (!check) {
            color = data.nextLine();
            switch (color) {
                case "red":
                    System.out.println("**********\n***Stop***\n**********");
                    System.out.println("\nEnter a color \nIf you want to back, entered 'exit'");
                    break;
                case "yellow":
                    System.out.println("**********\n*Caution*\n**********");
                    System.out.println("\nEnter a color \nIf you want to back, entered 'exit'");
                    break;
                case "green":
                    System.out.println("**********\n****Go****\n**********");
                    System.out.println("\nEnter a color \nIf you want to back, entered 'exit'");
                    break;
                default:
                    System.out.println("Your color is wrong\nEnter a color \nIf you want to back, entered 'exit'");
                    break;
                case "exit":
                    check=true;
                    //break;

            }
            //System.out.println("Enter a color \nIf you want to back, entered 'exit'");
        }
    }
}
