import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        // TODO A1: Create a File object for "products.txt"
        File myFile = new File("products.txt");
        // TODO B1: Create a Scanner to read from the file
        Scanner input = new Scanner (myFile);
        // TODO C1: Print "Product List:"
        System.out.println("Products List:");
        // TODO C2: Use a while loop to read each product name and print it
        int count = 0;
        while (input.hasNextLine()){
            String line = input.nextLine();
            System.out.println(line);
            count++;
        }
        // TODO D1: Keep track of how many products were listed
        // TODO D2: After the loop, print "Total products: <count>"
        System.out.println("Total products: " +count);
    }
}