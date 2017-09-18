package com.example.aicte;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class Emailus extends Activity{
	EditText emailus;
	Button submit;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.email);
		emailus=(EditText)findViewById(R.id.editText1);
		submit=(Button)findViewById(R.id.button1);
	}
	

}
