package chen0040.github.com.androidgeeks4geeks;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.KeyEvent;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import chen0040.github.com.androidgeeks4geeks.enums.Field;
import chen0040.github.com.androidgeeks4geeks.enums.Topic;
import chen0040.github.com.androidgeeks4geeks.fragments.FieldFragment;
import chen0040.github.com.androidgeeks4geeks.fragments.FragmentMediator;
import chen0040.github.com.androidgeeks4geeks.fragments.MainActivityFragment;
import chen0040.github.com.androidgeeks4geeks.fragments.SolutionFragment;
import chen0040.github.com.androidgeeks4geeks.fragments.TopicFragment;
import chen0040.github.com.androidgeeks4geeks.models.Solution;

public class MainActivity extends AppCompatActivity implements FragmentMediator {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gotoHome();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (event.getAction() == KeyEvent.ACTION_DOWN) {
            switch (keyCode) {
                case KeyEvent.KEYCODE_BACK:
                    goBack();
                    return true;
            }

        }
        return super.onKeyDown(keyCode, event);
    }

    private void clearBackStack()
    {
        FragmentManager fm = getSupportFragmentManager();
        int backStackCount = fm.getBackStackEntryCount();
        for(int i = 0; i < backStackCount; ++i) {
            fm.popBackStack();
        }
    }

    @Override
    public void goBack(){
        Fragment fragment = getActiveFragment();
        if(fragment == null) {
            return;
        }

        if(getSupportFragmentManager().getBackStackEntryCount() > 1) {
            getSupportFragmentManager().popBackStack();
        } else {
            gotoHome();
        }
    }

    @Override
    public void gotoTopic(Field field, Topic topic) {
        TopicFragment fragment = new TopicFragment();
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        fragment.setMediator(this);

        Bundle bundle = new Bundle();
        bundle.putString("field", field.toString());
        bundle.putString("topic", topic.toString());
        fragment.setArguments(bundle);

        ft.replace(R.id.content_frame, fragment, TopicFragment.TAG);
        ft.addToBackStack(TopicFragment.TAG);
        ft.commit();
    }

    @Override
    public void gotoSolution(Solution solution) {
        SolutionFragment fragment = new SolutionFragment();
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        fragment.setMediator(this);

        Field field = solution.getField();
        Topic topic = solution.getTopic();
        String filename = solution.getFilename();
        String name = solution.getName();
        String category = solution.getCategory();

        Bundle bundle = new Bundle();
        bundle.putString("field", field.toString());
        bundle.putString("topic", topic.toString());
        bundle.putString("name", name);
        bundle.putString("filename", filename);
        bundle.putString("category", category);
        fragment.setArguments(bundle);

        ft.replace(R.id.content_frame, fragment, SolutionFragment.TAG);
        ft.addToBackStack(SolutionFragment.TAG);
        ft.commit();
    }

    public Fragment getActiveFragment() {
        if (getSupportFragmentManager().getBackStackEntryCount() == 0) {
            return null;
        }
        String tag = getSupportFragmentManager().getBackStackEntryAt(getSupportFragmentManager().getBackStackEntryCount() - 1).getName();
        return getSupportFragmentManager().findFragmentByTag(tag);
    }

    @Override public void gotoHome(){
        clearBackStack();

        MainActivityFragment fragment = new MainActivityFragment();
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        fragment.setMediator(this);

        ft.replace(R.id.content_frame, fragment, MainActivityFragment.TAG);

        ft.addToBackStack(MainActivityFragment.TAG);
        ft.commit();
    }



    @Override
    public void gotoField(Field field) {
        FieldFragment fragment = new FieldFragment();
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        fragment.setMediator(this);

        Bundle bundle = new Bundle();
        bundle.putString("field", field.toString());
        fragment.setArguments(bundle);

        ft.replace(R.id.content_frame, fragment, FieldFragment.TAG);
        ft.addToBackStack(FieldFragment.TAG);
        ft.commit();
    }
}
