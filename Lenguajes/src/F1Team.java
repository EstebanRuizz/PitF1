public class F1Team {
    private String name;
    private int foundationYear;
    private int budget;
    private int trophies;

    public F1Team(String name, int foundationYear, int budget, int trophies) {
        this.name = name;
        this.foundationYear = foundationYear;
        this.budget = budget;
        this.trophies = trophies;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setFoundationYear(int foundationYear) {
        this.foundationYear = foundationYear;
    }

    public int getFoundationYear() {
        return foundationYear;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    public int getBudget() {
        return budget;
    }

    public void setTrophies(int trophies) {
        this.trophies = trophies;
    }

    public int getTrophies() {
        return trophies;
    }

    public void economyOfTeam() {
        if (this.getBudget() > 0 && this.getBudget() < 50000000) {
            System.out.println("El presupuesto del equipo es bajo, hay que limitar gastos.");
        } else if (this.getBudget() >= 50000000 && this.getBudget() < 100000000) {
            System.out.println("El presupuesto del equipo es medio, se permiten gastos controlados.");
        } else if (this.getBudget() >= 100000000 && this.getBudget() < 135000000) {
            System.out.println("El presupuesto del equipo es alto, se permiten gastos ambiciosos.");
        } else if (this.getBudget() >= 135000000) {
            System.out.println("El presupuesto del equipo supera el máximo establecido por la normativa," +
                    "hay que recortar presupuesto.");
        } else {
            System.out.println("El presupuesto ingresado no tiene ningún sentido.");
        }
    }

    public void calculateYearsInCompetition() {
        int currentYear = 2024;
        int yearsInCompetition = currentYear - foundationYear;
        if (foundationYear <= currentYear && foundationYear >= 1950) {
            System.out.println("El equipo lleva compitiendo " + yearsInCompetition + " años.");
        } else {
            System.out.println("El año de fundación del equipo no es válido.");
        }
    }
}
