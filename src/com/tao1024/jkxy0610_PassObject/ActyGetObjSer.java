package com.tao1024.jkxy0610_PassObject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.tao1024.jkxy0610_activity.R;

public class ActyGetObjSer extends Activity {
	
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
		ObjUserPar user = (ObjUserPar) intent.getSerializableExtra("objpar");
		String value = String.format("User info(name=%s,age=%d)", user.getName(),user.getAge());
		tvGetBundle.setText(value);
	}

}
