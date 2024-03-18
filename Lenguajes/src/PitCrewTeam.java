import java.util.List;

public class PitCrewTeam {
    protected String pitCrewTaskName;
    protected List<String> taskRequired;
    protected int requiredPitTeamMembers;
    private List<PitCrewMember> listPitCrewMember;

    public PitCrewTeam() {
        this.addRequiredTasks();
    }

    public void addListOfPitCrewMember(List<PitCrewMember> listPitCrewMember) {
        for (PitCrewMember pitCrewMember : listPitCrewMember) {
            if (this.validateAge(pitCrewMember.getAge())) {
                this.listPitCrewMember.add(pitCrewMember);
            } else {
                System.out.println("No es posible agregar por edad: " + pitCrewMember.getName());
            }
        }
    }

    protected void addRequiredTasks() {
        this.taskRequired.add("Tyre on");
        this.taskRequired.add("Rear jack");
        this.taskRequired.add("Side jack");
        this.taskRequired.add("Front jack");
        this.taskRequired.add("Front wing flap adjust");
    }

    public void printInformation() {
        if (this.listPitCrewMember != null) {
            for (PitCrewMember pitCrewMember : this.listPitCrewMember) {
                System.out.println("age: " + pitCrewMember.getAge());
                System.out.println("rol: " + pitCrewMember.getRol());
                System.out.println("name: " + pitCrewMember.getName());
                System.out.println("lastName: " + pitCrewMember.getLastName());
                System.out.println("worksFor: " + pitCrewMember.getWorksFor().toString());
                System.out.println();
            }
        } else {
            System.out.println("La Lista PitCrewMember esta vacia");
        }
    }

    private boolean validateAge(int age) {
        return age >= 18 && age <= 60;
    }
}
