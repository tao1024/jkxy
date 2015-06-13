package com.tao1024.jkxy0610_PassSimValue;

import com.tao1024.jkxy0610_activity.R;
import com.tao1024.jkxy0610_activity.R.id;
import com.tao1024.jkxy0610_activity.R.layout;
import com.tao1024.jkxy0610_activity.R.menu;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class ActyPassSimValue extends Activity {
	
	private Button btnPassSimValue;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.acty_pass_sim_value);
		initView();
	}
	
	private void initView() {
		btnPassSimValue = (Button) findViewById(R.id.btnPassSimValue);
		
		btnPassSimValue.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(ActyPassSimValue.this,ActyGetSimValue.class);
				intent.putExtra("name", "王三");
				intent.putExtra("age", 12);
				startActivity(intent);
			}
		});
	}

}
