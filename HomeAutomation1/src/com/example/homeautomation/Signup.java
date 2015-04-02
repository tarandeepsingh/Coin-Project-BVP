package com.example.homeautomation;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Signup extends Activity {

	Button sig;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup);
   
    sig  = (Button)findViewById(R.id.button2);
   
    sig.setOnClickListener(new OnClickListener() {

		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			Intent i = new Intent(getBaseContext(),Welcome.class);
			startActivity(i);
		}
    	
    });
    
  }
}
