package cc.cunbm.android.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }

    public void onButtonClick(View arg0) {
        Log.d("***","Click on SECOND ACTIVITY");

        Intent intent = new Intent();
        EditText editText = (EditText) findViewById(R.id.plain_text_input);
        intent.putExtra("myResult", editText.getText().toString());
        setResult(RESULT_OK, intent);
        Log.d("***","end of SECOND ACTIVITY");

        finish();
    }

}