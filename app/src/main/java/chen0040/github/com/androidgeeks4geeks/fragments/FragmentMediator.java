package chen0040.github.com.androidgeeks4geeks.fragments;

import chen0040.github.com.androidgeeks4geeks.enums.Field;
import chen0040.github.com.androidgeeks4geeks.enums.Topic;
import chen0040.github.com.androidgeeks4geeks.models.Solution;

/**
 * Created by chen0 on 25/8/2017.
 */

public interface FragmentMediator {
    void gotoField(Field field);
    void gotoHome();
    void goBack();

    void gotoTopic(Field field, Topic topic);

    void gotoSolution(Solution solution);
}
