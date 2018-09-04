package com.example.david.myheroku;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
//ratpack
import ratpack.test.embed.EmbeddedApp;
import static org.junit.Assert.assertEquals;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button button = findViewById(R.id.heroku_button);
        button.setOnClickListener(new View.OnClickListener() {
                                      public void onClick(View v) {


                                          // Code here executes on main thread after user presses button
                                      }
    }

    //Button herokuButton = (Button) findViewById(R.id.herokuButton);
}
