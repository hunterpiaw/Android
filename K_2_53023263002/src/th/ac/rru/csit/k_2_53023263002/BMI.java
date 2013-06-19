package th.ac.rru.csit.k_2_53023263002;

 
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class BMI extends Activity {
Button b1,b2;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi);
        final Intent i=new Intent();
        b1= (Button)findViewById(R.id.button1);
         final EditText ab1 = (EditText) findViewById(R.id.EditText1);
         final EditText ab2 = (EditText) findViewById(R.id.EditText2);
        
        b1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				int asd1,asd2;
				float asd3;
				asd1 = Integer.parseInt(ab1.getText().toString());//น้ำหนัก
				asd2 = Integer.parseInt(ab2.getText().toString());//ส่วนสูง
				
				asd3 = (float)(asd2*2) / (float)asd1;

		    	StringBuilder ber = new StringBuilder(" ");
		    	ber.append(asd1+" / "+ asd2 +" * 2 "+"  = "+asd3);
					TextView tv = (TextView) findViewById(R.id.all_text);
		    	tv.setText(ber);
				
				
				
			}
		}
        
        		
        		);

        b2= (Button)findViewById(R.id.button2);
        b2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				i.setClass(BMI.this , MainActivity.class);
				startActivity(i);
				
			}
		});
        
        
        
        
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.bmi, menu);
        return true;
    }
}

