public class LollipopMan extends PitCrewTeam {

    public LollipopMan(String name, String lastName, int age, String rol, boolean worksForA,
                    boolean worksForB, boolean worksForBoth) {
        super(name, lastName, age, rol, worksForA, worksForB, worksForBoth);
    }


    public void hablar(){
        System.out.println("Soy un lollipop man, mi labor es dar la señal para " +
                "soltar el auto. \n");
    }
}
