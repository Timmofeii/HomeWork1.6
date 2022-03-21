public class Cat extends Animals {
    @Override
    void newLife() {
        countCat++;
        System.out.println(countCat + " Cat");

    }

    @Override
    void swim() {
        System.out.println("Cat can't swimming");
    }

    @Override
    void runs() {
        if (run > 0 && run <= 200) {
            System.out.println("The cat it run: " + run);

        } else {
            System.out.println("Cat can't moving faster > 200 or lees < 0");
         }


    }
}