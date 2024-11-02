public class MainAnimalAndDog {
    public static void main(String[] args) {
        Animal__Inheritance animalInheritance = new Animal__Inheritance("Animal", 1, 1, 5, 5);

        Dog_Inheritance dogInheritance = new Dog_Inheritance("Yorkie", 8, 20, 2, 4, 1, 20, "Long silky");
        dogInheritance.eat1();
//   dogInheritance.walk();
        dogInheritance.run();
    }
}
