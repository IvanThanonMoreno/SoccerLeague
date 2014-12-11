public class Results {
    private int wins;
    private int defeats;
    private int draws;
    
    public Results () {}
    

    public int getWins () {
        return this.wins;
    }

    
    public int getDefeats () {
        return this.defeats;
    }

    
    public int getDraws () {
        return this.draws;
    }
    
    
    public void increasesWins () {
        this.wins++;
    }
    
    
    public void increasesDefeats () {
        this.defeats++;
    }
    
    
    public void increasesDraws () {
        this.draws++;
    }
    
    
    public int getGamesPlayed () {
        return this.wins + this.defeats + this.draws;
    }
    
    
    @Override
    public String toString () {
        return this.getGamesPlayed() + "    " + this.wins + "    " + this.draws + "    " + this.defeats;
    }
}
