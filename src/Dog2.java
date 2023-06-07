import java.util.Arrays;

public class Dog2 extends Pet{
    private String name;
    private String breed;

    public Dog2(String name, String breed, ColorEnum colorEnum, Shelter shelter) {
        this.name = name;
        this.breed = breed;
        super.setShelter(shelter);
        super.setColorEnum(colorEnum);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
    public void makeVoice(){
        System.out.println("Гав гав");
    }
    public void makeVoice(String voice){
        System.out.println(voice);
    }

    @Override
    public String getInfo() {
        return super.getInfo() +
                "\nName: " + name +
                "\nBreed: " + breed ;
    }
}
