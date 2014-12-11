public class Goals {
    private int goalsFor;
    private int goalsAgainst;
    
    
    public int getGoalsFor () {
        return this.goalsFor;
    }
    
    
    public int getGoalsAgainst () {
        return this.goalsAgainst;
    }
    
    
    public int getGoalsDifference () {
        return this.goalsFor - this.goalsAgainst;
    }
    
    
    public void addGoalsFor (int goalsFor) {
        this.goalsFor += goalsFor;
    }
    
    
    public void addGoalsAgainst (int goalsAgainst) {
        this.goalsAgainst += goalsAgainst;
    }
    
    
    @Override
    public String toString () {
        return this.goalsFor + "    " + this.goalsAgainst + "    " + this.getGoalsDifference();
    }
}
