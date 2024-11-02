class Animal{

    public void Location(){
        System.out.println("Animals live in jungle");
    }
    public void Eat(){
        System.out.println("We eat plants & meat ");
    }



}
class Dog extends Animal {

    public void Bark() {
        System.out.println("Bow Bow");
    }

    public void Walking() {
        System.out.println("Can walk");
    }
}

public class InheritanceQuiz {
    public static void main(String[] args) {
        Animal a = new Animal();
       a.Eat();
       a.Location();

       Dog d = new Dog();
       d.Bark();
       d.Walking();


    }
}
