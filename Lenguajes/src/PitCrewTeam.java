import java.util.ArrayList;

public class PitCrewTeam {

    private String name;
    private String lastName;
    private int age;
    private String rol;
    private boolean worksForA;
    private boolean worksForB;
    private boolean worksForBoth;
    private static ArrayList<PitCrewTeam> membersList = new ArrayList<>();

    public PitCrewTeam(String name, String lastName, int age, String rol, boolean worksForA,
                       boolean worksForB, boolean worksForBoth){
        this.name = name;
        this.lastName = lastName;
        if (validarEdad(age)){
            this.age = age;
        }
        else {
            throw new IllegalArgumentException("La edad de " + name + " " + lastName +
                    " no está dentro del rango permitido.");

        }
        this.rol = rol;
        this.worksForA = worksForA;
        this.worksForB = worksForB;
        this.worksForBoth = worksForBoth;
        membersList.add(this);

    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getLastName() {
        return lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
    public String getRol() {
        return rol;
    }

    public void setWorksForA(boolean worksForA) {
        this.worksForA = worksForA;
    }
    public boolean getWorksForA() {
        return worksForA;
    }

    public void setWorksForB(boolean worksForB) {
        this.worksForB = worksForB;
    }
    public boolean getWorksForB() {
        return worksForB;
    }

    public void setWorksForBoth(boolean worksForBoth) {
        this.worksForBoth = worksForBoth;
    }
    public boolean getWorksForBoth() {
        return worksForBoth;
    }


    public static void imprimirInformacion() {
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

    private boolean validarEdad(int edad) {
        return edad >= 18 && edad <= 60;
    }
}
