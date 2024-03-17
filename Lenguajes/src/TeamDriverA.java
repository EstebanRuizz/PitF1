public class TeamDriverA{
    private String teamName;
    private String carColor;
    private int numberOfRaces;

    public TeamDriverA(String teamName, String carColor, int numberOfRaces) {
        this.teamName = teamName;
        this.carColor = carColor;
        this.numberOfRaces = numberOfRaces;
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

    private String TeamInfo() {
        return "Nombre de equipo: " + teamName + "\nColor de auto: " + carColor + "\nNumero de carreras realizadas: " + numberOfRaces;
    }
    
    public void changeCarColor(String newColor) {
        if (newColor != null && !newColor.isEmpty()) {
            carColor = newColor;
            System.out.println("El color del auto ha sido cambiado a: " + newColor);
        } else {
            System.out.println("Error: El nuevo color no puede estar vacío.");
        }
    }
}
