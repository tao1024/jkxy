package com.tao1024.jkxy0611_ActyForResult;

import com.tao1024.jkxy0610_activity.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class ActyGetResult extends Activity{

	private Button btnBack;
	private EditText edtInput;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.acty_get_result);
		initView();
	}
	
	private void initView() {
		btnBack = (Button) findViewById(R.id.btnBack);
		edtInput = (EditText) findViewById(R.id.edtInput);
		
		btnBack.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(ActyGetResult.this, ActyForResult.class);
				intent.putExtra("content", edtInput.getText().toString());
				setResult(1001, intent);
				finish();
			}
		});
		
	}
	
}
