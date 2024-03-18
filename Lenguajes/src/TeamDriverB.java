public class TeamDriverB extends TaskSideJack {
    private String teamName;
    private String carBrand;
    private int numberOfRaces;

    public TeamDriverB(String teamName, String carBrand, int numberOfRaces) {
        this.teamName = teamName;
        this.carBrand = carBrand;
        this.numberOfRaces = numberOfRaces;
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

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
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
        return "Nombre de equipo: " + teamName + "\nMarca de auto: " + carBrand + "\nNumero de carreras realizadas: "
                + numberOfRaces;
    }

    public void changeCarBrand(String newBrand) {
        if (newBrand != null && !newBrand.isEmpty()) {
            this.carBrand = newBrand;
            System.out.println("La marca del vehículo ha sido cambiada a: " + newBrand);
        } else {
            System.out.println("Error: La nueva marca no puede estar vacía.");
        }
    }
}
