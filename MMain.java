public class MMain {
    public static void main(String[] args) {
//
//        Player player = new Player();
//        player.name = "Tia";
//        player.health=20;
//        player.weapons= "Sword";
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " +player.healthRemaining());
//
//         damage = 11;
//         player.health = 200;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " +player.healthRemaining());


        EnhancedPlayer player = new EnhancedPlayer("Tim",200,"Sword");
        System.out.println("Initial health is "+player.getHitPoints());







    }
}
