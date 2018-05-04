package navigation.maps.sharing.location.address.digital.app.topo.customlib;

import android.content.Context;
import android.content.Intent;

/**
 * Created by mobiikey-dilip on 4/28/2018.
 */

public class TestInitialization {

    public static TestInitialization testInitialization = null;
    public static TestNotifier testNotifier;
    public static Context context;

    public TestInitialization(Context context) {
        this.context = context;
    }

    public static TestInitialization getInstance(Context context) {
        if (testInitialization == null) {
            testInitialization = new TestInitialization(context);
        }
        return testInitialization;
    }

    public void callingTestActivity() {
        Intent intent = new Intent(context, TestActivity.class);
        context.startActivity(intent);

    }

    public void setTestNotifier(TestNotifier notifier) {
        testNotifier = notifier;
    }
}
