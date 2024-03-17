import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        F1Team Equipo1 = new F1Team("Eafun", 1977, 87000000, 6);

        boolean worksForA = true;
        boolean worksForB = true;
        boolean worksForBoth = true;

        ArrayList<PitCrewMember> ListPitCrewMember = new ArrayList<>();

        ListPitCrewMember.add(new PitCrewMember("Juan", "García", 28, "Tyre on",                   EnumWorksFor.TEAM_A));
        ListPitCrewMember.add(new PitCrewMember("María", "Martínez", 30, "Front wing flap adjust", EnumWorksFor.TEAM_A));
        ListPitCrewMember.add(new PitCrewMember("Luis", "Hernández", 25, "Front jack",             EnumWorksFor.TEAM_A));
        ListPitCrewMember.add(new PitCrewMember("Ana", "Gómez", 32, "Rear jack",                   EnumWorksFor.TEAM_A));
        ListPitCrewMember.add(new PitCrewMember("Pablo", "López", 27, "Side jack",                 EnumWorksFor.TEAM_A));
        ListPitCrewMember.add(new PitCrewMember("Sofía", "Díaz", 29, "Tyre on",                    EnumWorksFor.TEAM_B ));
        ListPitCrewMember.add(new PitCrewMember("David", "Rojas", 31, "Front jack",                EnumWorksFor.TEAM_B ));
        ListPitCrewMember.add(new PitCrewMember("Laura", "Jiménez", 26, "Rear jack",               EnumWorksFor.TEAM_B ));
        ListPitCrewMember.add(new PitCrewMember("Javier", "Romero", 33, "Side jack",               EnumWorksFor.TEAM_B ));
        ListPitCrewMember.add(new PitCrewMember("Carolina", "Pérez", 28, "Front wing flap adjust", EnumWorksFor.TEAM_B ));
        ListPitCrewMember.add(new PitCrewMember("Diego", "Rodríguez", 29, "Tyre gunner",           EnumWorksFor.BOTH));
        ListPitCrewMember.add(new PitCrewMember("Elena", "Fernández", 30, "Tyre gunner",           EnumWorksFor.BOTH));
        ListPitCrewMember.add(new PitCrewMember("Adrián", "Gutiérrez", 27, "Tyre gunner",          EnumWorksFor.BOTH));
        ListPitCrewMember.add(new PitCrewMember("Raquel", "Sánchez", 32, "Tyre gunner",            EnumWorksFor.BOTH));
        ListPitCrewMember.add(new PitCrewMember("Rubén", "Ramirez", 25, "Tyre off",                EnumWorksFor.BOTH));
        ListPitCrewMember.add(new PitCrewMember("José", "Ortega", 31, "Tyre off",                  EnumWorksFor.BOTH));
        ListPitCrewMember.add(new PitCrewMember("Pedro", "Martínez", 26, "Tyre off",               EnumWorksFor.BOTH));
        ListPitCrewMember.add(new PitCrewMember("Manuela", "Zapata", 33, "Tyre off",               EnumWorksFor.BOTH));
        ListPitCrewMember.add(new PitCrewMember("Agustín", "Figueroa", 19, "Tyre on",              EnumWorksFor.BOTH));
        ListPitCrewMember.add(new PitCrewMember("Sara", "Ruiz", 18, "Lollipop man",                EnumWorksFor.BOTH));
        
        PitCrewTeam.printInformation();
        Equipo1.economyOfTeam();
        Equipo1.calculateYearsInCompetition();
    }
}
