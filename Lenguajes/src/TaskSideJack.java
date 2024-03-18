public class TaskSideJack extends PitCrewTeam {
    private boolean changesPneumaticsInProcess = true;
    private boolean reparationInProcess = true;
    private boolean frontJackActivated = true;

    public TaskSideJack() {
        super(null);
    }

    public void speak() {
        System.out.println("Soy un side jack, mi labor es estabilizar el carro cuando este es levantado. \n");
    }

    public void keepTheStability(boolean changesPneumaticsInProcess, boolean reparationInProcess,
            boolean frontJackActivated) {
        if (changesPneumaticsInProcess == this.getChangesPneumaticsInProcess()
                || reparationInProcess == this.getReparationInProcess()
                || frontJackActivated == this.getFrontJackActivated()) {
            System.out.println(
                    "El coche se mantiene estable durante el cambio de neumáticos, la reparación del ala delantera o el uso del front jack.\n");
        } else {
            System.out.println("No es necesario mantener la estabilidad del coche en este momento.\n");
        }
    }

    public void setChangesPneumaticsInProcess(boolean changesPneumaticsInProcess) {
        this.changesPneumaticsInProcess = changesPneumaticsInProcess;
    }
 
    public boolean getChangesPneumaticsInProcess() {
        return changesPneumaticsInProcess;
    }
 
    public void setReparationInProcess(boolean reparationInProcess) {
        this.reparationInProcess = reparationInProcess;
    }
 
    public boolean getReparationInProcess() {
        return reparationInProcess;
    }
 
    public void setFrontJackActivated(boolean frontJackActivated) {
        this.frontJackActivated = frontJackActivated;
    }
 
    public boolean getFrontJackActivated() {
        return frontJackActivated;
    }
}
