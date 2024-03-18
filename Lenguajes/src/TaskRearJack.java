
public class TaskRearJack extends PitCrewTeam {
    private boolean incapacitated = true;
    private boolean pitStopFailed = true;
    private boolean pitStopLost = true;

    public TaskRearJack() {
        super(null);
    }

    public void speak() {
        System.out.println("Soy un rear Jack, mi labor es levantar la parte trasera del coche para que " +
                "se le puedan colocar las llantas fácilmente. \n");
    }

    public void useReplacementRearJack(boolean incapacitated, boolean pitStopFailed, boolean pitStopLost) {
        if (incapacitated == this.getIncapacitated() || pitStopFailed == this.getPitStopFailed()
                || pitStopLost == this.getPitStopLost()) {
            System.out.println("¡Se activa el miembro de repuesto para continuar con el proceso!");
        } else {
            System.out.println(
                    "El miembro y el pit stop están en condiciones óptimas. No se requiere el uso del miembro de repuesto.");
        }
    }

    public void setIncapacitated(boolean incapacitated) {
        this.incapacitated = incapacitated;
    }

        public boolean getIncapacitated() {
        return incapacitated;
    }

        public void setPitStopFailed(boolean pitStopFailed) {
        this.pitStopFailed = pitStopFailed;
    }

        public boolean getPitStopFailed() {
        return pitStopFailed;
    }

        public void setPitStopLost(boolean pitStopLost) {
        this.pitStopLost = pitStopLost;
    }

        public boolean getPitStopLost() {
        return pitStopLost;
    }
}

