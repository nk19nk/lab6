package Task4;

@Validate(value = String.class)
public class Class4 {
    private String field;

    public String getField() {
        return field;
    }

    public Class4(String field) {
        this.field = field;
    }
}
