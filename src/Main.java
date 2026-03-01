//import java.awt.*;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;
import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        expense myObj = new expense();
        //variable initialization
        int x = 3;
        ArrayList<String> expenses = new ArrayList<String>();

        while (x > 0) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Amount: ");
            int userAmount = scanner.nextInt();
            myObj.setAmount(userAmount);
            System.out.println(myObj.getAmount());
            System.out.println("Category: ");
            String userCategory = scanner.next();
            myObj.setCategory(userCategory);
            System.out.println(myObj.getCategory());
            System.out.println("Data (dd-MM-yyyy):");
            String date = scanner.next();
            myObj.setDate(date);
            System.out.println(myObj.getDate());
            System.out.println("Description: ");
            String userDescription = scanner.next();
            myObj.setDescription(userDescription);
            System.out.println(myObj.getDescription());
            //converting to string
            String newAmount = Integer.toString(myObj.amount);
            expenses.add(newAmount);
            expenses.add(myObj.category);
            expenses.add(myObj.date);
            expenses.add(myObj.description);
            x = x - 1;
        }
        for (String i : expenses) {
            System.out.println(i);

        }
    }

}