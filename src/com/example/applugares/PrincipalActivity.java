package com.example.applugares;


import com.example.applugares.R.id;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class PrincipalActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_principal);
		
		Button btn1 = (Button) findViewById(id.btnCrear);
		btn1.setOnClickListener(btnListener);
		btn1.setBackgroundColor(Color.argb(255, 66, 27, 223));
		

		Button btn2 = (Button) findViewById(id.btnElegir);
		btn2.setBackgroundColor(Color.argb(255, 66, 27, 223));
		
		Button btn3 = (Button) findViewById(id.btnSalir);
		btn3.setBackgroundColor(Color.argb(255, 66, 27, 223));	
		}
		private OnClickListener btnListener = new OnClickListener() {
			public void onClick(View view)
			{
				Intent i = new Intent(PrincipalActivity.this, ItinerarioActivity.class);
		        startActivity(i);
				Toast.makeText(getBaseContext(),
						"Has seleccionado "+((Button) view).getText(),
						Toast.LENGTH_SHORT).show();
			}
		};
		
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.principal, menu);
		return true;
	}

}
