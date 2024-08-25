public class SGTeam {
    private int team; //number-designation of team
    private String[] members; //members of team
    private boolean offworld; //is the team on a mission?

    public SGTeam(int team, String[] members, boolean offworld) {
        this.team = team;
        this.members = members;
        this.offworld = offworld;
    }

    //getters and setters
    public int getTeam() {
        return team;
    }
    public String[] getMembers() {
        return members;
    }
    public boolean isOffworld() {
        return offworld;
    }
    public void setTeam(int team) {
        this.team = team;
    }
    public void setMembers(String[] members) {
        this.members = members;
    }
    public void setOffworld(boolean offworld) {
        this.offworld = offworld;
    }

    //returns number of team members
    public int getMany() {
        return members.length;
    }

    @Override
    public String toString() {
        String memstr = String.join(", ", this.members);
        return "SG-" + team + ", members= " + memstr + ", offworld= " + offworld;
    }
}
