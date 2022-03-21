public class Animals {
    int run;
    int swim;
    String name;
    public static int countAnimal = 0;
    public static int countDog = 0;
    public static int countCat = 0;

    void runs() {
        System.out.println("The animal it ran: " + run);
    }

    void swim() {
        System.out.println("The animal to swim: " + swim);
    }

    void newLife() {
        countAnimal++;
        System.out.println(countAnimal + " Animal");

    }

    public Animals(int run, int swim, String name) {
        this.run = run;
        this.swim = swim;
        this.name = name;
        newLife();

    }
public Animals(){}

}
