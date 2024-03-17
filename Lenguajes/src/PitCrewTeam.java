import java.util.ArrayList;

public class PitCrewTeam {
    private ArrayList<PitCrewMember> ListPitCrewMember;

    public PitCrewTeam(ArrayList<PitCrewMember> ListPitCrewMember) {
        this.ListPitCrewMember = ListPitCrewMember;
    }


    public static void printInformation() {
        for (PitCrewTeam member : membersList) {
            System.out.println("Nombre: " + member.getName());
            System.out.println("Apellido: " + member.getLastName());
            System.out.println("Edad: " + member.getAge());
            System.out.println("Rol: " + member.getRol());
            if (member.getWorksForA()) {
                System.out.println("Trabaja para A");
            }
            if (member.getWorksForB()) {
                System.out.println("Trabaja para B");
            }
            if (member.getWorksForBoth()) {
                System.out.println("Trabaja para ambos");
            }
            System.out.println();
        }
    }

    private boolean validateAge(int edad) {
        return edad >= 18 && edad <= 60;
    }
}
