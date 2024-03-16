
public class TyreGunner extends PitCrewTeam {

    public TyreGunner(String name, String lastName, int age, String rol, boolean worksForA,
                     boolean worksForB, boolean worksForBoth) {
        super(name, lastName, age, rol, worksForA, worksForB, worksForBoth);
    }
    public void hablar(){
        System.out.println("Soy un tyre gunner, mi labor es utilizar un pistola para quitar y colocar las " +
                "tuercas de las ruedas. \n");
    }
}
