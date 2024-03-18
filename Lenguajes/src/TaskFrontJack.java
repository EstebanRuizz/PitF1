import java.util.ArrayList;

public class TaskFrontJack extends PitCrewTeam {
    private int requiredMembers = 2;

    public TaskFrontJack() {
        super();
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
            System.out.println(
                    "El miembro y el pit stop están en condiciones óptimas. No se requiere el uso del miembro de repuesto.");
        }
    }
}
