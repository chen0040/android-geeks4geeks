package chen0040.github.com.androidgeeks4geeks.enums;

/**
 * Created by chen0 on 25/8/2017.
 */

public enum Topic {
    /* Algorithms */
    BitwiseAlgorithms(0, "Bitwise Algorithms", "bitwise_algorithms");

    private final int value;
    private final String description;
    private final String folder;

    Topic(int value, String description, String folder) {
        this.value = value;
        this.description = description;
        this.folder = folder;
    }

    public int value() {
        return value;
    }

    public String folder() { return folder; }

    @Override
    public String toString() {
        return description;
    }

    public static Topic getEnum(String value) {
        for(Topic v : values())
            if(v.toString().equalsIgnoreCase(value)) return v;
        throw new IllegalArgumentException();
    }
}
