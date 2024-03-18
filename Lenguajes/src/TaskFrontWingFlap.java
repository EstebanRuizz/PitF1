public class TaskFrontWingFlap extends PitCrewTeam {
    private int tireWear = 30;
    private int fuelLevel = 20;
    private boolean rain = true;

    public TaskFrontWingFlap() {
        super();
        this.requiredPitTeamMembers = 2;
    }

    public void speak() {
        System.out.println("Soy un Front Wing Flap Adjust, mi labor es aplicar cambios " +
                "aerodinámicos al alerón delantero del coche. \n");
    }

    public void verifyTrackConditions(int tireWear, int fuelLevel, boolean rain) {
        if (rain == this.getRain()) {
            System.out.println("Está lloviendo. Se recomienda usar neumáticos con mayor agarre.");
        } else {
            System.out.println("No se presentan problemas de agarre por lluvia.");
        }

        if (tireWear >= this.getTireWear()) {
            System.out.println("Desgaste de neumáticos alto. Se recomienda aumentar el agarre delantero.");
        } else {
            System.out.println("Desgaste de neumáticos dentro de los límites aceptables.");
        }

        if (fuelLevel < this.getFuelLevel()) {
            System.out.println("Nivel de combustible bajo. Se recomienda mejorar la eficiencia aerodinámica.");
        } else {
            System.out.println("Nivel de combustible suficiente.");
        }
    }

    public void setTireWear(int tireWear) {
        this.tireWear = tireWear;
    }

    // Getter para tireWear
    public int getTireWear() {
        return tireWear;
    }

    // Setter para fuelLevel
    public void setFuelLevel(int fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

    // Getter para fuelLevel
    public int getFuelLevel() {
        return fuelLevel;
    }

    // Setter para rain
    public void setRain(boolean rain) {
        this.rain = rain;
    }

    // Getter para rain
    public boolean getRain() {
        return rain;
    }
}