package gr.padeler.aspellchecker;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import static android.preference.PreferenceActivity.*;


public class ASpellCheckerActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public Intent getIntent() {
        final Intent modIntent = new Intent(super.getIntent());
        modIntent.putExtra(EXTRA_SHOW_FRAGMENT, ASpellCheckerSettingsFragment.class.getName());
        modIntent.putExtra(EXTRA_NO_HEADERS, true);
        return modIntent;
    }
}