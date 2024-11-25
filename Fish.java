public class Fish implements Prey,Predator{

    @Override
    public void hunt() {
        System.out.println("Fish is Hunting");
    }
    @Override
    public void flee(){
        System.out.println("Flee Fish");
    }
}
