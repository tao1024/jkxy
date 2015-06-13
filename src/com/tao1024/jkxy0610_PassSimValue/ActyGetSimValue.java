package com.tao1024.jkxy0610_PassSimValue;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.tao1024.jkxy0610_activity.R;

public class ActyGetSimValue extends Activity {
	
	private TextView tvGetSimValue;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.acty_get_sim_value);
		initView();
	}

	private void initView() {
		tvGetSimValue = (TextView)findViewById(R.id.tvGetSimValue);
		Intent intent = getIntent();
		String value = intent.getExtras().getString("name");
		tvGetSimValue.setText(value);
	}

}
