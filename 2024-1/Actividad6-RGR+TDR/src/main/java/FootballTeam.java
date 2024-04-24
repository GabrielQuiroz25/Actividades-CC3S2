/*
public class FootballTeam {
    public FootballTeam(int gamesWon){

    }

    public int getGamesWon() {
        return 3;
    }
}
*/
/*
public class FootballTeam {
    private int gamesWon;
    public FootballTeam(int gamesWon){
        this.gamesWon = gamesWon;
    }

    public int getGamesWon() {
        return gamesWon;
    }
}
*/


public class FootballTeam implements Comparable<FootballTeam>{
    private int gamesWon;
    public FootballTeam(int gamesWon){

        if(gamesWon<0){
            throw new IllegalArgumentException(
                    "Not possible to have less than 0 games won!! -> (was: " + gamesWon + " )"
                    );
        }
        this.gamesWon = gamesWon;
    }

    public int getGamesWon() {
        return gamesWon;
    }

    @Override
    public int compareTo(FootballTeam otherTeam) {
        return 0;
    }
}
