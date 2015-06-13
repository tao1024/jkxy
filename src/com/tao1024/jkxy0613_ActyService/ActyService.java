package com.tao1024.jkxy0613_ActyService;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import com.tao1024.jkxy0610_activity.R;

public class ActyService extends Activity implements OnClickListener, ServiceConnection{

	private Button btnStartService, btnStopService, btnBindService, btnUnbindService;
	private Intent intent;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.acty_service);
		initView();
	}

	private void initView() {
		intent = new Intent(ActyService.this, MyService.class);
		btnStartService = (Button) findViewById(R.id.btnStartService);
		btnStopService = (Button) findViewById(R.id.btnStopService);
		btnBindService = (Button) findViewById(R.id.btnBindService);
		btnUnbindService = (Button) findViewById(R.id.btnUnbindService);
		
		btnStartService.setOnClickListener(this);
		btnStopService.setOnClickListener(this);
		btnBindService.setOnClickListener(this);
		btnUnbindService.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		switch(v.getId()){
			case R.id.btnStartService:
				startService(intent);
				break;
			case R.id.btnStopService:
				stopService(intent);
				break;
			case R.id.btnBindService:
				bindService(intent, this, Context.BIND_AUTO_CREATE);
				break;
			case R.id.btnUnbindService:
				unbindService(this);
				Log.e("btnUnbindService", "Service已解绑");
				break;
		}
	}

	@Override
	public void onServiceConnected(ComponentName name, IBinder service) {
		System.out.println("Service已连接");
	}

	@Override
	public void onServiceDisconnected(ComponentName name) {
		System.out.println("Service已崩溃");
	}

}
