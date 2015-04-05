package com.example.homeautomation;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListView;

public class AddDevice extends Activity {
	


@Override
    protected void onCreate(Bundle savedInstanceState) {
	super.onCreate(savedInstanceState);
	setContentView(R.layout.add);
    
	getActionBar().setDisplayHomeAsUpEnabled(true);   
    
  
    
     
	Intent intent = new Intent(getApplicationContext(),Dashboard.class);

   
	EditText editText = (EditText) findViewById(R.id.editText2);
	String message = editText.getText().toString();
	intent.putExtra("txtData", message);
}    
}



