public class Cat extends Animal implements AnimalStuff {


    public void makeNoise() {
        System.out.println("Meowww...");
    }

    @Override
    public void poop() {
        System.out.println("cheeee");
    }
}
