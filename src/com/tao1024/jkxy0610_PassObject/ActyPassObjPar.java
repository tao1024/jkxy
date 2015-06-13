package com.tao1024.jkxy0610_PassObject;

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

public class ActyPassObjPar extends Activity {

	private Button btnPassObjSer;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.acty_pass_obj_ser);
		initView();
	}
	private void initView() {
		btnPassObjSer = (Button) findViewById(R.id.btnPassObjSer);
		btnPassObjSer.setText("通过Parcelable传递值对象");
		
		btnPassObjSer.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(ActyPassObjPar.this, ActyGetObjPar.class);
				intent.putExtra("objpar", new ObjUserPar("文天祥",22));
				startActivity(intent);
			}
		});
	}
}
