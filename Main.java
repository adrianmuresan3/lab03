import javax.swing.JOptionPane;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        display();
        int i = guests();
        price(i);
    }

    public static int guests() {
        System.out.println("Introduceti nr de invitati");
        Scanner sc = new Scanner(System.in);
        int Guests = sc.nextInt();
        return Guests;
    }

    public static void display() {
        JOptionPane.showMessageDialog(null, "Carly’s makes the food that makes it a party");
    }

    public static void price(int i) {
        int inital = 35;
        int total = i * inital;
        if (i >= 50) {
            System.out.println("Evenimentul este mare");
        } else {
            System.out.println("Evenimentul este mic");
        }
        System.out.println("Pretul total este: " + total);

    }
}