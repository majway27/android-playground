package com.example.em1;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.view.View.OnClickListener;

public class JumpActivity extends Activity {
	
	Button button1;
	Button button2;
	Button button3;
	Button button4;
	
	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.jump);
        
        addListenerOnButton();
    }
    
	public void addListenerOnButton() {
		 
		button1 = (Button) findViewById(R.id.buttonmenuJ1);
		button2 = (Button) findViewById(R.id.buttonmenuJ2);
		button3 = (Button) findViewById(R.id.buttonmenuJ3);
		button4 = (Button) findViewById(R.id.buttonmenuJ4);

		//New Game
		button1.setOnClickListener(new OnClickListener() {
 
			@Override
			public void onClick(View arg0) {
 
				//start a new activity
				Intent i = new Intent(JumpActivity.this, KickoffGame.class);
				//i.putExtra("key", value); //Optional parameters
				JumpActivity.this.startActivity(i);
 
			}
 
		});
		
		//Resume Game
		button2.setOnClickListener(new OnClickListener() {
			 
			@Override
			public void onClick(View arg0) {
 
				//start a new activity
				Intent i = new Intent(JumpActivity.this, EncryptedMemoriesI.class);
				//i.putExtra("key", value); //Optional parameters
				JumpActivity.this.startActivity(i);
 
			}
 
		});
		
		//Options
		button3.setOnClickListener(new OnClickListener() {
			 
			@Override
			public void onClick(View arg0) {
				
				Toast.makeText(JumpActivity.this, "ToDo", Toast.LENGTH_LONG).show();
 
			}
 
		});
		
		//About
		button4.setOnClickListener(new OnClickListener() {
			 
			@Override
			public void onClick(View arg0) {
 
			  Intent browserIntent = 
					  new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.mayway.biz"));
			  startActivity(browserIntent);
 
			}
 
		});
 
	}
    
}
