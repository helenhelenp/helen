package com.example.aicte;

import android.app.Activity;
import android.app.Notification;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Home extends Activity {
	Button aboutus, notification, clg, placement, emailus, contactus;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.homee);
		aboutus = (Button) findViewById(R.id.button1);
		notification = (Button) findViewById(R.id.button2);
		clg = (Button) findViewById(R.id.button3);
		placement = (Button) findViewById(R.id.button4);
		emailus = (Button) findViewById(R.id.button5);
		contactus = (Button) findViewById(R.id.button6);
		aboutus.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent a = new Intent(Home.this, Aboutus.class);
				startActivity(a);

			}
		});
		notification.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent b = new Intent(Home.this, Notification.class);
				startActivity(b);

			}
		});
		clg.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent c = new Intent(Home.this, Clg.class);
				startActivity(c);

			}
		});
		placement.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent d = new Intent(Home.this, Placement.class);
				startActivity(d);

			}
		});

		emailus.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent e = new Intent(Home.this, Emailus.class);
				startActivity(e);

			}
		});
		contactus.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent f = new Intent(Home.this, Contactus.class);
				startActivity(f);

			}
		});
	}

}
