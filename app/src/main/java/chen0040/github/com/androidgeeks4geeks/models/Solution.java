package chen0040.github.com.androidgeeks4geeks.models;

import chen0040.github.com.androidgeeks4geeks.enums.Field;
import chen0040.github.com.androidgeeks4geeks.enums.Topic;

/**
 * Created by chen0 on 25/8/2017.
 */

public class Solution {
    private String filename;
    private String name;
    private Field field;
    private Topic topic;
    private String category;

    public Solution(String category, String name, String filename, Field field, Topic topic) {
        this.name = name;
        this.filename = filename;
        this.field = field;
        this.topic = topic;
    }

    public String getName() {
        return name;
    }

    public String getFilename() {
        return filename;
    }

    public Field getField() {
        return field;
    }

    public Topic getTopic() {
        return topic;
    }

    public String getCategory() {
        return category;
    }
}
