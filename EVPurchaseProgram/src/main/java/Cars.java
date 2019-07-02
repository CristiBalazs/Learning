public class Cars  {

    private boolean electricMotor;
    private boolean electricBattery;
    private int energyConsumption;
    private String models;
    private int productionYear;
    private String manufacturer;


    private Dealership dealership;

    public Cars(boolean electricMotor, boolean electricBattery, int energyConsumption, String models, int productionYear, String manufacturer) {
        this.electricMotor = electricMotor;
        this.electricBattery = electricBattery;
        this.energyConsumption = energyConsumption;
        this.models = models;
        this.productionYear = productionYear;
        this.manufacturer = manufacturer;
    }

    public boolean isElectricMotor() {
        return electricMotor;
    }

    public Cars setElectricMotor(boolean electricMotor) {
        this.electricMotor = electricMotor;
        return this;
    }

    public boolean isElectricBattery() {
        return electricBattery;
    }

    public Cars setElectricBattery(boolean electricBattery) {
        this.electricBattery = electricBattery;
        return this;
    }

    public int getEnergyConsumption() {
        return energyConsumption;
    }

    public Cars setEnergyConsumption(int energyConsumption) {
        this.energyConsumption = energyConsumption;
        return this;
    }

    public String getModels() {
        return models;
    }

    public Cars setModels(String models) {
        this.models = models;
        return this;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public Cars setProductionYear(int productionYear) {
        this.productionYear = productionYear;
        return this;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public Cars setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
        return this;
    }

    @Override
    public String toString() {
        return "\nElectricMotor: " + electricMotor + "\nElectricBattery: " + electricBattery + "\nEnergyConsumption: " + energyConsumption +
                "\nModels: " + models + "\nProductionYear: " + productionYear +
                "\nManufacturer: " + manufacturer;
    }

}
