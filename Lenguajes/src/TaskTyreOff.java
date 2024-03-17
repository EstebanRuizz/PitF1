
public class TaskTyreOff extends PitCrewTeam {

    public TaskTyreOff(String name, String lastName, int age, String rol, boolean worksForA,
            boolean worksForB, boolean worksForBoth) {
        super(name, lastName, age, rol, worksForA, worksForB, worksForBoth);
    }

    public void speak() {
        System.out.println("Soy un tyre off, mi labor es quitar las llantas del coche. \n");
    }

    public boolean remove(int numberOfTires, boolean tireWorn, boolean improveTire) {
        if (tireWorn || improveTire) {
            return true;
        } else if (numberOfTires <= 0 ) {
            return false;
        } else {
            return false;
        }
    }
}
