import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class League {
    private final static ArrayList <Team> teams = new ArrayList <Team> ();
    private final static HashMap <String, String> matches = new HashMap <String, String> ();
    
    
    public static void addTeam (Team parameter) {
        teams.add(parameter);
    }
    
    
    public static void addMatch (String name, String result) {
        matches.put(name,result);
    }
    
    
    public static ArrayList <Team> getTeams () {
        Collections.sort(teams);
        return teams;
    }
    
    
    public static HashMap <String, String> getMatches () {
        return matches;
    }
}
