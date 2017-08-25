package com.example.aicte;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class UserLogin extends Activity {
	EditText userid, password;
	Button login;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.userr);
		userid = (EditText) findViewById(R.id.editText1);
		password = (EditText) findViewById(R.id.editText2);
		login=(Button)findViewById(R.id.button1);
		login.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent k=new Intent(UserLogin.this,Register.class);
				startActivity(k);
			}
		});
	}

}
