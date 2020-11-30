package com.example.accrodingtoinputmoveonnextscreen;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
public class MainActivity extends AppCompatActivity implements OnClickListener {
    EditText editnum;
    Button btshow;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editnum=(EditText) findViewById(R.id.editTextNumber);
        btshow=(Button) findViewById(R.id.buttonshow);

        btshow.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        if(v.getId()==btshow.getId())
        {
            Intent myintent=new Intent(this,List.class);
            myintent.putExtra("num", Integer.parseInt(editnum.getText().toString()));
            this.startActivity(myintent);
        }
    }
}
