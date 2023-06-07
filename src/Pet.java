import java.util.Random;

public class Pet {
    private int age = generateDefaultAge();
    private ColorEnum colorEnum;
    private Shelter shelter;

    public int getAge() {
        return age;
    }

    public ColorEnum getColorEnum() {
        return colorEnum;
    }

    public void setColorEnum(ColorEnum color) {
        this.colorEnum = color;
    }

    public Shelter getShelter() {
        return shelter;
    }

    public void setShelter(Shelter shelter) {
        this.shelter = shelter;
    }
    private int generateDefaultAge() {
        Random random = new Random();
        return random.nextInt(1,11);
    }
    public String getInfo(){
        return "Age: " + age +
                "\nColor: " + colorEnum +
                "\nShelter address: " + shelter.getAddress() +
                "\nShelter name: " + shelter.getName();
    }
}
