//import java.awt.*;
import java.util.Date;
import java.util.Scanner;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        expense myObj = new expense();
        //variable initialization
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter amount: ");
        int userInput=scanner.nextInt();
        myObj.setAmount(userInput);
        System.out.println(myObj.getAmount());


    }
}