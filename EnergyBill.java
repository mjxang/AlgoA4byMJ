public class EnergyBill {
    private String name;
    private String address;
    private double electricityUsage; // in kWh
    private double gasUsage; // in units

    // Rates per unit (example values, adjust as necessary)
    private static final double ELECTRICITY_RATE = 0.15; // per kWh
    private static final double GAS_RATE = 0.10; // per unit

    public EnergyBill(String name, String address, double electricityUsage, double gasUsage) {
        this.name = name;
        this.address = address;
        this.electricityUsage = electricityUsage;
        this.gasUsage = gasUsage;
    }

    public double calculateTotalBill() {
        return (electricityUsage * ELECTRICITY_RATE) + (gasUsage * GAS_RATE);
    }

    public void displayBill() {
        System.out.println("Customer Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Electricity Usage: " + electricityUsage + " kWh");
        System.out.println("Gas Usage: " + gasUsage + " units");
        System.out.printf("Total Bill: $%.2f\n", calculateTotalBill());
    }
}
