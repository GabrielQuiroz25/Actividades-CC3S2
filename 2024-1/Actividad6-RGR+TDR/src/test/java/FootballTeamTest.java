import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;



public class FootballTeamTest {
    //private static final int THREE_GAMES_WON = 3;
    /*
    @Test
    void constructorShouldSetGamesWon() {
        FootballTeam team = new FootballTeam(3);
        //assertThat(team.getGamesWon()).isEqualTo(3);
        assertThat(team.getGamesWon())
                .as("number of games won")
                .isEqualTo(3);
    }
    */

    /*
    @Test
    void constructorShouldSetGamesWon() {
        FootballTeam team = new FootballTeam(THREE_GAMES_WON);
        //assertThat(team.getGamesWon()).isEqualTo(3);
        assertThat(team.getGamesWon())
                .as("number of games won")
                .isEqualTo(THREE_GAMES_WON);
    }
    */

    @ParameterizedTest
    @ValueSource(ints = {0,1,3,10})
    void constructorShouldSetGamesWon(int nbOfGamesWon) {
        FootballTeam team = new FootballTeam(nbOfGamesWon);
        assertThat(team.getGamesWon())
                .as("number of games won")
                .isEqualTo(nbOfGamesWon);
    }

    @ParameterizedTest
    @ValueSource(ints = {-1,-10})
    void constructorShouldThrowExceptionForIllegalGamesNb(int illegalNbOfGames) {
       assertThatExceptionOfType(IllegalArgumentException.class)
               .as("Lanza una Excepción: IllegalArgumentException")
               .isThrownBy(()->{new FootballTeam(illegalNbOfGames);});
    }

    private static final int ANY_NUMBER = 123;

    @Test
    void shouldBePossibleToCompareTeams(){
        FootballTeam team = new FootballTeam(ANY_NUMBER);
        assertThat(team)
                .as("Son comparables")
                .isInstanceOf(Comparable.class);
    }

    @Test
    void teamsWithMoreMatchesWonShouldBeGreather(){
        FootballTeam team_2 = new FootballTeam(2);
        FootballTeam team_3 = new FootballTeam(3);
        assertThat(team_3.compareTo(team_2))
                .as("Comparación de equipo mayor con equipo menor")
                .isGreaterThan(0);
    }

    @Test
    void teamsWithLessMatchesWonShouldBeLesser(){
        FootballTeam team_2 = new FootballTeam(2);
        FootballTeam team_3 = new FootballTeam(3);
        assertThat(team_2.compareTo(team_3))
                .as("Comparación de equipo menor con equipo mayor")
                .isLessThan(0);
    }

    @Test
    void teamsWithSameNumberOfMatchesWonShouldBeEqual(){
        FootballTeam A = new FootballTeam(2);
        FootballTeam B = new FootballTeam(2);
        assertThat(A.compareTo(B))
                .as("Comparación de equipos iguales")
                .isEqualTo(0);
    }



}

