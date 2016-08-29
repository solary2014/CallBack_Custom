package com.example.callback_custom;

import com.example.callback_custom.interfaces.OnCustomListener;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends Activity implements OnCustomListener{

	private TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CustomActivity.setCustomListener(this);
        tv = (TextView) findViewById(R.id.tv);
        tv.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
			startActivity(new Intent(MainActivity.this,CustomActivity.class));	
				
			}
		});
        
    }

	@Override
	public void Custom() {
		Toast.makeText(this, "OnCustomListener--->", Toast.LENGTH_SHORT).show();
	}

}
