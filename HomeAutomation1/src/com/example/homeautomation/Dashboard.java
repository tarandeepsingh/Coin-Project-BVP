package com.example.homeautomation;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import java.util.List;
import android.widget.Toast;
import java.util.ArrayList;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.view.Menu;
import android.widget.ListView;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;

public class Dashboard extends Activity {

    Button add1;
	public final static String EXTRA_MESSAGE = "com.mycompany.myfirstapp.MESSAGE";
	private ListView lv;
	String message;

    
	protected void onCreate(Bundle savedInstanceState) {
	super.onCreate(savedInstanceState);
	setContentView(R.layout.dashboard);
	  
	  try{    
		    
			Intent intent = getIntent();
			 message = intent.getExtras().getString("txtData","");    
		    }
		    catch (Exception e) {
		       
		        ErrorDialog(e.getMessage());
		    }

	lv = (ListView) findViewById(R.id.listView1);

     
    List<String> your_array_list = new ArrayList<String>();
    your_array_list.add(message);
        

        // This is the array adapter, it takes the context of the activity as a 
        // first parameter, the type of list view as a second parameter and your 
        // array as a third parameter.
    ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>( this,  R.layout.list, your_array_list );

    lv.setAdapter(arrayAdapter); 
   

    
    add1 = (Button)findViewById(R.id.button1); 
    add1.setOnClickListener(new View.OnClickListener() {

     		@Override
    public void onClick(View v) {
     			// TODO Auto-generated method stub
    Intent i = new Intent(getApplicationContext(),AddDevice.class);
    startActivity(i);
     		}
         	
         });
     
	}
	  
	  private void ErrorDialog(String Description) {
	        AlertDialog.Builder alertDialog = new AlertDialog.Builder(
	                Dashboard.this);
	        alertDialog.setTitle("You get Error...");
	        alertDialog.setMessage(Description);
	        alertDialog.setIcon(R.drawable.dialog_icon);

	        alertDialog.setNegativeButton("Cancel",
	                new DialogInterface.OnClickListener() {
	                    public void onClick(DialogInterface dialog, int which) {
	                        dialog.cancel();
	                    }
	                });

	        alertDialog.show();
	    }

}
	  