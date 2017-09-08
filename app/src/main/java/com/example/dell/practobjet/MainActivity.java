package com.example.dell.practobjet;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<pojos> ls = new ArrayList<>();
    Button btn;
    ListView list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = (Button)findViewById(R.id.btn);
        list = (ListView)findViewById(R.id.view);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent tn = new Intent(getApplication(),segundaactividad.class);
                startActivityForResult(tn,10);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == 10 && resultCode == RESULT_OK){
            ls.add((pojos)data.getSerializableExtra("clave"));
            String[] ar = new String[ls.size()];
            for(int i = 0; i < ls.size(); i++){
                ar[i] = ls.get(i).toString();
            }
            ArrayAdapter<String> ad = new ArrayAdapter<String>(this,android.R.layout.simple_expandable_list_item_1,ar);
            list.setAdapter(ad);
        }
    }
}
