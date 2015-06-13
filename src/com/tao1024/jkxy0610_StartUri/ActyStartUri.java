package com.tao1024.jkxy0610_StartUri;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import com.tao1024.jkxy0610_activity.R;

public class ActyStartUri extends Activity {
	
	private Button btnStartUri;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.acty_start_uri);
		initView();
	}

	private void initView() {
		btnStartUri = (Button) findViewById(R.id.btnStartUri);
		
		btnStartUri.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.baidu.com"));
				startActivity(intent);
			}
		});
	}

}
