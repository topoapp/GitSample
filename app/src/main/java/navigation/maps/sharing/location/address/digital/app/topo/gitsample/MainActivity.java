package navigation.maps.sharing.location.address.digital.app.topo.gitsample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import navigation.maps.sharing.location.address.digital.app.topo.customlib.TestInitialization;
import navigation.maps.sharing.location.address.digital.app.topo.customlib.TestNotifier;

public class MainActivity extends AppCompatActivity implements TestNotifier {

    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text = (TextView) findViewById(R.id.text);
        TestInitialization.getInstance(MainActivity.this).callingTestActivity();
        TestInitialization.getInstance(MainActivity.this).setTestNotifier(MainActivity.this);

    }

    @Override
    public void onTestSuccess(String value) {
        text.setText(value);
    }
}
