package Task2;

@Default(value = Class2.class)
public class Class2 {
    private String field;

    public String getField() {
        return field;
    }

    public Class2(String field) {
        this.field = field;
    }
}
