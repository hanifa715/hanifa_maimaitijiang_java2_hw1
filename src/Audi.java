public final class Audi extends Car{
    private String carClass;

    public String getCarClass() {
        return carClass;
    }

    public void setCarClass(String carClass) {
        this.carClass = carClass;
    }

    public Audi(String name, int year, int speed, ColorEnum colorEnum, Company company, String model,
                String seatMaterial, String carClass) {
        super(name, year, speed, colorEnum, company,model,seatMaterial);
        this.setCarClass(carClass);
    }
    @Override
    public String getInfo() {
        return super.getInfo() +
                "\nCar class: " + carClass;
    }
}
