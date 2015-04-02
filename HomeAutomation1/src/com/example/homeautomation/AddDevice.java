package com.example.homeautomation;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;

public class AddDevice extends Activity {
Button bac,sub;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add);
        bac = (Button)findViewById(R.id.imageButton2);
        
        bac.setOnClickListener(new OnClickListener() {

    		@Override
    		public void onClick(View v) {
    			// TODO Auto-generated method stub
    			Intent i = new Intent(getBaseContext(),Dashboard.class);
    			startActivity(i);
    		}
        	
        });
        sub = (Button)findViewById(R.id.imageButton2);
        
        sub.setOnClickListener(new OnClickListener() {

    		@Override
    		public void onClick(View v) {
    			// TODO Auto-generated method stub
    			Intent i = new Intent(getBaseContext(),Dashboard.class);
    			startActivity(i);
    		}
        	
        });
        
    }

}
