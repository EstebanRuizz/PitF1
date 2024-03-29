
public class TaskLollipop extends PitCrewTeam {
    private boolean vehiclesPresents = true; 
    private boolean personalPresent = true;
    private boolean carReady = true;


    public TaskLollipop() {
        super();
        this.requiredPitTeamMembers = 1;
    }

    public void speak() {
        System.out.println("Soy un Lollipop Man, mi labor es dar la señal para " +
                "soltar el auto. \n");
    }

    public void principalAction(boolean vehiclesPresents, boolean personalPresent, boolean carReady) {
        if (vehiclesPresents == this.getVehiclesPresents() || personalPresent == this.getPersonalPresent()) {
            System.out.println("¡Atención! Hay otros vehículos o personas presentes en la calle de boxes.");
        } else if (!carReady == this.getCarReady()) {
            System.out.println("El carro aún no está listo para salir.");
        } else {
            System.out.println("No se detectan riesgos potenciales. Se procede a liberar al conductor con seguridad.");
        }
    }

    public void setVehiclesPresents(boolean vehiclesPresents) {
        this.vehiclesPresents = vehiclesPresents;
    }

    public boolean getVehiclesPresents() {
        return vehiclesPresents;
    }

    public void setPersonalPresent(boolean personalPresent) {
        this.personalPresent = personalPresent;
    }

    public boolean getPersonalPresent() {
        return personalPresent;
    }

    public void setCarReady(boolean carReady) {
        this.carReady = carReady;
    }

    public boolean getCarReady() {
        return carReady;
    }
}
