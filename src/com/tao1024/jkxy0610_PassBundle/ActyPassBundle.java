package com.tao1024.jkxy0610_PassBundle;

import com.tao1024.jkxy0610_activity.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class ActyPassBundle extends Activity {
	
	private Button btnPassBundle1,btnPassBundle2;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.acty_pass_bundle);
		initView();
	}
	
	private void initView() {
		btnPassBundle1 = (Button) findViewById(R.id.btnPassBundle1);
		btnPassBundle2 = (Button) findViewById(R.id.btnPassBundle2);
		
		btnPassBundle1.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(ActyPassBundle.this,ActyGetBundle.class);
				Bundle bundle = new Bundle();
				bundle.putString("name", "王三");
				bundle.putInt("age", 12);
				intent.putExtras(bundle);
				startActivity(intent);
			}
		});
		
		btnPassBundle2.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(ActyPassBundle.this,ActyGetBundle2.class);
				Bundle bundle = new Bundle();
				bundle.putString("name", "李四");
				bundle.putInt("age", 22);
				intent.putExtra("data", bundle);
				startActivity(intent);
			}
		});
	}

}
