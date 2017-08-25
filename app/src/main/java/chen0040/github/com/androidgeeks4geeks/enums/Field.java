package chen0040.github.com.androidgeeks4geeks.enums;

/**
 * Created by chen0 on 25/8/2017.
 */

public enum Field {
    DataStructure(0, "Data Structure"),
    Algorithm(1, "Algorithms"),
    ComplexityAnalysis(2, "Algorithm Complexity");

    private final int value;
    private final String description;
    Field(int value, String description) {
        this.value = value;
        this.description = description;
    }
    public int value() {
        return value;
    }

    @Override
    public String toString() {
        return description;
    }

    public static Field getEnum(String value) {
        for(Field v : values())
            if(v.toString().equalsIgnoreCase(value)) return v;
        throw new IllegalArgumentException();
    }
}
