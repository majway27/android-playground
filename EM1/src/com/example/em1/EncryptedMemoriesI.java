package com.example.em1;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

@SuppressWarnings("deprecation")
public class EncryptedMemoriesI extends TabActivity {

	// TabSpec Names
    private static final String DASH_SPEC = "Dash";
    private static final String STATUS_SPEC = "Status";
    private static final String MESSAGE_SPEC = "Message";
     
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
         
        TabHost tabHost = getTabHost();
         
        // Dash Tab
        TabSpec dashSpec = tabHost.newTabSpec(DASH_SPEC);
        // Tab Icon
        dashSpec.setIndicator(DASH_SPEC, getResources().getDrawable(R.drawable.ic_launcher));
        Intent dashIntent = new Intent(this, DashActivity.class);
        // Tab Content
        dashSpec.setContent(dashIntent);
         
        // Status Tab
        TabSpec statusSpec = tabHost.newTabSpec(STATUS_SPEC);
        statusSpec.setIndicator(STATUS_SPEC, getResources().getDrawable(R.drawable.ic_launcher));
        Intent statusIntent = new Intent(this, StatusActivity.class);
        statusSpec.setContent(statusIntent);
         
        // Message Tab
        TabSpec messageSpec = tabHost.newTabSpec(MESSAGE_SPEC);
        messageSpec.setIndicator(MESSAGE_SPEC, getResources().getDrawable(R.drawable.ic_launcher));
        Intent messageIntent = new Intent(this, MessageActivity.class);
        messageSpec.setContent(messageIntent);
         
        // Adding all TabSpec to TabHost
        tabHost.addTab(dashSpec); // Adding Dash tab
        tabHost.addTab(statusSpec); // Adding Status tab
        tabHost.addTab(messageSpec); // Adding Message tab
    }
}