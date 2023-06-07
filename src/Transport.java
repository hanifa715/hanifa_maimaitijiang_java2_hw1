public class Transport {
    private String name;
    private int year;
    private int speed;
    private ColorEnum colorEnum;
    private Company company;

    public Transport(String name, int year, int speed, ColorEnum colorEnum, Company company) {
        this.name = name;
        this.year = year;
        this.speed = speed;
        this.colorEnum = colorEnum;
        this.company = company ;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public int getSpeed() {
        return speed;
    }

    public ColorEnum getColorEnum() {
        return colorEnum;
    }

    public Company getCompany() {
        return company;
    }
    public String getInfo(){
        return "Name: " + name +
                "\nYear: " + year +
                "\nSpeed: " + speed +
                "\nColor: " + colorEnum +
                "\nCompany name: " + company.getName() +
                "\nCompany address: " + company.getAddress();

    }
}
