package com.example.votingsim;

import java.net.MalformedURLException;
import java.net.URL;

import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends Activity {

	
	View rootView; 
	 
	Button loginButton; 
	EditText userField;
	EditText passField;
	TextView outputText;
	
	
	
	@SuppressLint("InlinedApi")
	@Override
	protected void onCreate(Bundle savedInstanceState) { 
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login);
		 
		
		rootView = getWindow().getDecorView();
		
		/*Setup for kitkat*/
		if (Integer.valueOf(android.os.Build.VERSION.SDK) == 19) {
			rootView.setSystemUiVisibility(View.SYSTEM_UI_FLAG_IMMERSIVE); 
			
			
		}
	    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
		        Window w = getWindow(); // in Activity's onCreate() for instance
		        w.setFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION, WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION);
		        w.setFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS, WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
		    }		
 
		 
		loginButton = (Button) findViewById(R.id.button_login);
		loginButton.setOnClickListener( new OnClickListener() {

			@Override
			public void onClick(View v) {
				performLogin();
				
			}
			
		});
		
		
		
	
		 
		 
	}

	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
		
		findViewById(R.id.imageView1).setVisibility(View.VISIBLE);
		
		
		
		
	} 
	
	
	private void performLogin() {
		loginButton.setVisibility(View.GONE);
		
		try {
			URL url = new URL("https://main-securityproject.rhcloud.com/?method=hello&format=json");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
	
	
	private class LaunchActivityTask extends AsyncTask<Boolean, Boolean, Boolean> {

		@Override 
		protected Boolean doInBackground(Boolean... params) {
			// TODO Auto-generated method stub
			
			Thread startActivity = new Thread(new Runnable() {

				@Override
				public void run() {
					// TODO Auto-generated method stub
					
					
					
					
				}
				

 			
			});
			
			return null;
		}
		
	
	}
	
	

	@Override 
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is
		// present.
		getMenuInflater().inflate(R.menu.login, menu);
		return true;
	}

}
