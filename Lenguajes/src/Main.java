public class Main {

    public static void main(String[] args) {

        F1Team Equipo1 = new F1Team("Eafun", 1977, 87000000, 6);

        PitCrewTeam member1 = new PitCrewTeam("Juan", "García", 28, "Tyre on", true, false, false);
        PitCrewTeam member2 = new PitCrewTeam("María", "Martínez", 30, "Front wing flap adjust", true, false, false);
        PitCrewTeam member3 = new PitCrewTeam("Luis", "Hernández", 25, "Front jack", true, false, false);
        PitCrewTeam member4 = new PitCrewTeam("Ana", "Gómez", 32, "Rear jack", true, false, false);
        PitCrewTeam member5 = new PitCrewTeam("Pablo", "López", 27, "Side jack", true, false, false);
        PitCrewTeam member6 = new PitCrewTeam("Sofía", "Díaz", 29, "Tyre on", false, true, false);
        PitCrewTeam member7 = new PitCrewTeam("David", "Rojas", 31, "Front jack", false, true, false);
        PitCrewTeam member8 = new PitCrewTeam("Laura", "Jiménez", 26, "Rear jack", false, true, false);
        PitCrewTeam member9 = new PitCrewTeam("Javier", "Romero", 33, "Side jack", false, true, false);
        PitCrewTeam member10 = new PitCrewTeam("Carolina", "Pérez", 28, "Front wing flap adjust", false, true, false);
        PitCrewTeam member11 = new PitCrewTeam("Diego", "Rodríguez", 29, "Tyre gunner", false, false, true);
        PitCrewTeam member12 = new PitCrewTeam("Elena", "Fernández", 30, "Tyre gunner", false, false, true);
        PitCrewTeam member13 = new PitCrewTeam("Adrián", "Gutiérrez", 27, "Tyre gunner", false, false, true);
        PitCrewTeam member14 = new PitCrewTeam("Raquel", "Sánchez", 32, "Tyre gunner", false, false, true);
        PitCrewTeam member15 = new PitCrewTeam("Rubén", "Ramirez", 25, "Tyre off", false, false, true);
        PitCrewTeam member16 = new PitCrewTeam("José", "Ortega", 31, "Tyre off", false, false, true);
        PitCrewTeam member17 = new PitCrewTeam("Pedro", "Martínez", 26, "Tyre off", false, false, true);
        PitCrewTeam member18 = new PitCrewTeam("Manuela", "Zapata", 33, "Tyre off", false, false, true);
        PitCrewTeam member19 = new PitCrewTeam("Agustín", "Figueroa", 19, "Tyre on", false, false, true);
        PitCrewTeam member20 = new PitCrewTeam("Sara", "Ruiz", 18, "Lollipop man", false, false, true);

        PitCrewTeam.imprimirInformacion();
        Equipo1.economia();
    }
}
