public class Pokemon {

    String name;
    int level;

    Pokemon(){
        level = 1;
    }
    Pokemon(String pname,int plevel){
        this.name = name;
        this.level = level;
        this.attack();
    }

    void attack(){
        System.out.println(name + " attack! ");
    }
}
