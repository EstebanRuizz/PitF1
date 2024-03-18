public class TaskSideJack extends PitCrewTeam {

    
    public TaskSideJack() {
        super(null); 
    }
    
    public void speak(){
        System.out.println("Soy un side jack, mi labor es estabilizar el carro cuando este es levantado. \n");
    }
    
    public void keepTheStability(boolean changesPneumaticsInProcess, boolean reparationInProcess, boolean frontJackActivated) {
        if (changesPneumaticsInProcess || reparationInProcess || frontJackActivated) {
            System.out.println("El coche se mantiene estable durante el cambio de neumáticos, la reparación del ala delantera o el uso del front jack.\n");
        } else {
            System.out.println("No es necesario mantener la estabilidad del coche en este momento.\n");
        }
    }
}
