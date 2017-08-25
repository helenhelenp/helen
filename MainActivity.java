package com.example.aicte;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;


public class MainActivity extends Activity {
       Button user,faculty;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        user=(Button)findViewById(R.id.button1);
        faculty=(Button)findViewById(R.id.button2);
        user.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent i=new Intent(MainActivity.this,UserLogin.class);
				startActivity(i);
				
			}
		});
        faculty.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent j=new Intent(MainActivity.this,AdminLogin.class);
				startActivity(j);
				
				
			}
		});
    }
}