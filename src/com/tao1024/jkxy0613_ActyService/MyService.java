package com.tao1024.jkxy0613_ActyService;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;

public class MyService extends Service {
	
	private Boolean serviceRunning;
	
	public MyService(){};

	@Override
	public IBinder onBind(Intent intent) {
		return new Binder();
	}
	
	@Override
	public void onCreate() {
		super.onCreate();
		System.out.println("创建一个服务！");
		
		serviceRunning = true;
		
		new Thread(){
			@Override
			public void run() {
				super.run();
				while(serviceRunning){
					System.out.println("服务正在运行……");
					try {
						sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			};
		}.start();
	}
	
	@Override
	public void onDestroy() {
		super.onDestroy();
		System.out.println("销毁一个服务！");
		serviceRunning = false;
	}

	@Override
	public int onStartCommand(Intent intent, int flags, int startId) {
		System.out.println("运行onStartCommand");
		return super.onStartCommand(intent, flags, startId);
	}
}
