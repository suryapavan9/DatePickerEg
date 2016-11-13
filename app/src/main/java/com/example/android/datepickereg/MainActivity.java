package com.example.android.datepickereg;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

public class MainActivity extends Activity {

    DatePicker datePicker;
    Button button;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        datePicker = (DatePicker) findViewById(R.id.datePicker1);
        button = (Button) findViewById(R.id.button1);
        textView = (TextView) findViewById(R.id.textView1);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                textView.setText(getCurrentDate());
            }
        });
    }

    public String getCurrentDate() {

        StringBuilder builder = new StringBuilder();
        builder.append("Current Date");
        builder.append((datePicker.getDayOfMonth() +1)+"\n");
        builder.append((datePicker.getMonth() +1)+"\n");
        builder.append(datePicker.getYear());
        return builder.toString();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);

        return true;
    }
}
