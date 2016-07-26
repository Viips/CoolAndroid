package vip.coolandroid;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HighscoreActivity extends Activity {

    private Button backBtn;
    private Button viewHSBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_highscore);

        int mUIFlag = View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                | View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                | View.SYSTEM_UI_FLAG_LOW_PROFILE
                | View.SYSTEM_UI_FLAG_FULLSCREEN
                | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY;

        getWindow().getDecorView().setSystemUiVisibility(mUIFlag);

        //Button takes you to GameActivity
        backBtn = (Button) findViewById(R.id.highscore_backBtn);

        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(HighscoreActivity.this, MainActivity.class);

                startActivity(intent);
            }
        });

        viewHSBtn = (Button) findViewById(R.id.hs_Btn);

//        viewHSBtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                AlertDialog.Builder alertDialog = new AlertDialog.Builder(HighscoreActivity.this);
//                alertDialog.setTitle("High Score");
//                alertDialog.setMessage(MainActivity.hScore);
//
//                alertDialog.setNegativeButton("Continue..", new DialogInterface.OnClickListener() {
//                    public void onClick(DialogInterface dialog, int which) {
//                        Intent intent = new Intent(HighscoreActivity.this, HighscoreActivity.class);
//
//                        startActivity(intent);
//
//                    }
//                });
//
//                alertDialog.show();  //<-- See This!
//            }
//
//        });


    }






}

