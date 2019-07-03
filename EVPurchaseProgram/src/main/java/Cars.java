public class Cars  {

    private boolean electricMotor;
    private boolean electricBattery;
    private int energyConsumption;
    private String models;
    private int productionYear;
    private String manufacturer;
    private boolean fastCharging;
    private int stock;


    public Cars(boolean electricMotor, boolean electricBattery, int energyConsumption, String models,
                int productionYear, String manufacturer, boolean fastCharging, int stock) {
        this.electricMotor = electricMotor;
        this.electricBattery = electricBattery;
        this.energyConsumption = energyConsumption;
        this.models = models;
        this.productionYear = productionYear;
        this.manufacturer = manufacturer;
        this.fastCharging = fastCharging;
        this.stock = stock;
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

    public boolean isFastCharging() {
        return fastCharging;
    }

    public Cars setFastCharging(boolean fastCharging) {
        this.fastCharging = fastCharging;
        return this;
    }

    public int isStock() {
        return stock;
    }

    public Cars setStock(int stock) {
        this.stock = stock;
        return this;
    }

    public boolean isInStock(){
        if (stock == 0){
            return true;
        }else {
            return false;
        }
    }


    @Override
    public String toString() {
        return "\nElectricMotor: " + electricMotor + "\nElectricBattery: " + electricBattery + "\nEnergyConsumption: " + energyConsumption +
                "\nModels: " + models + "\nProductionYear: " + productionYear +
                "\nManufacturer: " + manufacturer + "\nFastCharging: " + fastCharging + "\nStock: " + stock;
    }

}
