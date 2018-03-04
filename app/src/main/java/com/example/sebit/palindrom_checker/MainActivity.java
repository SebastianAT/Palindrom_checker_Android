package com.example.sebit.palindrom_checker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Berechnung(View v) {

        EditText textInputField = (EditText) findViewById(R.id.Text1);   // Obejkt Variable erstellen mit R.Id auf layout zugreifen und zahl01 holen also verweiß
        TextView textOutputField = (TextView) (findViewById(R.id.textView2));

        String palindrom = textInputField.getText().toString();

        if(palindrom.isEmpty()){
            textOutputField.setText("Field is empty");
        } else if(palindrom.length() == 1){
            textOutputField.setText("Only one char");
        } else {

            int lng = palindrom.length();


            for (int i = 0; i < lng / 2; i++) {
                if (palindrom.charAt(i) == palindrom.charAt(lng - i - 1)) {
                    textOutputField.setText(String.valueOf(palindrom + " is a Palindrom"));
                } else {
                    textOutputField.setText(String.valueOf(palindrom + " is not Palindrom"));
                }
            }
        }


    }
}


