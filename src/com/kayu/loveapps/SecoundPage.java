package com.kayu.loveapps;



import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import android.support.v4.app.NavUtils;


public class SecoundPage extends Activity {
	
	private String [] message;
	private String [] messagePer;
	private TextView test;
	private TextView test2;
	private Button lvebutton;
	private Button imgbutton;
	private Button songbutton;
	AlertDialog.Builder builder ;
	private int pNumber,yNumber;
	private ImageButton facebookbutton;
	private ImageButton twitterbutton;
	private ProgressDialog progressBar;
	private Button backbutton;
	

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secound_page);
        getActionBar().setDisplayHomeAsUpEnabled(true);
        iniatialise();
        
         
    }
    
   
    

    private void iniatialise() {
    	Intent intent = getIntent();
        message = intent.getStringArrayExtra(MainPage.EXTRA_MESSAGE);
        test = (TextView)findViewById(R.id.textMsg);
        test2 = (TextView)findViewById(R.id.textMsg2);
        test.setText(message[0].toUpperCase());
        test2.setText(message[1].toUpperCase());  
        pNumber = Calculate.getPValue();
		yNumber = Calculate.getYValue();
		messagePer = PercentageCal.getPercentage(yNumber,pNumber); 
        lvebutton = (Button)findViewById(R.id.Button01);
		imgbutton = (Button)findViewById(R.id.Button02);
		songbutton = (Button)findViewById(R.id.Button03);
		backbutton = (Button)findViewById(R.id.Button04);
		facebookbutton = (ImageButton)findViewById(R.id.imageButton1);
		twitterbutton = (ImageButton)findViewById(R.id.imageButton2);
		
		lvebutton.setOnClickListener(new Button.OnClickListener() { 
        	public void onClick (View v){ 
        		checkPercentage();
        		} });
		imgbutton.setOnClickListener(new Button.OnClickListener() { 
        	public void onClick (View v){ 
        		checkMessage();
        		} });
		songbutton.setOnClickListener(new Button.OnClickListener() { 
        	public void onClick (View v){ 
        		checkplace();
        		} });
		backbutton.setOnClickListener(new Button.OnClickListener() { 
        	public void onClick (View v){ 
        		onBackPressed();
        		} });
		
		facebookbutton.setOnClickListener(new Button.OnClickListener() { 
			public void onClick(View arg0) {			   
				viewFacebook();
			}
 
		});
		
		twitterbutton.setOnClickListener(new Button.OnClickListener() { 
			public void onClick(View arg0) {			   
				viewTwitter();
			}
 
		});
	
		
	}




	



	




	protected void viewTwitter() {
		
		callProgressbar();
		Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://twitter.com/kayu_karan"));
        startActivity(i);
        onBackPressed();
	}




	private void callProgressbar() {
		
		progressBar = new ProgressDialog(SecoundPage.this);
		progressBar.setCancelable(true);
		progressBar.setMessage("Loading ...");
		progressBar.setProgressStyle(ProgressDialog.STYLE_SPINNER);
		progressBar.show();

	}




	protected void viewFacebook() {
		
		callProgressbar();
		Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/kayukaranp1"));
        startActivity(i);
        onBackPressed();
		
	}




	protected void checkplace() {		
		//test.setText(Integer.toString(Calculate.getYValue()));
		//test2.setText(Integer.toString(Calculate.getPValue()));
		Toast.makeText(getApplicationContext(), "Check your romantic place", Toast.LENGTH_SHORT).show();		
		//test.setText(message[0]);
		builder = new AlertDialog.Builder(this);
		builder.setMessage(messagePer[3]);
		builder.setIcon(R.drawable.icon2);
		builder.setTitle(messagePer[2]);		
		builder.setNeutralButton("Ok", new DialogInterface.OnClickListener() {
			    @Override
			   public void onClick(DialogInterface dialog, int which) {
			    	Toast.makeText(getApplicationContext(), "Ok button Clicked ", Toast.LENGTH_SHORT).show();
			   }
			  });

		builder.show();	
		
		
	}




	protected void checkMessage() {		
		
		Toast.makeText(getApplicationContext(), "Message from us ", Toast.LENGTH_SHORT).show();		
		//test.setText(message[0]);
		builder = new AlertDialog.Builder(this);
		builder.setMessage(messagePer[1]);
		builder.setIcon(R.drawable.icon1);
		builder.setTitle(R.string.alertbox_title_msg);		
		builder.setNeutralButton("Ok", new DialogInterface.OnClickListener() {
			    @Override
			   public void onClick(DialogInterface dialog, int which) {
			    	Toast.makeText(getApplicationContext(), "Ok button Clicked ", Toast.LENGTH_SHORT).show();
			   }
			  });

		builder.show();	
		
	}


	

	protected void checkPercentage() {	
		
		Toast.makeText(getApplicationContext(), "Check your love percentage ", Toast.LENGTH_SHORT).show();		
		//test.setText(message[0]);
		builder = new AlertDialog.Builder(this);
		builder.setMessage("Your Love Percentage is "+messagePer[0]);
		builder.setIcon(R.drawable.icon);
		builder.setTitle(R.string.alertbox_title_percentage);
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
        getMenuInflater().inflate(R.menu.activity_secound_page, menu);
        return true;
    }
    
	 @Override
	    public void onBackPressed() {
		    startActivity(new Intent(this, MainPage.class));
		    finish();
	    }
    

    
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                NavUtils.navigateUpFromSameTask(this);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

}
