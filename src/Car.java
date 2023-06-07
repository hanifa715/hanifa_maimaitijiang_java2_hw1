public class Car extends Transport{
    private String model;
    private String seatMaterial;

    public Car(String name, int year, int speed, ColorEnum colorEnum, Company company,
               String model, String seatMaterial) {
        super(name, year, speed, colorEnum, company);
        this.model = model;
        this.seatMaterial = seatMaterial;
    }

    public void makeVoice(){
        System.out.println("Биип биииип");
    }
    public void makeVoice(String voice){
        System.out.println(voice);
    }


    public String getModel() {
        return model;
    }

    public String getSeatMaterial() {
        return seatMaterial;
    }

    @Override
    public String getInfo() {
        return super.getInfo() +
                "\nModel: " + model +
                "\nSeat material: " + seatMaterial;
    }


}
