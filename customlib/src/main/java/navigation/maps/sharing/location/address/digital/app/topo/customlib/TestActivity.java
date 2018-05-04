package navigation.maps.sharing.location.address.digital.app.topo.customlib;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by mobiikey-dilip on 4/28/2018.
 */

public class TestActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.testactivity);

        final EditText edittext = (EditText) findViewById(R.id.edittext);
        Button button = (Button) findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TestInitialization.testNotifier != null) {
                    TestInitialization.testNotifier.onTestSuccess(edittext.getText().toString());
                    finish();
                }
            }
        });
    }
}
