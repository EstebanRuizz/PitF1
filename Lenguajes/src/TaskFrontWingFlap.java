import java.util.ArrayList;

public class TaskFrontWingFlap extends PitCrewTeam {
    private int requiredMembers = 2;

    public TaskFrontWingFlap() {
        super(null);
    }

    public void speak() {
        System.out.println("Soy un Front Wing Flap Adjust, mi labor es aplicar cambios " +
                "aerodinámicos al alerón delantero del coche. \n");
    }

    public void verifyTrackConditions(int tireWear, int fuelLevel, boolean rain) {
        if (rain) {
            System.out.println("Está lloviendo. Se recomienda usar neumáticos con mayor agarre.");
        } else {
            System.out.println("No se presentan problemas de agarre por lluvia.");
        }

        if (tireWear >= 30 && tireWear < 100) {
            System.out.println("Desgaste de neumáticos alto. Se recomienda aumentar el agarre delantero.");
        } else {
            System.out.println("Desgaste de neumáticos dentro de los límites aceptables.");
        }

        if (fuelLevel < 20) {
            System.out.println("Nivel de combustible bajo. Se recomienda mejorar la eficiencia aerodinámica.");
        } else {
            System.out.println("Nivel de combustible suficiente.");
        }
    }

}
