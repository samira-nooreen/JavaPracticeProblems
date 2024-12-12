
public class Main {
    public static void main(String[] args) {
        League<Team<FootBallPlayer>>footballLeague = new League<>("AFL");
        Team<FootBallPlayer>ade = new Team<>("ade");
        Team<FootBallPlayer>melbourne = new Team<>("Melbourne");
        Team<FootBallPlayer>hawthorn = new Team<>("Hawthorn");
        Team<FootBallPlayer>fremantle = new Team<>("Fremantle");
        Team<BaseballPlayer>baseballPlayerTeam = new Team<>("Chicago Cubs");

        footballLeague.add(ade);
        footballLeague.add(melbourne);
        footballLeague.add(hawthorn);
        footballLeague.add(fremantle);

    }
}