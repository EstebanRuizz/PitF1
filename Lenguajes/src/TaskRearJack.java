
public class TaskRearJack extends PitCrewTeam {

    public TaskRearJack() {
        super(null);
    }

    public void speak() {
        System.out.println("Soy un rear Jack, mi labor es levantar la parte trasera del coche para que " +
                "se le puedan colocar las llantas fácilmente. \n");
    }

    public void useReplacementRearJack(boolean incapacitated, boolean pitStopFailed, boolean pitStopLost) {
        if (incapacitated || pitStopFailed || pitStopLost) {
            System.out.println("¡Se activa el miembro de repuesto para continuar con el proceso!");
        } else {
            System.out.println(
                    "El miembro y el pit stop están en condiciones óptimas. No se requiere el uso del miembro de repuesto.");
        }
    }
}
