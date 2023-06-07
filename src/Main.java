public class Main {
    public static void main(String[] args) {
        String[] commands = {"Sidet", "Lejat"};
        Shelter shelter = new Shelter("Peace", "Lenina 1");

        Dog dog = new Dog("Rex", "Ovcharka", commands, ColorEnum.BROWN, shelter);
        System.out.println(dog.getInfo());
        dog.makeVoice();
        dog.makeVoice("Гув гув");
        System.out.println("---------------------");

        Shelter shelter2 = new Shelter("Wanke", "Urumqi");

        Dog2 dog2 = new Dog2("Nana", "Corgis", ColorEnum.BLACK, shelter2);
        System.out.println(dog2.getInfo());
        dog2.makeVoice();
        dog2.makeVoice("Woof woof");
        System.out.println("------------------");

        Company company = new Company("Volkswagen Group", "German Wolfsburg");
        Car car = new Car("Audi", 2019,222, ColorEnum.WHITE, company,"A3", "Mileno leather");
        System.out.println(car.getInfo());
        car.makeVoice();
        car.makeVoice("Биииииип");
        System.out.println("---------------------");

        Company company1 = new Company("Volkswagen Group", "German Wolfsburg");
        Audi audi1 = new Audi("Audi", 2023,225,ColorEnum.GRAY, company1,"A4L",
                "Genuine leather", "Class B sedan");
        System.out.println(audi1.getInfo());
        audi1.makeVoice();
        audi1.makeVoice("Бип бип биип");
        System.out.println("---------------------");

        Company company2 = new Company("Volkswagen Group", "German Wolfsburg");
        Audi audi2 = new Audi("Audi", 2017, 250, ColorEnum.BLUE, company2, "A6L",
                "Genuine leather", "Luxury business car");
        System.out.println(audi2.getInfo());
        audi2.makeVoice();
        audi2.makeVoice("Биип биииип бип");




    }
}