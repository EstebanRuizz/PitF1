
public class FrontWingFlapAdjust extends PitCrewTeam {

    public FrontWingFlapAdjust(String name, String lastName, int age, String rol, boolean worksForA,
                    boolean worksForB, boolean worksForBoth) {
        super(name, lastName, age, rol, worksForA, worksForB, worksForBoth);
    }

    public void hablar(){
        System.out.println("Soy un front wing flap adjust, mi labor es aplicar cambios " +
                "aerodinámicos al alerón delantero del carro. \n");
    }
}
