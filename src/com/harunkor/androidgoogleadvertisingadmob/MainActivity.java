package com.harunkor.androidgoogleadvertisingadmob;

import com.harunkor.admob.Admob;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends ActionBarActivity {

	private Button btn;
	private View view;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		btn=(Button)findViewById(R.id.button1);
		
        view=getWindow().getDecorView().getRootView();
        
        
        Admob.createLoadBanner(getApplicationContext(), view);
		
		
		btn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Admob.createLoadInterstitial(getApplicationContext(),null);
			}
		});
		
		
		
		
		
		
		
	}


}
