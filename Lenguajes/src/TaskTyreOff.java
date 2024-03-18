
public class TaskTyreOff extends PitCrewTeam {
    private int numberOfTires = 4;
    private boolean tireWorn = false;
    private boolean improveTire = false;

    public TaskTyreOff() {
        super(null);
    }

    public void speak() {
        System.out.println("Soy un tyre off, mi labor es quitar las llantas del coche. \n");
    }

    public boolean remove(int numberOfTires, boolean tireWorn, boolean improveTire) {
        if (tireWorn == this.getImproveTire() || improveTire == this.getImproveTire()) {
            return true;
        } else if (numberOfTires == this.getNumberOfTires()) {
            return false;
        } else {
            return true;
        }
    }

    public int getNumberOfTires() {
        return numberOfTires;
    }

    public void setNumberOfTires(int numberOfTires) {
        this.numberOfTires = numberOfTires;
    }

    public boolean getTireWorn() {
        return tireWorn;
    }

    public void setTireWorn(boolean tireWorn) {
        this.tireWorn = tireWorn;
    }

    public boolean getImproveTire() {
        return improveTire;
    }

    public void setImproveTire(boolean improveTire) {
        this.improveTire = improveTire;
    }
}
