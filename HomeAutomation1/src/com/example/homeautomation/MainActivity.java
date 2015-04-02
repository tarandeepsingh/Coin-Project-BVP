package com.example.homeautomation;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;


public class MainActivity extends Activity {

	Button login, signup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.try1);
        
        login = (Button) findViewById(R.id.button1);
        signup = (Button) findViewById(R.id.button2);
        
        login.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent i = new Intent(getBaseContext(),Welcome.class);
				startActivity(i);
			}
        	
        });
        
        signup.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent i = new Intent(getBaseContext(),Signup.class);
				startActivity(i);
			}
        	
        });
    }

}
