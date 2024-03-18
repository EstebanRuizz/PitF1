
public class TaskTyreOn extends PitCrewTeam {

    public TaskTyreOn() {
        super(null);
    }

    public void speak() {
        System.out.println("Soy un tyre on, mi labor es cargar las llantas y encajarlas en el carro. \n");
    }

    public boolean installTires(int numberOfTires, boolean needTires, boolean newTires) {
        if (needTires && newTires || numberOfTires >= 0 && numberOfTires < 4) {
            return true;
        } else {
            return false;
        }
    }
}
