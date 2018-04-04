package soccerPack;

public class League {
    public static void main(String[] args) {
        //setting up team
        Team realMadridTeam = new Team("Real Madrid");
        realMadridTeam.addPlayer(new Player("Radu Popa"));
        realMadridTeam.addPlayer(new Player("Robin Hood"));
        realMadridTeam.addPlayer(new Player("Robert Daniel"));
        realMadridTeam.addPlayer(new Player("Ramzan Cadirov"));
        realMadridTeam.addPlayer(new Player("Ruslan Ruslanaci"));
        realMadridTeam.addPlayer(new Player("Radion Radionovich"));

        Team parisSaintGermainTeam = new Team("Paris Saint");
        parisSaintGermainTeam.addPlayer(new Player("Peter Mari"));
        parisSaintGermainTeam.addPlayer(new Player("Pavel Dmitich"));
        parisSaintGermainTeam.addPlayer(new Player("Penelope Fabe"));
        parisSaintGermainTeam.addPlayer(new Player("Pipio Francesco"));
        parisSaintGermainTeam.addPlayer(new Player("Pinocchio Lemnar"));
        parisSaintGermainTeam.addPlayer(new Player("Patric Spanchbobovich"));

        Game firstGame = new Game(realMadridTeam , parisSaintGermainTeam);

        firstGame.addGoal(new Goal(realMadridTeam.getName() , "Robert Daniel" , 10.3));
        firstGame.addGoal(new Goal(realMadridTeam.getName() , "Ramzan Cadirov" , 13.7));
        firstGame.addGoal(new Goal(parisSaintGermainTeam.getName() , "Peter Mari" , 20.5));
        firstGame.addGoal(new Goal(parisSaintGermainTeam.getName() , "Penelope Fabe" , 30.6));

        realMadridTeam.showPlayers();
        System.out.println("");
        parisSaintGermainTeam.showPlayers();

        System.out.println("");
        System.out.println("");

        firstGame.showGoals();

        // cel putin 6  at least 3 goals
    }
}
