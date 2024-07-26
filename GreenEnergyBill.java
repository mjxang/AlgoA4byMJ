public class GreenEnergyBill extends EnergyBill {
    private double solarEnergyContribution; // in kWh

    // Deduction rate per kWh (example value, adjust as necessary)
    private static final double SOLAR_DEDUCTION_RATE = 0.05;

    public GreenEnergyBill(String name, String address, double electricityUsage, double gasUsage, double solarEnergyContribution) {
        super(name, address, electricityUsage, gasUsage);
        this.solarEnergyContribution = solarEnergyContribution;
    }

    @Override
    public double calculateTotalBill() {
        double baseBill = super.calculateTotalBill();
        double solarDeduction = solarEnergyContribution * SOLAR_DEDUCTION_RATE;
        return baseBill - solarDeduction;
    }

    @Override
    public void displayBill() {
        super.displayBill();
        System.out.println("Solar Energy Contribution: " + solarEnergyContribution + " kWh");
        System.out.printf("Total Bill after Solar Deduction: $%.2f\n", calculateTotalBill());
    }
}
