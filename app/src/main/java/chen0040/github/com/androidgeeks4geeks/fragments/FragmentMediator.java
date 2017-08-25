package chen0040.github.com.androidgeeks4geeks.fragments;

import chen0040.github.com.androidgeeks4geeks.enums.Field;

/**
 * Created by chen0 on 25/8/2017.
 */

public interface FragmentMediator {
    void gotoField(Field field);
    void gotoHome();
    void goBack();
}
