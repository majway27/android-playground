package com.example.em1;

import android.app.Activity;
import android.os.Bundle;
//import android.content.Intent;
//import android.net.Uri;
import android.widget.Button;
import android.widget.TextView;
import android.view.View;
import android.view.View.OnClickListener;

public class DashActivity extends Activity {
    
	Button button1;
	Button button2;
	TextView txtView;
	String storyChange1;
	String storyChange2;
	
	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dash);
        
        addListenerOnButton();
    }
    
	public void addListenerOnButton() {
		 
		button1 = (Button) findViewById(R.id.buttonmenuD1);
		button2 = (Button) findViewById(R.id.buttonmenuD2);
		
		txtView=(TextView)findViewById(R.id.textViewD2);
		storyChange1="Changed the Story text";
		storyChange2="Changed the Story, what a twist!";
		
		button1.setOnClickListener(new OnClickListener() {
 
			@Override
			public void onClick(View arg0) {
 
			  //Intent browserIntent = 
              //              new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.mkyong.com"));
			  //  startActivity(browserIntent);
				txtView.setText(storyChange1); 
 
			}
 
		});
		
		button2.setOnClickListener(new OnClickListener() {
			 
			@Override
			public void onClick(View arg0) {
 
			  //Intent browserIntent = 
              //              new Intent(Intent.ACTION_VIEW, Uri.parse("http://words.mayway.biz"));
			  //  startActivity(browserIntent);
				txtView.setText(storyChange2);
 
			}
 
		});
 
	}
    
}