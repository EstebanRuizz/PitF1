import java.util.ArrayList;

public class PitCrewTeam {
    protected String PitCrewTaskName;
    private ArrayList<PitCrewMember> ListPitCrewMember;

    public PitCrewTeam(ArrayList<PitCrewMember> ListPitCrewMember) {
        for (PitCrewMember pitCrewMember : ListPitCrewMember) {
            if (this.validateAge(pitCrewMember.getAge())) {
            } else {
                System.out.println("No es posible agregar por edad: " + pitCrewMember.getName());
            }
        }
    }

    public void printInformation() {
        for (PitCrewMember pitCrewMember : ListPitCrewMember) {
            System.out.println("age: " + pitCrewMember.getAge());
            System.out.println("rol: " + pitCrewMember.getRol());
            System.out.println("name: " + pitCrewMember.getName());
            System.out.println("lastName: " + pitCrewMember.getLastName());
            System.out.println("worksFor: " + pitCrewMember.getWorksFor().toString());
            System.out.println();
        }
    }

    private boolean validateAge(int age) {
        return age >= 18 && age <= 60;
    }
}
