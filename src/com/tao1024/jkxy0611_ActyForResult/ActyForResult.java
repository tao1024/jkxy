package com.tao1024.jkxy0611_ActyForResult;

import com.tao1024.jkxy0610_activity.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class ActyForResult extends Activity{

	private Button btnStartActy;
	private TextView tvResult;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.acty_for_result);
		initView();
	}
	
	private void initView() {
		btnStartActy = (Button) findViewById(R.id.btnStartActy);
		tvResult = (TextView) findViewById(R.id.tvResult);
		
		btnStartActy.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(ActyForResult.this, ActyGetResult.class);
				startActivityForResult(intent, 0);
			}
		});
	}
	
	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		super.onActivityResult(requestCode, resultCode, data);
		if(requestCode==0 && resultCode==1001){
			tvResult.setText("另一个Activity返回的数据为："+data.getStringExtra("content"));
		}else{
			tvResult.setText("另一个Activity返回的数据为空");
		}
	}
	
}
