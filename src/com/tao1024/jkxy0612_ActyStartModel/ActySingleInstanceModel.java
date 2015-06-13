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
 * singleInstance模式启动模式
 * 在一个新栈中创建该Activity实例，并让多个应用共享改栈中的该Activity实例。
 * 一旦改模式的Activity的实例存在于某个栈中，任何应用再激活改Activity时都会重用该栈中的实例，
 * 其效果相当于多个应用程序共享一个应用，不管谁激活该Activity都会进入同一个应用中。
 * 
 * 此启动模式和我们使用的浏览器工作原理类似，我们都知道在多个程序中访问浏览器时，
 * 如果当前浏览器没有打开，则打开浏览器，否则会在当前打开的浏览器中访问。
 * 此模式会节省大量的系统资源，因为他能保证要请求的Activity对象在当前的栈中只存在一个。
 */
public class ActySingleInstanceModel extends Activity {
	
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
		
		btnStandard.setText("SingleInstance启动模式");
		tvStandard.setText(String.format("TaskID:%d\nCurrentActivityID:%s", getTaskId(),toString()));
		
		btnStandard.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(ActySingleInstanceModel.this, ActySingleInstanceModel.class);
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
