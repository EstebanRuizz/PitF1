
public class TaskTyreGunner extends PitCrewTeam {
    private boolean errorColocationWheel = true;
    private boolean engineFailure = true;
    private boolean securityFailed = true;

    public TaskTyreGunner() {
        super();
    }

    public void speak() {
        System.out.println("Soy un tyre gunner, mi labor es utilizar una pistola para quitar y colocar las " +
                "tuercas de las ruedas. \n");
    }

    public void checkCarStatus(boolean errorColocationWheel, boolean engineFailure, boolean securityFailed) {
        if (errorColocationWheel == this.getErrorColocationWheel() || engineFailure == this.getEngineFailure()
                || securityFailed == this.getSecurityFailed()) {
            System.out.println("¡Se detectó un problema que requiere detener el automóvil de inmediato!\n");
        } else {
            System.out.println("No se detectaron problemas que requieran detener el automóvil. Puede continuar.\n");
        }
    }
 
    public void setErrorColocationWheel(boolean errorColocationWheel) {
        this.errorColocationWheel = errorColocationWheel;
    }
 
    public boolean getErrorColocationWheel() {
        return errorColocationWheel;
    }
 
    public void setEngineFailure(boolean engineFailure) {
        this.engineFailure = engineFailure;
    }
 
    public boolean getEngineFailure() {
        return engineFailure;
    }
 
    public void setSecurityFailed(boolean securityFailed) {
        this.securityFailed = securityFailed;
    }
 
    public boolean getSecurityFailed() {
        return securityFailed;
    }
}

