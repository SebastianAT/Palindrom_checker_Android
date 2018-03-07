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

    public static boolean isPalindrome(String str) {
        return str.equals(new StringBuilder(str).reverse().toString());
    }

    public void Berechnung(View v) {

        EditText textInputField = (EditText) findViewById(R.id.Text1);   // Objekt Variable erstellen mit R.Id auf layout zugreifen und Text1 holen also verweiß
        TextView textOutputField = (TextView) (findViewById(R.id.textView2));  // auch mit id textView2

        String palindrom = textInputField.getText().toString();   // holt Value vom Input Textfeld als String

        if(palindrom.isEmpty()){                              // prüft ob Input Textfeld leer ist -> Fehlermeldung
            textOutputField.setText("Field is empty");
        } else if(palindrom.length() < 5){                  // prüft ob weniger als 5 Zeichen sind -> Fehlermeldung
            textOutputField.setText("At least 5 chars");
        } else {

            if(isPalindrome(palindrom) == true){           // hier wird dann nochmal geprüft ob True / false für Palindrom -> Meldung
                textOutputField.setText(String.valueOf(palindrom + " is a Palindrom"));
            } else {
                textOutputField.setText(String.valueOf(palindrom + " is not a Palindrom"));
            }



            /*
            * First Version
            *
            int lng = palindrom.length();



            for (int i = 0; i < lng/2; i++) {
                if (palindrom.charAt(i) != palindrom.charAt(lng-i-1)) {
                   textOutputField.setText(String.valueOf(palindrom + " is not a Palindrom"));

                } else {
                    textOutputField.setText(String.valueOf(palindrom + " is a Palindrom"));
                }
            }
            */

        }


    }
}


