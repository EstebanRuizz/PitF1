
public class TaskLollipop extends PitCrewTeam {

    public TaskLollipop(String name, String lastName, int age, String rol, boolean worksForA,
            boolean worksForB, boolean worksForBoth) {
        super(name, lastName, age, rol, worksForA, worksForB, worksForBoth);
    }

    public void speak() {
        System.out.println("Soy un Lollipop Man, mi labor es dar la señal para " +
                "soltar el auto. \n");
    }

    public void evaluateRisks(boolean vehiclesPresents, boolean personalPresent, boolean carReady) {
        if (vehiclesPresents || personalPresent) {
            System.out.println("¡Atención! Hay otros vehículos o personas presentes en la calle de boxes.");
        } else if (!carReady) {
            System.out.println("El carro aún no está listo para salir.");
        } else {
            System.out.println("No se detectan riesgos potenciales. Se procede a liberar al conductor con seguridad.");
        }
    }
}
