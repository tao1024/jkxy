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
 * singleTask模式启动模式
 * 如果在栈中已经有该Activity的实例，就重用该实例(会调用实例的onNewIntent())。
 * 重用时，会让该实例回到栈顶，因此在它上面的实例将会被移除栈。如果栈中不存在该实例，将会创建新的实例放入栈中。
 * 
 * 此启动模式和singleTop在名字上即可看出区别，即singleTop每次只检测当前栈顶的Activity是否是我们需要请求创建的，
 * 而singleTask则会检测栈中全部的Activity对象，从上向下，
 * 如果检测到是我们所请求的则会消灭此Activity对象上面的对象，直接把检测到的我们需要的Activity置为栈顶。
 */
public class ActySingleTaskModel extends Activity {
	
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
		
		btnStandard.setText("SingleTask启动模式");
		tvStandard.setText(String.format("TaskID:%d\nCurrentActivityID:%s", getTaskId(),toString()));
		
		btnStandard.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(ActySingleTaskModel.this, ActySingleTaskModel.class);
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
