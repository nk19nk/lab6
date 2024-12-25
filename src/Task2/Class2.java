package Task2;

@Default(value = Class2.class)
public class Class2 {
    private String field;

    public Class2() {
        this.field = "default";
    }

    public String getField() {
        return field;
    }
}
