public class CommissionEmployee extends Employee {
    private int commissionRate;
    private int grossSales;

    public CommissionEmployee(String firstName, String lastName, String socialSecurity, int commissionRate, int grossSales) {
        super(firstName, lastName, socialSecurity);
        this.commissionRate = commissionRate;
        this.grossSales = grossSales;
    }

    public void setCommissionRate(int commissionRate) {
        this.commissionRate = commissionRate;
    }

    public void setGrossSales(int grossSales) {
        this.grossSales = grossSales;
    }

    public int getCommissionRate() {
        return commissionRate;
    }

    public int getGrossSales() {
        return grossSales;
    }
}
