package com.tao1024.jkxy0610_PassBundle;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.tao1024.jkxy0610_activity.R;

public class ActyGetBundle2 extends Activity {
	
	private TextView tvGetBundle;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.acty_get_bundle);
		initView();
	}

	private void initView() {
		tvGetBundle = (TextView)findViewById(R.id.tvGetBundle);
		Intent intent = getIntent();
		Bundle data = intent.getBundleExtra("data");
		String value = String.format("name=%s,age=%d,sex=%s", data.getString("name"),data.getInt("age"),data.getString("sex","female"));
		tvGetBundle.setText(value);
	}

}
