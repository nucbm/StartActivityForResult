package cc.cunbm.android.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView rezultat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rezultat = (TextView)findViewById(R.id.mytext);
    }


    public void launchSecondActivity(View v) {
        // Here we create an Intent
        // and we put an extra in order to pass it to the ActivityTwo
        Intent intent = new Intent(this, SecondActivity.class);

        //the extra is a String that tell the background color choice
        intent.putExtra("color","red");

        //we start ActivityTwo with the above extra value
        startActivityForResult(intent,1);
        //finish();
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        Log.d("***","ON ACTIVITY RESULT");

        if (resultCode == RESULT_OK) {
            rezultat.setText(data.getStringExtra("myResult"));
        }

    }

}