
public class RearJack extends PitCrewTeam {

    public RearJack(String name, String lastName, int age, String rol, boolean worksForA,
                     boolean worksForB, boolean worksForBoth) {
        super(name, lastName, age, rol, worksForA, worksForB, worksForBoth);
    }

    public void hablar(){
        System.out.println("Soy un rear Jack, mi labor es levantar la parte trasera del coche para que " +
                "se le puedan colocar la llantas facilmente. \n");
    }
}
