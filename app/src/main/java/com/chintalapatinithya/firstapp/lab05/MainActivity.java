package com.chintalapatinithya.firstapp.lab05;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView createever;
    TextView createnow;
    TextView restartever;
    TextView restartnow;
    TextView startever;
    TextView startnow;
    TextView destroyever;
    TextView destroynow;
    TextView resumeever;
    TextView resumenow;
    TextView pauseever;
    TextView pausenow;
    TextView stopever;
    TextView stopnow;
    SharedPreferences mPreferences;
    int a;
    int b;
    int c;
    int d;
    int e;
    int f;
    int g;

    int anow;
    int bnow;
    int cnow;
    int dnow;
    int enow;
    int fnow;
    int gnow;
    SharedPreferences.Editor Edit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        createever=findViewById(R.id.createever);
        createnow=findViewById(R.id.createnow);
        restartever=findViewById(R.id.restartever);
        restartnow=findViewById(R.id.restartnow);
        startever=findViewById(R.id.startever);
        startnow=findViewById(R.id.startnow);
        destroyever=findViewById(R.id.destroyever);
        destroynow=findViewById(R.id.destroynow);
        resumeever=findViewById(R.id.resumeever);
        resumenow=findViewById(R.id.resumenow);
        pauseever=findViewById(R.id.pauseever);
        pausenow=findViewById(R.id.pausenow);
        stopever=findViewById(R.id.stopever);
        stopnow=findViewById(R.id.stopnow);
        mPreferences = getSharedPreferences("com.nithyacl.sharedprefs",MODE_PRIVATE);
        a = mPreferences.getInt("createever", 0);
        b = mPreferences.getInt("restartever", 0);
        c = mPreferences.getInt("startever", 0);
        d = mPreferences.getInt("destroyever", 0);
        e = mPreferences.getInt("resumeever", 0);
        f = mPreferences.getInt("pauseever", 0);
        g = mPreferences.getInt("stopever", 0);
        Edit = mPreferences.edit();
        restartever.setText("Restart: " +b);
        startever.setText("Start: " +c);
        destroyever.setText("Destroy: " +d);
        resumeever.setText("Resume: " +e);
        pauseever.setText("Pause: " +f);
        stopever.setText("Stop: " +g);

        a++;
        Edit.putInt("createever", a );
        Edit.apply();
        createever.setText("Create: " +a);
        anow++;
        createnow.setText("Create Now: " + anow );


    }
    @Override
    protected void onRestart() {
        super.onRestart();
        b++;
        Edit.putInt("restartever", b );
        Edit.apply();
        restartever.setText("Restart: " +b);
        bnow++;
        restartnow.setText("Restart Now: " + bnow );
    }

    @Override
    protected void onStart() {
        super.onStart();
        c++;
        Edit.putInt("startever", c );
        Edit.apply();
        startever.setText("Start: " +c);
        cnow++;
        startnow.setText("Start Now: " + cnow );
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        d++;
        Edit.putInt("destroyever", d );
        Edit.apply();
        destroyever.setText("Destroy: " +d);
        dnow++;
        destroynow.setText("Destroy Now: " + dnow );
        System.out.println("Test 1: In destroy" + mPreferences.getInt("destroyever", 99));
    }

    @Override
    protected void onResume() {
        super.onResume();
        e++;
        Edit.putInt("resumeever", e );
        Edit.apply();
        resumeever.setText("Resume: " +e);
        enow++;
        resumenow.setText("Resume Now: " + enow );
    }

    @Override
    protected void onPause() {
        super.onPause();
        f++;
        Edit.putInt("pauseever", f );
        Edit.apply();
        pauseever.setText("Pause: " +f);
        fnow++;
        pausenow.setText("Pause Now: " + fnow );
    }

    @Override
    protected void onStop() {
        super.onStop();
        g++;
        Edit.putInt("stopever", g );
        Edit.apply();
        stopever.setText("Stop: " +g);
        gnow++;
        stopnow.setText("Stop Now: " + gnow );
    }
}
