package com.tao1024.jkxy0610_StartActy;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import com.tao1024.jkxy0610_activity.R;

public class Acty_StartActy extends Activity {
	
	private Button btnStartActy;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.acty_start_acty);
		initView();
	}

	private void initView() {
		btnStartActy = (Button) findViewById(R.id.btnStartActy);
		
		btnStartActy.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(Acty_StartActy.this, Acty_NewActy.class);
				startActivity(intent);
			}
		});
	}


}
