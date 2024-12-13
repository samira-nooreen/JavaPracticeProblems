import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
      FootBallPlayer joe = new FootBallPlayer("Joe");
      BaseballPlayer pat = new BaseballPlayer("Pat");
      SoccerPlayer beck = new SoccerPlayer("Beck");

      Team<FootBallPlayer>ade = new Team<>("ade");
        ade.addPlayer(joe);
//        ade.addPlayer(pat);
//        ade.addPlayer(beck);

        System.out.println(ade.numPlayer());

        Team<BaseballPlayer>baseballPlayerTeam = new Team<>("Chicago cubs");
        baseballPlayerTeam.addPlayer(pat);

        Team<SoccerPlayer> brokenTeam = new Team<>("won;t work");
        brokenTeam.addPlayer(beck);

        Team<FootBallPlayer>melbourne = new Team<>("Melbourne");
        FootBallPlayer banks = new FootBallPlayer("Gordon");
        melbourne.addPlayer(banks);

        Team<FootBallPlayer>hawthorn = new Team<>("Hawthorn");
        Team<FootBallPlayer>fremantle = new Team<>("Fremantle");

        hawthorn.matchResult(fremantle,1,0);
        hawthorn.matchResult(ade,3,8);

        ade.matchResult(fremantle,2,1);
      //  ade.matchResult(baseballPlayerTeam,1,1);

      System.out.println("Rankings");
      System.out.println(ade.getName() + ": " +ade.ranking());
      System.out.println(melbourne.getName() + ": " +melbourne.ranking());
      System.out.println(fremantle.getName() + ": " +fremantle.ranking());
      System.out.println(hawthorn.getName() + ": " +hawthorn.ranking());

      System.out.println(ade.compareTo(melbourne));
      System.out.println(ade.compareTo(hawthorn));
      System.out.println(hawthorn.compareTo(ade));
      System.out.println(melbourne.compareTo(fremantle));


//      ArrayList<Team>teams;
//      Collections.sort(teams);
    }
}