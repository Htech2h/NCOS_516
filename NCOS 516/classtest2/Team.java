package classtest2;

public class Team {
    String schoolName;
    String sport;
    String teamName;
    public final static String Motto = "Sportmanship";

    Team(String schoolName, String sport, String teamName) {
        this.schoolName = schoolName;
        this.sport = sport;
        this.teamName = teamName;
    }

    String getSchoolName(){
        return this.schoolName;
    }
    String getSport(){
        return this.sport;
    }
    String getTeamName(){
        return this.teamName;
    }
}
