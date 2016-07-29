package com.example.onurerten.kegm_11;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    EditText mEditText;
    TextView mTextView;
    Button mButton;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        mEditText = (EditText)findViewById(R.id.editText);
        mTextView = (TextView)findViewById(R.id.sonuc1);
        mButton = (Button)findViewById(R.id.hesap1);
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculate ();
            }
        });

    }

    public void calculate(){

        Double value = Double.parseDouble(mEditText.getText().toString());
        if (value<=1000.0) {
            Double calculatedValue=60.0;
            mTextView.setText(calculatedValue.toString());
        }
        else if(value>1000.0) {
            Double calculatedValue= (value-1000.0)*(22.0/1000.0) + 60.0;
            mTextView.setText(calculatedValue.toString());
        }
    }

    public void sendBack1 (View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}