package com.tao1024.jkxy0610_PassObject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import com.tao1024.jkxy0610_activity.R;

public class ActyPassObjSer extends Activity {

	private Button btnPassObjSer;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.acty_pass_obj_ser);
		initView();
	}
	private void initView() {
		btnPassObjSer = (Button) findViewById(R.id.btnPassObjSer);
		
		btnPassObjSer.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(ActyPassObjSer.this,ActyGetObjSer.class);
				intent.putExtra("objser", new ObjUserSer("文天祥",22));
				startActivity(intent);
			}
		});
	}

}
