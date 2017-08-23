package chen0040.github.com.androidgeeks4geeks;

import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View mainView = inflater.inflate(R.layout.fragment_main, container, false);

        WebView browser = (WebView)mainView.findViewById(R.id.webview);
        browser.clearCache(true);
        browser.clearHistory();
        browser.getSettings().setJavaScriptEnabled(true);
        browser.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            if (0 != (getActivity().getApplicationInfo().flags & ApplicationInfo.FLAG_DEBUGGABLE))
            { WebView.setWebContentsDebuggingEnabled(true); }
        }

        String html_string = "<html><head><link rel=\"stylesheet\" type=\"text/css\" href=\"file:///android_asset/hello.css\" /></head><body><div id=\"hw\">Hello World</div><script type=\"text/javascript\" src=\"file:///android_asset/hello.js\"></script></body></html>";
        browser.loadDataWithBaseURL("file:///android_asset/", html_string, "text/html", "UTF-8", "");

        return mainView;
    }
}
