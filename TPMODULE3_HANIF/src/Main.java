import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner ux = new Scanner(System.in);
        Restaurant restoran = new Restaurant();
        int customerID, orderQty;

        try {
            System.out.print("Enter Customer ID: ");
            customerID = ux.nextInt();

            System.out.print("Enter how much Food to made: ");
            orderQty = ux.nextInt();

            Thread t1 = new Thread(restoran);
            Waiters waiter = new Waiters(customerID, orderQty);
            Thread t2 = new Thread(waiter);

            t1.start();
            t2.start();
            t1.join();
            t2.join();

        } catch (Exception e) {
            System.out.println("Input must be Integer");
        }
        ux.close();
    }
}