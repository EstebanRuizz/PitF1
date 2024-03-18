import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        F1Team f1Team = new F1Team("Eafun", 1977, 87000000, 6);
        f1Team.economyOfTeam();
        f1Team.calculateYearsInCompetition();

        PitCrewTeam pitCrewTeam = new PitCrewTeam();

        pitCrewTeam.addListOfPitCrewMember(getListOfCrewMembers());
        pitCrewTeam.printInformation();

        TaskTyreOn taskTyreOn = new TaskTyreOn();
        taskTyreOn.speak();
        taskTyreOn.principalAction(4, true, true);
        TaskTyreOff taskTyreOff = new TaskTyreOff();
        taskTyreOff.speak();
        taskTyreOff.principalAction(4, true, true);

        TaskFrontWingFlap taskFrontWingFlap = new TaskFrontWingFlap();
        taskFrontWingFlap.speak();
        taskFrontWingFlap.principalAction(3, 4, true);

        TaskLollipop taskLollipop = new TaskLollipop();
        taskLollipop.speak();
        taskLollipop.principalAction(true, true, true);

        TaskRearJack taskRearJack = new TaskRearJack();
        taskRearJack.speak();
        taskLollipop.principalAction(true, true, true);

        TaskTyreGunner taskTyreGunner = new TaskTyreGunner();
        taskTyreGunner.speak();
        taskTyreGunner.principalAction(true, true, true);

        System.out.println("**********************");
        System.out.println("Creando TeamDriverA");
        TeamDriverA teamDriverA = new TeamDriverA("TeamDriverA", "Red", 100);
        teamDriverA.addExclusivePitCrewMembers(pitCrewTeam.getListPitCrewMember());
        teamDriverA.showExclusivePitCrewMembers();

        TaskFrontJack taskFrontJack = new TaskFrontJack();
        taskFrontJack.speak();
        taskFrontJack.principalAction(true, true, true);

        System.out.println("**********************");
        System.out.println("Creando TeamDriverB");
        TeamDriverB teamDriverB = new TeamDriverB("TeamDriverB", "Mercedez", 95);
        teamDriverB.addExclusivePitCrewMembers(pitCrewTeam.getListPitCrewMember());
        teamDriverB.showExclusivePitCrewMembers();

        TaskSideJack taskSideJack = new TaskSideJack();
        taskSideJack.speak();
        taskSideJack.principalAction(true, true, true);

    }

    public static ArrayList<PitCrewMember> getListOfCrewMembers() {
        ArrayList<PitCrewMember> ListPitCrewMember = new ArrayList<PitCrewMember>();

        ListPitCrewMember.add(new PitCrewMember("Adrián", "Gutiérrez", 27, "Tyre gunner", "BOTH"));
        ListPitCrewMember.add(new PitCrewMember("Diego", "Rodríguez", 29, "Tyre gunner", "BOTH"));
        ListPitCrewMember.add(new PitCrewMember("Elena", "Fernández", 30, "Tyre gunner", "BOTH"));
        ListPitCrewMember.add(new PitCrewMember("Raquel", "Sánchez", 32, "Tyre gunner", "BOTH"));

        ListPitCrewMember.add(new PitCrewMember("José", "Ortega", 31, "Tyre off", "BOTH"));
        ListPitCrewMember.add(new PitCrewMember("Rubén", "Ramirez", 25, "Tyre off", "BOTH"));
        ListPitCrewMember.add(new PitCrewMember("Manuela", "Zapata", 33, "Tyre off", "BOTH"));
        ListPitCrewMember.add(new PitCrewMember("Pedro", "Martínez", 26, "Tyre off", "BOTH"));

        ListPitCrewMember.add(new PitCrewMember("Sofía", "Díaz", 29, "Tyre on", "BOTH"));
        ListPitCrewMember.add(new PitCrewMember("Agustín", "Figueroa", 19, "Tyre on", "BOTH"));
        ListPitCrewMember.add(new PitCrewMember("Juan", "García", 28, "Tyre on", "TEAM_A"));
        ListPitCrewMember.add(new PitCrewMember("Augusto", "Díaz", 29, "Tyre on", "TEAM_B"));

        ListPitCrewMember.add(new PitCrewMember("David", "Rojas", 31, "Front jack", "TEAM_B"));
        ListPitCrewMember.add(new PitCrewMember("Luis", "Hernández", 25, "Front jack", "TEAM_A"));

        ListPitCrewMember.add(new PitCrewMember("Ana", "Gómez", 32, "Rear jack", "TEAM_A"));
        ListPitCrewMember.add(new PitCrewMember("Laura", "Jiménez", 26, "Rear jack", "TEAM_B"));

        ListPitCrewMember.add(new PitCrewMember("Javier", "Romero", 33, "Side jack", "TEAM_B"));
        ListPitCrewMember.add(new PitCrewMember("Pablo", "López", 27, "Side jack", "    "));

        ListPitCrewMember.add(new PitCrewMember("Carolina", "Pérez", 28, "Front wing flap adjust", "TEAM_B"));
        ListPitCrewMember.add(new PitCrewMember("María", "Martínez", 30, "Front wing flap adjust", "TEAM_A"));

        ListPitCrewMember.add(new PitCrewMember("Sara", "Ruiz", 18, "Lollipop man", "BOTH"));

        return ListPitCrewMember;
    }
}
