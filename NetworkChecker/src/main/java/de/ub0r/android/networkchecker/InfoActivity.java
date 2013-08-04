package de.ub0r.android.networkchecker;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * @author flx
 */
public class InfoActivity extends Activity implements View.OnClickListener {

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        findViewById(R.id.snooze).setOnClickListener(this);
    }

    @Override
    public void onClick(final View view) {
        switch (view.getId()) {
            case R.id.snooze:
                sendBroadcast(
                        new Intent(CheckReceiver.ACTION_SNOOZE, null, this, CheckReceiver.class));
                finish();
                return;
            default:
                throw new IllegalArgumentException("invalid view clicked");
        }
    }
}
