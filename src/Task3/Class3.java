package Task3;

@Tostring(value = "YES")
public class Class3 {
    @Tostring(value = "NO")
    private String field;

    public Class3() {
    }

    public Class3(String field) {
        this.field = field;
    }

    public String getField() {
        return field;
    }

    @Override
    public String toString() {
        return "аннотация с ToString: " + field;
    }
}
