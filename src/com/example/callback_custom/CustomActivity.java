package com.example.callback_custom;

import com.example.callback_custom.interfaces.OnCustomListener;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class CustomActivity extends Activity {
	
	private static OnCustomListener mCustom;
	private Button bt;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.custom);
		bt = (Button) findViewById(R.id.bt);
		bt.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				mCustom.Custom();
			}
		});
		
	}
	
	public static void setCustomListener(OnCustomListener custom){
		mCustom = custom;
	}

}
