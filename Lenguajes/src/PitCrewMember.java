public class PitCrewMember {
    private int age;
    private String rol;
    private String name;
    private String lastName;
    private EnumWorksFor worksFor;

    public PitCrewMember(String name, String lastName, int age, String rol, EnumWorksFor WorksFor) {
        this.age = age;
        this.rol = rol;
        this.name = name;
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 100) {
            this.age = 100;
        } else if (age < 1) {
            this.age = 1;
        }
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public EnumWorksFor getWorksFor() {
        return worksFor;
    }

    public void setWorksFor(EnumWorksFor worksFor) {
        this.worksFor = worksFor;
    }
}
