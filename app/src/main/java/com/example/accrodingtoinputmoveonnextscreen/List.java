package com.example.accrodingtoinputmoveonnextscreen;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
public class List extends AppCompatActivity implements  OnItemClickListener {
    ListView lv;
    String items[];
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listlayout);
        lv=(ListView) findViewById(R.id.listViewItems);
        int num=getIntent().getIntExtra("num", 0);
        items=new String[num];
        for(int i=0;i<num;i++)
        {
            items[i]="item "+(i+1);
        }
        ArrayAdapter<String> arr=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,items);
        lv.setAdapter(arr);
        lv.setOnItemClickListener(this);
    }
    @Override
    public void onItemClick(AdapterView<?> arg0, View arg1, int pos, long arg3) {
        Toast.makeText(this,items[pos] + " selected", Toast.LENGTH_SHORT).show();
    }
}
