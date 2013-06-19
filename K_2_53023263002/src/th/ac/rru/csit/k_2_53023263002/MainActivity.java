package th.ac.rru.csit.k_2_53023263002; 

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {

Button b1,b2,bd3,b4;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Intent i=new Intent();
        
        

        b1= (Button)findViewById(R.id.button1);
        	b1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
					i.setClass(MainActivity.this , BMI.class);
					startActivity(i);
				
			}
		});
        	

            b2= (Button)findViewById(R.id.button2);
            	b2.setOnClickListener(new OnClickListener() {
    			@Override
    			public void onClick(View v) {
    				i.setClass(MainActivity.this , VDO.class);
    				startActivity(i);
    				}
    		});
            	

            	bd3= (Button)findViewById(R.id.button3);
            	bd3.setOnClickListener(new OnClickListener() {
        			@Override
        			public void onClick(View v) {
        				i.setClass(MainActivity.this , Calculator.class);
        				startActivity(i);
        				}
        		});

            	b4= (Button)findViewById(R.id.button4);
            	b4.setOnClickListener(new OnClickListener() {
        			@Override
        			public void onClick(View v) {
        				i.setClass(MainActivity.this , MAP.class);
        				startActivity(i);
        				}
        		});
    }
 
	public boolean onCreateOptionsMenu(Menu menu) { 
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
