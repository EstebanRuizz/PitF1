
public class SideJack extends PitCrewTeam {

    public SideJack(String name, String lastName, int age, String rol, boolean worksForA,
                     boolean worksForB, boolean worksForBoth) {
        super(name, lastName, age, rol, worksForA, worksForB, worksForBoth);
    }

    public void hablar(){
        System.out.println("Soy un side jack, mi labor es estabilizar el carro cuando este es levantado. \n");
    }
}
