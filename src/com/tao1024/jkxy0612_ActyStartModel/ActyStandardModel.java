package com.tao1024.jkxy0612_ActyStartModel;

import com.tao1024.jkxy0610_activity.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
/**
 * standard模式启动模式
 * 每次激活Activity时都会创建Activity，并放入任务栈中。
 * 
 * Standard模式是每次都会创建新的Activity对象，当点击返回按钮时，他会将栈顶(当前Activity)消灭，然后跳到下一层，
 * 例如如果现在Activity是44ed8c50，那么当我们点击返回时Activity会变为44f28a48，
 * 不过此时在这个Activity中再次点击按钮创建对象时，它会另外创建新的Activity对象，
 * 这种模式可能大多数情况下不是我们需要的，因为对系统性能的消耗过大。
 */
public class ActyStandardModel extends Activity {
	
	private TextView tvStandard;
	private Button btnStandard;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.acty_standard_model);
		initView();
	}

	private void initView() {
		tvStandard = (TextView) findViewById(R.id.tvStandard);
		btnStandard = (Button) findViewById(R.id.btnStandard);
		
		tvStandard.setText(String.format("TaskID:%d\nCurrentActivityID:%s", getTaskId(),toString()));
		
		btnStandard.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(ActyStandardModel.this, ActyStandardModel.class);
				startActivity(intent);
			}
		});
	}

}
