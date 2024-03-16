
public class TyreOn extends PitCrewTeam {

    public TyreOn(String name, String lastName, int age, String rol, boolean worksForA,
                  boolean worksForB, boolean worksForBoth) {
        super(name, lastName, age, rol, worksForA, worksForB, worksForBoth);
    }
    public void hablar(){
        System.out.println("Soy un tyre on, mi labor es cargar las llantas y encajarlas en el carro. \n");
    }
}
