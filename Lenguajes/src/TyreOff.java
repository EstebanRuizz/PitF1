
public class TyreOff extends PitCrewTeam {

    public TyreOff(String name, String lastName, int age, String rol, boolean worksForA,
                     boolean worksForB, boolean worksForBoth) {
        super(name, lastName, age, rol, worksForA, worksForB, worksForBoth);
    }

    public void hablar(){
        System.out.println("Soy un tyre off, mi labor quitar las llantas del coche. \n");
    }
}
