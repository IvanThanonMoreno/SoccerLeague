import java.util.HashMap;


public class Team implements Comparable <Team> {

    private final String name;
    private final Results results;
    private final Goals goals;
    private final Points points;

    
    public Team (String name) {
        this.name = name;
        this.results = new Results();
        this.goals = new Goals();
        this.points = new Points();
    }

    
    public String getName () {
        return this.name;
    }
    
    
    public Results getResults () {
        return this.results;
    }
    
    
    public Goals getGoals () {
        return this.goals;
    }
    
    
    public Points getPoints () {
        return this.points;
    }
    
    
    @Override
    public String toString () {
        return this.getName() + "     " + this.getGoals().toString() + "    " + 
               this.getResults().toString() + "    " + this.getPoints().getPoints();
    }
    
    
    @Override
    public int compareTo (Team parameter) {
        //Here, you can choose how you want the teams' list is ordered.
    }
}
