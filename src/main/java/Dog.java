public class Dog extends Animals {
    @Override
    void newLife() {
        countDog++;
        System.out.println(countDog + " Dog");
    }

    @Override
    void swim() {
        if (swim > 0 && swim <= 10) {
            System.out.println("The dog to swim: " + swim);
        } else {
            System.out.println("Dog can't swim more 10");
        }
    }

    @Override
    void runs() {
        if (run > 0 && run <= 500) {
            System.out.println("The dog it run: " + run);
        } else {
            System.out.println("Dog not can run faster 500 or less 0");

        }
    }
}
