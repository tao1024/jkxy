package com.tao1024.jkxy0612_ActyIntentModel;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import com.tao1024.jkxy0610_activity.R;

public class ActyInentImplicit extends Activity {
	
	private Button btnStartActy, btnStartActy2, btnStartActy3;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.acty_inent_implicit);
		initView();
	}

	private void initView() {
		btnStartActy = (Button) findViewById(R.id.btnStartActy);
		btnStartActy2 = (Button) findViewById(R.id.btnStartActy2);
		btnStartActy3 = (Button) findViewById(R.id.btnStartActy3);
		
		btnStartActy.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent = new Intent("123456789");
				startActivity(intent);
			}
		});
		
		btnStartActy2.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				//约定俗成：包名.intent.action.类名
				Intent intent = new Intent("com.tao1024.jkxy0612_ActyIntentModel.intent.action.ActyInentImplicitDest",Uri.parse("app://hello"));
				startActivity(intent);
			}
		});
		
		btnStartActy3.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				//约定俗成：包名.intent.action.类名
				Intent intent = new Intent(ActyInentImplicitDest2.ACTION);
				startActivity(intent);
			}
		});
	}

}
