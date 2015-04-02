package com.example.homeautomation;

import com.getbase.floatingactionbutton.FloatingActionButton;



import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Dashboard extends Activity {

	Button  log;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dashboard);
    
        final FloatingActionButton add = (FloatingActionButton) findViewById(R.id.add_app);
        add.setOnClickListener(new OnClickListener() {
          @Override
          public void onClick(View v) {
  			// TODO Auto-generated method stub
  			Intent i = new Intent(getBaseContext(),AddDevice.class);
  			startActivity(i);
  		}
        });
        
        final FloatingActionButton rem1 = (FloatingActionButton) findViewById(R.id.rem_app);
        rem1.setOnClickListener(new OnClickListener() {
          @Override
          public void onClick(View v) {
  			// TODO Auto-generated method stub
  			Intent i = new Intent(getBaseContext(),Remove.class);
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
