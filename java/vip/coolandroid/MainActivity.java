package vip.coolandroid;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

    private Button startBtn;
    private Button settingBtn;
    private Button exitBtn;
    CoolAndroidView drjView;
    CoolAndroidView.DroidRunJumpThread drjThread;


    public static int hScore  = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int mUIFlag = View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                | View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                | View.SYSTEM_UI_FLAG_LOW_PROFILE
                | View.SYSTEM_UI_FLAG_FULLSCREEN
                | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY;

        getWindow().getDecorView().setSystemUiVisibility(mUIFlag);


        //Button takes you to GameActivity
        startBtn = (Button) findViewById(R.id.beginGame);

        startBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, CoolAndroidActivtiy.class);
                startActivity(intent);
            }
        });


        //Button takes you to highscore
        settingBtn = (Button) findViewById(R.id.setting);

        settingBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Log.e("You HighScore is", String.valueOf(hScore));

                Intent intent = new Intent(MainActivity.this, HighscoreActivity.class);
                startActivity(intent);
            }
        });


        //Exit button
        exitBtn = (Button) findViewById(R.id.exit);

        exitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                Intent intent = new Intent(Intent.ACTION_MAIN);
                intent.addCategory(Intent.CATEGORY_HOME);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);

            }
        });


//        @Override
//        protected void onPause() {
//            super.onPause();
//
//            SharedPreferences settings = getSharedPreferences(PREFS_NAME, 0);
//            SharedPreferences.Editor editor = settings.edit();
//
//            drjThread = drjView.getThread();
//
//            // if player wants to quit then reset the game
//            if (isFinishing()) {
//                drjThread.resetGame();
//            }
//            else {
//                drjThread.pause();
//            }
//
//            drjThread.saveGame(editor);
//        }
//
//        @Override
//        protected void onResume() {
//            super.onResume();
//            // restore game
//            drjThread = drjView.getThread();
//            SharedPreferences settings = getSharedPreferences(PREFS_NAME, 0);
//            drjThread.restoreGame(settings);
//        }


    }


    public void highcrose(View v) {
        Intent i = new Intent(this, Game.class);
        startActivity(i);
    }
}
