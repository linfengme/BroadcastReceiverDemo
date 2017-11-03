package zlf.com.broadcastreceiverdemo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by ex-zoulinfeng001 on 2017/11/3.
 */

public class MyBroadCastReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "received in MyBroadCastReceiver", Toast.LENGTH_SHORT).show();
        abortBroadcast();
    }
}
