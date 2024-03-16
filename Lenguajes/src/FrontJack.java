
public class FrontJack extends PitCrewTeam {
    public FrontJack(String name, String lastName, int age, String rol, boolean worksForA,
                         boolean worksForB, boolean worksForBoth) {

        super(name, lastName, age, rol, worksForA, worksForB, worksForBoth);
    }

    public void hablar(){
        System.out.println("Soy un front Jack, mi labor es levantar la parte frontal del coche para que " +
                "se le puedan colocar la llantas facilmente. \n");
    }
}
