import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner((System.in));

        System.out.println("Enter customer name:");
        String name = scanner.nextLine();

        System.out.println("Enter customer address:");
        String address = scanner.nextLine();

        System.out.println("Enter electricity usage (kWh):");
        double electricityUsage = scanner.nextDouble();

        System.out.println("Enter gas usage (units):");
        double gasUsage = scanner.nextDouble();

        System.out.println("Is the customer using solar energy? (yes/no)");
        scanner.nextLine(); // consume the leftover newline
        String isGreenEnergy = scanner.nextLine();

        if (isGreenEnergy.equalsIgnoreCase("yes")) {
            System.out.println("Enter solar energy contribution (kWh):");
            double solarEnergyContribution = scanner.nextDouble();
            GreenEnergyBill greenBill = new GreenEnergyBill(name, address, electricityUsage, gasUsage, solarEnergyContribution);
            greenBill.displayBill();
        } else {
            EnergyBill bill = new EnergyBill(name, address, electricityUsage, gasUsage);
            bill.displayBill();
        }
    }
}
