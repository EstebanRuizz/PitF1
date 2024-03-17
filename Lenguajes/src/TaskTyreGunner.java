
public class TaskTyreGunner extends PitCrewTeam {

    public TaskTyreGunner(String name, String lastName, int age, String rol, boolean worksForA,
            boolean worksForB, boolean worksForBoth) {
        super(name, lastName, age, rol, worksForA, worksForB, worksForBoth);
    }

    public void speak() {
        System.out.println("Soy un tyre gunner, mi labor es utilizar una pistola para quitar y colocar las " +
                "tuercas de las ruedas. \n");
    }

    public void checkCarStatus(boolean errorColocationWheel, boolean engineFailure, boolean securityFailed) {
        if (errorColocationWheel || engineFailure || securityFailed) {
            System.out.println("¡Se detectó un problema que requiere detener el automóvil de inmediato!\n");
        } else {
            System.out.println("No se detectaron problemas que requieran detener el automóvil. Puede continuar.\n");
        }
    }
    
}
