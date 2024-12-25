package Task3;

@Tostring(value = "YES")
public class Class3 {
    private String field;

    public String getField() {
        return field;
    }

    public Class3(String field) {
        this.field = field;
    }

    @Override
    public String toString() {
        return "Вывод для задачи 2.3: " + field;
    }
}
