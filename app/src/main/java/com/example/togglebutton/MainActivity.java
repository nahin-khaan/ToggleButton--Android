package com.example.togglebutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity
{
    ToggleButton toogle;
    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toogle=findViewById(R.id.toggoleBtn);
        text=findViewById(R.id.textId);
        toogle.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked)   //On checked changed method
            {
                if(isChecked)
                {

                    text.setText("Your data is On");
                }
                else
                {
                    text.setText("Your data is Off");
                }

            }
        });
    }
}