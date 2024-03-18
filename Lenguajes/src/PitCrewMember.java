public class PitCrewMember {
    private int age;
    private String rol;
    private String name;
    private String lastName;
    private String worksFor;

    public PitCrewMember(String name, String lastName, int age, String rol, String inWorksFor) {
        this.age = age;
        this.rol = rol;
        this.name = name;
        this.lastName = lastName;
        this.worksFor = inWorksFor;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        if (age > 100) {
            this.age = 100;
        } else if (age < 1) {
            this.age = 1;
        }
    }

    public String getRol() {
        return this.rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getWorksFor() {
        return this.worksFor;
    }

    public void setWorksFor(String inWorksFor) {
        this.worksFor = inWorksFor;
    }
}
