public class Match {
    private final String name;
    private String result;
    private final Team local, visitor;
    
    
    public Match (Team local, Team visitor) {
        this.name = local.getName() + " - " + visitor.getName();
        this.local = local;
        this.visitor = visitor;   
    }
    
    
    public String getName () {
        return this.name;
    }
    
    
    public String getResultOfMatch () {
        return this.result;
    }

    
    public void provideTheMatchResult (int goalsLocal, int awayGoals) {
        this.result = goalsLocal + "-" + awayGoals;
        dataUpdatesAllTheTeamsInvolved(goalsLocal,awayGoals);
    }

    
    private void dataUpdatesAllTheTeamsInvolved(int goalsLocal, int awayGoals) {
        updatesTheObjectResults(goalsLocal,awayGoals);
        updatesTheObjectGoals(goalsLocal,awayGoals);
        updatesTheObjectPoints(goalsLocal,awayGoals);
    } 
    
    
    private void updatesTheObjectPoints(int goalsLocal, int awayGoals) {
        
        if (goalsLocal > awayGoals) {
            local.getPoints().addPoints(3);
        } else if (goalsLocal < awayGoals) {
            visitor.getPoints().addPoints(3);
        } else {
            local.getPoints().addPoints(1);
            visitor.getPoints().addPoints(1);
        }
        
    }

    
    private void updatesTheObjectGoals(int goalsLocal, int awayGoals) {
        this.local.getGoals().addGoalsFor(goalsLocal);
        this.local.getGoals().addGoalsAgainst(awayGoals);
        this.visitor.getGoals().addGoalsFor(awayGoals);
        this.visitor.getGoals().addGoalsAgainst(goalsLocal);   
    }

    
    private void updatesTheObjectResults(int goalsLocal, int awayGoals) {
        
        if (goalsLocal > awayGoals) {
            this.local.getResults().increasesWins();
            this.visitor.getResults().increasesDefeats();
        } else if (goalsLocal < awayGoals) {
            this.local.getResults().increasesDefeats();
            this.visitor.getResults().increasesWins();
        } else {
            this.local.getResults().increasesDraws();
            this.visitor.getResults().increasesDraws();
        }
        
    }
}
