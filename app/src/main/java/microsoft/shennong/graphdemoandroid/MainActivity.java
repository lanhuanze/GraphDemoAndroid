package microsoft.shennong.graphdemoandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import microsoft.shennong.graphdemoandroid.R;

import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @OnClick(R.id.login)
    public void onLoginClicked(View v) {
        Intent i = new Intent();
        i.setClass(this, DashboardActivity.class);
        startActivity(i);
    }
}
