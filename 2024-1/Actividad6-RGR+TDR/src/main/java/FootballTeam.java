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

    /*
    @Override
    public int compareTo(FootballTeam otherTeam) {
        if(gamesWon > otherTeam.gamesWon){
            return 1;
        }else if(gamesWon < otherTeam.gamesWon){
            return -1;
        }
        //return 23425352;
        return 0;
    }
    */

    @Override
    public int compareTo(FootballTeam otherTeam) {
        return gamesWon- otherTeam.gamesWon;
    }
}
