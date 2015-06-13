package com.tao1024.jkxy0612_ActyStartModel;

import java.util.Date;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.tao1024.jkxy0610_activity.R;
/**
 * singleTop模式启动模式
 * 如果在任务的栈顶正好存在该Activity的实例， 就重用该实例，否者就会创建新的实例并放入栈顶
 * (即使栈中已经存在该Activity实例，只要不在栈顶，都会创建实例)。
 * 
 * 当我们在上面界面中点击"启动singleTop模式"按钮时，由于此Activity设置的启动模式为singleTop，
 * 因此它首先会检测当前栈顶是否为我们要请求的Activity对象，经验证成立，因此它不会创建新的Activity，而是引用当前栈顶的Activity。
 * 虽然它不会创建新的Activity对象，不过它每次回调用onNewIntent()方法
 */
public class ActySingleTopModel extends Activity {
	
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
		
		btnStandard.setText("SingleTop启动模式");
		tvStandard.setText(String.format("TaskID:%d\nCurrentActivityID:%s", getTaskId(),toString()));
		
		btnStandard.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(ActySingleTopModel.this, ActySingleTopModel.class);
				startActivity(intent);
			}
		});
	}
	
	//重写onNewIntent()，每次点击上面按钮时会输出当前日期
	@Override
	protected void onNewIntent(Intent intent) {
		super.onNewIntent(intent);
		Toast.makeText(this, new Date().toString(), 1).show();
	}

}
