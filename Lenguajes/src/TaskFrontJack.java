
public class TaskFrontJack extends PitCrewTeam {

    public TaskFrontJack(String name, String lastName, int age, String rol, boolean worksForA,
            boolean worksForB, boolean worksForBoth) {
        super(name, lastName, age, rol, worksForA, worksForB, worksForBoth);
    }

    public void setIncapacitated(boolean incapacitated) {
    }

    public void setPitStopFailed(boolean pitStopFailed) {
    }

    public void speak() {
        System.out.println("Soy un FrontJack, mi labor es levantar la parte frontal del coche para que " +
                "se le puedan colocar las llantas fácilmente.\n");
    }

    public void useReplacementFrontJack(boolean incapacitated, boolean pitStopFailed, boolean pitStopLost) {
        if (incapacitated || pitStopFailed || pitStopLost) {
            System.out.println("¡Se activa el miembro de repuesto para continuar con el proceso!");
        } else {
            System.out.println("El miembro y el pit stop están en condiciones óptimas. No se requiere el uso del miembro de repuesto.");
        }
    }
}
