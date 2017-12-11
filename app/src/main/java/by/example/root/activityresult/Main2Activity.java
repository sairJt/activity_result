package by.example.root.activityresult;

import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Bundle extras = getIntent().getExtras();
        TextView onCreate;
        TextView onStart ;
        TextView onResume;
        TextView onPause ;
        TextView onStop ;
        TextView onDestroy;
        onCreate = findViewById(R.id.countOnCreate);
        onStart = findViewById(R.id.countOnStart);
        onResume = findViewById(R.id.countOnResume);
        onPause = findViewById(R.id.countOnPause);
        onStop = findViewById(R.id.countOnStop);
        onDestroy = findViewById(R.id.countOnDestroy);


        if(extras!=null){
            int countOnCreate = extras.getInt("onCreateCount");
            onCreate.setText(String.valueOf(countOnCreate));
            int countOnStart = extras.getInt("onStartCount");
            onStart.setText(String.valueOf(countOnStart));
            int countOnResume = extras.getInt("onResumeCount");
            onResume.setText(String.valueOf(countOnResume));
            int countOnPause = extras.getInt("onPauseCount");
            onPause.setText(String.valueOf(countOnPause));
            int countOnStop = extras.getInt("onStopCount");
            onStop.setText(String.valueOf(countOnStop));
            int countOnDestroy = extras.getInt("onDestroyCount");
            onDestroy.setText(String.valueOf(countOnDestroy));
        }
    }

    @SuppressWarnings("unused")
    public void back (View view){
        Intent intent = new Intent(this, MainActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP|Intent.FLAG_ACTIVITY_SINGLE_TOP);
        startActivity(intent);
    }
}
