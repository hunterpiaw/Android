package th.ac.rru.csit.k_2_53023263002;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

public class VDO extends Activity {
	Button b2;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vdo);

        final Intent i=new Intent();

 
VideoView videoView1 = (VideoView) findViewById(R.id.videoView1); 
MediaController mc = new MediaController(this);
mc.setAnchorView(videoView1);
mc.setMediaPlayer(videoView1); 
videoView1.setMediaController(mc); 
videoView1.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.korkai); 
videoView1.start(); 



b2= (Button)findViewById(R.id.button2);
b2.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View v) {
 
		i.setClass(VDO.this , MainActivity.class); 
		startActivity(i);
		
	}
});



    }
@Override
public void onDestroy() {
super.onDestroy();
android.os.Process.killProcess(android.os.Process.myPid());
    
}
public void onDestroy1() {
super.onDestroy();
 
android.os.Process.killProcess(android.os.Process.myPid());
        
        
        
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.vdo, menu);
        return true;
    }
}

