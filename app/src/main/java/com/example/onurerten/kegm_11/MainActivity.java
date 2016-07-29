package com.example.onurerten.kegm_11;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendMessage (View view){
        Intent intent = new Intent(this, Main2Activity.class);
        startActivity(intent);

    }

    public void sendMessage1 (View view){
        Intent intent1 = new Intent(this, Main3Activity.class);
        startActivity(intent1);
    }

    public void sendMessage2 (View view){
        Intent intent2 = new Intent (this,Main4Activity.class);
        startActivity(intent2);
    }
    public void sendMessage3 (View view){
        Intent intent3 = new Intent (this, Main5Activity.class);
        startActivity(intent3);
    }
}
