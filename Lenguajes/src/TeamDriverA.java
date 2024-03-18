import java.util.ArrayList;
import java.util.List;

public class TeamDriverA extends TaskFrontJack {

    private List<PitCrewMember> listExclusivePitCrewMembers = new ArrayList<>();
    private String teamName;
    private String carColor;
    private int numberOfRaces;

    public TeamDriverA(String teamName, String carColor, int numberOfRaces) {
        this.teamName = teamName;
        this.carColor = carColor;
        this.numberOfRaces = numberOfRaces;
    }

    public void showExclusivePitCrewMembers() {
        for (PitCrewMember pitCrewMember : this.listExclusivePitCrewMembers) {
            System.out.println(pitCrewMember.getName());
        }
    }

    public void addExclusivePitCrewMembers(ArrayList<PitCrewMember> listPitCrewMember) {
        for (int i = 0; i < listPitCrewMember.size(); i++) {
            PitCrewMember pitCrewMember = listPitCrewMember.get(i);
            if (pitCrewMember.getWorksFor().equals("TEAM_A")) {
                this.listExclusivePitCrewMembers.add(pitCrewMember);
            }
        }
    }
    
    public void getSpecializedTechnique() {
        this.speak();
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getCarColor() {
        return carColor;
    }

    public void setCarColor(String carColor) {
        this.carColor = carColor;
    }

    public int getNumberOfRaces() {
        return numberOfRaces;
    }

    public void setNumberOfRaces(int numberOfRaces) {
        this.numberOfRaces = numberOfRaces;
    }

    public void getAllTeamInfo() {
        this.teamInfo();
    }

    private String teamInfo() {
        return "Nombre de equipo: " + this.teamName + "\nColor de auto: " + this.carColor
                + "\nNumero de carreras realizadas: " + this.numberOfRaces;
    }

    public void changeCarColor(String newColor) {
        if (newColor != null && !newColor.isEmpty()) {
            this.carColor = newColor;
            System.out.println("El color del auto ha sido cambiado a: " + newColor);
        } else {
            System.out.println("Error: El nuevo color no puede estar vacío.");
        }
    }
}
