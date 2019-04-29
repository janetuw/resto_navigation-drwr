package com.example.buttonnavigation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity<navigationView> extends AppCompatActivity implements navigationView.onnavigationItemSelectionList {

navigationView navigationView;
TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.navigation_drower);
    }

    public boolean login(View view) {
        navigationView=(navigationView)findViewById(R.id .navigationView);
        TextView txt = (TextView) findViewById(R.id.txt_id);
        int id = txt.getZ();
        switch (id){
            Text.CDATA_SECTION_NODE
            case R.id.btnChangeImage:
                return true;
            case R.id.drawer_layout:
                return true;
            case R.id.imagageView1:
                return true;
            case R.id.dish_id
        }


        return false;
    }
}
