package com.kayu.loveapps;

import android.os.Bundle;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainPage extends Activity {
	
	    public final static String EXTRA_MESSAGE = "com.kayu.love.MESSAGE";
	  
	
	    private EditText yourMName;
	    private String mName;
	    private String fName;
	    private String sex;
		private EditText partnerFName;
		private Button buttonLogin;
		
		
		
		AlertDialog.Builder builder;

		private CharSequence[] selectFruit = {"Male","Female"};

		private ProgressDialog progressBar;
		

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);
        initalize();
    }
    
    private void initalize() {
		yourMName = (EditText)findViewById(R.id.editText1);
		partnerFName = (EditText)findViewById(R.id.editText2);
		buttonLogin = (Button)findViewById(R.id.button1);  
        buttonLogin.setOnClickListener(new Button.OnClickListener() { 
        	public void onClick (View v){ 
        		checkPecentage();
        		} });
        
	}

	
	private void checkPecentage() {
		mName = yourMName.getText().toString();
		fName = partnerFName.getText().toString();
		if ( fName.length() == 0 || mName.length() == 0 )
		{			
			callTheAlertmsgBox();
		}
		
		else {
			
			builder = new AlertDialog.Builder(this);
			builder.setTitle(R.string.slect_sex);
			builder.setSingleChoiceItems(selectFruit, -1,  
			         new DialogInterface.OnClickListener() {  
			           @SuppressLint("UseValueOf")
					@Override  
			           public void onClick(DialogInterface dialog, int which) {  
			             Toast.makeText(MainPage.this,  
			                 selectFruit[which] + " Selected",  
			                 Toast.LENGTH_LONG).show(); 
			             if (selectFruit[which] == "Male")
			             {
			            	 sex = "Male";
			             }
			             else 
			            	 sex = "Female";		            	 
			             
			           }  		           
			           
			         });  
			
			 builder.setPositiveButton( "Ok", new DialogInterface.OnClickListener() { 
				  public void onClick( DialogInterface dialog, int whichButton) 
				  { 
					  dialog.dismiss();
					  goNextpage();
				  } });
			     
			     AlertDialog alert = builder.create();  
			     alert.show();  	
							
		}
	}

	
	
	protected void goNextpage() {
		//test.setText(sex);		
		love.setYname(mName) ;
		love.setPname(fName);
		love.setSex(sex);
		String [] message = {mName,fName};
		callProgressbar();
		Intent intent = new Intent(this, SecoundPage.class);
		intent.putExtra(EXTRA_MESSAGE, message);
		startActivity(intent);
		onBackPressed();
		
	}
	

	private void callProgressbar() {
		progressBar = new ProgressDialog(MainPage.this);
		progressBar.setCancelable(true);
		progressBar.setMessage("Loading ...");
		progressBar.setProgressStyle(ProgressDialog.STYLE_SPINNER);
		progressBar.show();

		
		
				
	}

	private void callTheAlertmsgBox() {	
		
		builder = new AlertDialog.Builder(this);
		builder.setMessage(R.string.dialog_message);
		builder.setNeutralButton("Ok", new DialogInterface.OnClickListener() {
			    @Override
			   public void onClick(DialogInterface dialog, int which) {
			    	Toast.makeText(getApplicationContext(), "Ok button Clicked ", Toast.LENGTH_SHORT).show();
			   }
			  });

		builder.show();	
		
	}

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main_page, menu);
        return true;
    }
    
    @Override
    public void onBackPressed() {
    	finish();
    }
}
