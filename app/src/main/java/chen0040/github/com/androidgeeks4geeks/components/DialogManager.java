package chen0040.github.com.androidgeeks4geeks.components;

import android.content.Context;
import android.text.InputType;

import com.yarolegovich.lovelydialog.LovelyTextInputDialog;

import chen0040.github.com.androidgeeks4geeks.R;
import chen0040.github.com.androidgeeks4geeks.functions.Consumer;


/**
 * Created by chen0 on 3/7/2017.
 */

public class DialogManager {
    private final Context context;
    public DialogManager(Context context){
        this.context = context;
    }

    public void showInputDialog(String title, String prompt, String initialInput, final Consumer<String> result) {
        new LovelyTextInputDialog(this.context, R.style.EditTextTintTheme)
                .setTopColorRes(R.color.darkDeepOrange)
                .setTitle(title)
                .setMessage(prompt)
                .setInitialInput(initialInput)
                .setIcon(R.drawable.ic_key)
                .setInputFilter(R.string.text_input_error_message, text -> text.matches("\\w+"))
                .setConfirmButton(android.R.string.ok, result::apply)
                .show();
    }

    public void showNumericInputDialog(String title, String prompt, String initialInput, final Consumer<String> result) {
        new LovelyTextInputDialog(this.context, R.style.EditTextTintTheme)
                .setTopColorRes(R.color.darkDeepOrange)
                .setTitle(title)
                .setMessage(prompt)
                .setInitialInput(initialInput)
                .setIcon(R.drawable.ic_key)
                .setInputType(InputType.TYPE_CLASS_NUMBER)
                .setInputFilter(R.string.text_input_error_message, text -> text.matches("\\w+"))
                .setConfirmButton(android.R.string.ok, result::apply)
                .show();
    }
}
