package Task5;

@Two(first = "Example", second = 12)
public class Class5 {
    private String first;
    private int second;

    public Class5(String first, int second) {
        this.first = first;
        this.second = second;
    }

    public int getSecond() {
        return second;
    }

    public String getFirst() {
        return first;
    }
}
