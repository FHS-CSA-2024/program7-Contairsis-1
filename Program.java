//import stuff here
import java.util.Scanner;
//Your code here
public class Program7{
    public static void main(String[] args){
        Scanner cashScan = new Scanner(System.in);
        int oldBucks = 0;
        int stanNicks = 0;
        int klevins = 0;
        double deciBucks = 0;
        final double klevToBucks = 1.0 / 20;
        final double nicksToBucks = 1.0 / 12 / 20;
        double tempKlev = 0;
        double tempNicks = 0;
        System.out.println("enter schrute-bucks:");
        oldBucks = cashScan.nextInt();
        System.out.println("enter klevins:");
        klevins = cashScan.nextInt();
        System.out.println("enter stanley-nickels:");
        stanNicks = cashScan.nextInt();
        tempKlev = (double) klevins * klevToBucks;
        tempNicks = (double) stanNicks * nicksToBucks;
        deciBucks = (double) oldBucks + tempKlev + tempNicks;
        deciBucks = (int)((deciBucks * 100) + 0.5) / 100.0;
        System.out.println("Decimal schrute-bucks = $" + deciBucks);
    }
}
//Paste console output below:
/*
enter schrute-bucks:
7
enter klevins:
17
enter stanley-nickels:
9
Decimal schrute-bucks = $7.89

*/
