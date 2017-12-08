package by.example.root.activityresult;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static int onCreateCount =0;
    public static int onStartCount =0;
    public static int onResumeCount =0;
    public static int onPauseCount =0;
    public static int onStopCount =0;
    public static int onDestroyCount =0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        onCreateCount+=1;
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart(){
        super.onStart();
        onStartCount+=1;
    }

    @Override
    protected void onResume(){
        super.onResume();
        onResumeCount+=1;
    }

    @Override
    protected void onPause(){
        super.onPause();
        onPauseCount+=1;
    }

    @Override
    protected void onStop(){
        super.onStop();
        onStopCount+=1;
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        onDestroyCount+=1;
    }
    public void sendMessage (View view){
        Intent intent = new Intent(this, MainActivity.class);
        EditText message = findViewById(R.id.message);
        String sendMessage = message.getText().toString();
        intent.putExtra("message", sendMessage);
        startActivity(intent);
    }
    public void counts(View view){
        Intent intent = new Intent(this, Main2Activity.class);
        intent.putExtra("onCreateCount", onCreateCount);
        intent.putExtra("onStartCount", onStartCount);
        intent.putExtra("onResumeCount", onResumeCount);
        intent.putExtra("onPauseCount", onPauseCount);
        intent.putExtra("onStopCount", onStopCount);
        intent.putExtra("onDestroyCount", onDestroyCount);
        startActivity(intent);
    }

}
