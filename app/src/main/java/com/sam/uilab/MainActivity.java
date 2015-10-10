package com.sam.uilab;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonClicked(View v) {
        EditText width = (EditText) findViewById(R.id.width);
        EditText height = (EditText) findViewById(R.id.height);
        if(width.getText().length() == 0 || height.getText().length() == 0) {
            Toast.makeText(this, "Width/Height cannot be empty", Toast.LENGTH_SHORT).show();
        } else {
            Double widthDouble = Double.parseDouble(width.getText().toString());
            Double heightDouble = Double.parseDouble(height.getText().toString());

            TextView areaView = (TextView) findViewById(R.id.area);
            TextView perimeterView = (TextView) findViewById(R.id.perimeter);
            areaView.setText("Area is " + String.valueOf(widthDouble * heightDouble));
            perimeterView.setText("Perimeter is " + String.valueOf((2 * widthDouble) +(2 * heightDouble)));

        }

    }
}
