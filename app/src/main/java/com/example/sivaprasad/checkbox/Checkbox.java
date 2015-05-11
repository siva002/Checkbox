package com.example.sivaprasad.checkbox;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;


public class Checkbox extends ActionBarActivity {

    private CheckBox checkBoxArizona;
    private CheckBox checkBoxColorado;
    private CheckBox checkBoxNevada;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkbox);
        checkBoxArizona = (CheckBox) findViewById(R.id.arizona);
        checkBoxColorado = (CheckBox) findViewById(R.id.colorado);
        checkBoxNevada = (CheckBox) findViewById(R.id.nevada);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_checkbox, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void onClickCheckbox(View view) {

        Log.d("ONCLICK","Checkbox Clicked");
        boolean correct = false;
        String message;

        if (view.getId()== R.id.arizona){
            Log.d("TRUE","Arizona clicked");
            correct = true;
            message = "Correct";
        }
        else
            message = "Incorrect";

        Toast toast = Toast.makeText(this,message,Toast.LENGTH_SHORT);
        toast.show();
    }

    public void onClickSubmit(View view) {
        Log.d("ONCLICK","Submit Button Clicked");
        String message;
        if ( checkBoxArizona.isChecked()){

            message = "Correct";
        }
        else {
            message = "Incorrect";
        }
        Toast toast = Toast.makeText(this,message,Toast.LENGTH_SHORT);
        toast.show();
    }
}
