package com.example.aicte;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class College extends Activity {
	EditText State, District, University, Course, Institutes;
	Button Search;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.collegee);
		State=(EditText)findViewById(R.id.editText1);
		District=(EditText)findViewById(R.id.editText2);
		University=(EditText)findViewById(R.id.editText3);
		Course=(EditText)findViewById(R.id.editText4);
		Institutes=(EditText)findViewById(R.id.editText5);
		Search=(Button)findViewById(R.id.button1);
		Search.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent n=new Intent(College.this,Navigation.class);
				startActivity(n);
				
			}
		});
		
	}
}
