public class Main {
    public static void main(String[] args) {
        Animals animals = new Animals(2, 5, "Слон");
        Dog dobryak = new Dog();
        dobryak.run = 150;
        dobryak.swim = 15;
        Dog evil = new Dog();
        Cat cate = new Cat();
        cate.run = 200;
        cate.swim = 3;
        cate.swim();
        cate.runs();
        dobryak.swim();
        dobryak.runs();

    }
}
