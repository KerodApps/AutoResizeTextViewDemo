package net.kerod.android.autosizingtextdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatTextView;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        final EditText txteInput = findViewById(R.id.txte_input);

        final AppCompatTextView txtvDefault = findViewById(R.id.txtv_default);
        final AppCompatTextView txtvGranular = findViewById(R.id.txtv_granular);
        final AppCompatTextView txtvPreset = findViewById(R.id.txtv_preset);

        txteInput.addTextChangedListener(new TextWatcher() {

            public void afterTextChanged(Editable text) {
                txtvDefault.setText(text);
                txtvGranular.setText(text);
                txtvPreset.setText(text);
            }

            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }
        });

    }
}
