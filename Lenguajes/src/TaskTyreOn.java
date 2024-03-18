
public class TaskTyreOn extends PitCrewTeam {
    private int numberOfTires = 0;
    private boolean needTires = true;
    private boolean newTires = true;

    public TaskTyreOn() {
        super();
        this.requiredPitTeamMembers = 4;
    }

    public void speak() {
        System.out.println("Soy un tyre on, mi labor es cargar las llantas y encajarlas en el carro. \n");
    }

    public boolean principalAction(int numberOfTires, boolean needTires, boolean newTires) {
        if (numberOfTires == this.getNumberOfTires() || this.getNumberOfTires() < 5 || needTires == this.getNeedTires()
                || newTires == this.getNewTires()) {
            return true;
        } else {
            return false;
        }
    }

    public void setNumberOfTires(int numberOfTires) {
        this.numberOfTires = numberOfTires;
    }

    public int getNumberOfTires() {
        return numberOfTires;
    }

    public void setNeedTires(boolean needTires) {
        this.needTires = needTires;
    }

    public boolean getNeedTires() {
        return needTires;
    }

    public void setNewTires(boolean newTires) {
        this.newTires = newTires;
    }

    public boolean getNewTires() {
        return newTires;
    }
}

