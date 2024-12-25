@Validate(value = String.class)
public class Class4 {
    private String animal;
    private String name;

    public Class4(String animal, String name) {
        this.animal = animal;
        this.name = name;
    }

    public String getAnimal() {
        return animal;
    }

    public String getName() {
        return name;
    }

}
