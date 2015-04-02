package com.example.homeautomation;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Welcome extends Activity {

	Button acc,log;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_screen);
    
    acc = (Button)findViewById(R.id.button1);
    
    acc.setOnClickListener(new OnClickListener() {

		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			Intent i = new Intent(getBaseContext(),Dashboard.class);
			startActivity(i);
		}
    	
    });
    
    log = (Button)findViewById(R.id.button2);
    
    log.setOnClickListener(new OnClickListener() {

		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			Intent i = new Intent(getBaseContext(),MainActivity.class);
			startActivity(i);
		}
    	
    }); 
  }
}
