import java.util.Scanner;

class Package {
    String name;
    double[] dims = new double[3];  // length, width, height

    Package(String n){
        name=n;
    }
    void printinfo(){
        System.out.println(name +" dimensions");
        System.out.println("Length: "+ dims[0]);
        System.out.println("Width: "+dims[1]);
        System.out.println("Height: "+dims[2]);
    }
}
//import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // TODO B1: Ask "How many packages?"
        System.out.println("How many packages?");
        int count = input.nextInt();
        input.nextLine();
        // TODO B2: Use a while loop that many times:
        int i = 1;
        while (i <= count) {
            //   - Ask for package name
            System.out.println("What is the name of the package?");
            String name = input.nextLine();
            //   - Create a Package object
            Package p = new Package(name);
            //   - Ask separately for Length, Width, Height (store in the array)
            System.out.println("Enter the Length: ");
            p.dims[0] = input.nextInt();
            System.out.println("Enter the Width: ");
            p.dims[1] = input.nextInt();
            System.out.println("Enter the Height: ");
            p.dims[2] = input.nextInt();
            input.nextLine();

            //   - Call printInfo() right away
            p.printinfo();
            i++;
        }
    }
}