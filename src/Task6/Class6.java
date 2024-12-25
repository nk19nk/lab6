package Task6;

@Cache(value = {"value1", "value2", "value3"})
public class Class6 {
    private String field;

    public String getField() {
        return field;
    }

    public Class6(String field) {
        this.field = field;
    }
}
