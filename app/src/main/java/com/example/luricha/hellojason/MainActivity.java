package com.example.luricha.hellojason;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("Jason", "button clicked and text color changed");
                ((TextView) findViewById(R.id.textView3)).setTextColor(
                        getResources().getColor(R.color.colorAccent));
            }
        });

        findViewById(R.id.button2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("Jason", "button2 clicked and view color changed");
                findViewById(R.id.rootView).setBackgroundColor(
                        getResources().getColor(R.color.colorPrimaryNew));
            }
        });

        findViewById(R.id.button3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("Jason", "button3 clicked and text was changed");
                ((TextView) findViewById(R.id.textView3)).setText("Goodbye.");
            }
        });

        findViewById(R.id.button4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("Jason", "button4 clicked and everything reseted.");
                //reset the view
                findViewById(R.id.rootView).setBackgroundColor(
                        getResources().getColor(R.color.colorPrimary));

                //reset the text color
                ((TextView) findViewById(R.id.textView3)).setTextColor(
                        getResources().getColor(R.color.black));
                //reset the text
                ((TextView) findViewById(R.id.textView3)).setText("Hello From Jason!");
            }
        });

        findViewById(R.id.editTextButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //pull user text
                String newText = ((EditText) findViewById(R.id.editText)).getText().toString();
                //change textview to user text
                if (TextUtils.isEmpty(newText)) {
                    ((TextView) findViewById(R.id.textView3)).setText("Hello From Jason!");
                }
                else {
                    ((TextView) findViewById(R.id.textView3)).setText(newText);
                }
            }
        });
    }


}
