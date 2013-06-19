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

public class Calculator extends Activity {

Button b1,b2,b3,b4,bb2;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_calculator);
		
  
        final Intent i=new Intent();
        b1= (Button)findViewById(R.id.button6); 
        b2= (Button)findViewById(R.id.button4); 
        b3= (Button)findViewById(R.id.button5); 
        b4= (Button)findViewById(R.id.button3);   
        
        
        	b1.setOnClickListener(new OnClickListener() {
        		@Override
        				public void onClick(View v) {
        				int asd1,asd2 ;
        				float asd3;
        		        final EditText ab1 = (EditText) findViewById(R.id.editText1);
        		        final EditText ab2 = (EditText) findViewById(R.id.editText2);
        				asd1 = Integer.parseInt(ab1.getText().toString());//1
        				asd2 = Integer.parseInt(ab2.getText().toString());//2
	        		        asd3 = (float)asd2 + (float)asd1;
        					StringBuilder ber = new StringBuilder(" ");
        					TextView tv = (TextView) findViewById(R.id.all_text); 
        					 ber.append( asd1 + " + " + asd2 + " = " + asd3 );
        					 tv.setText(ber);
        					 } } );
        	b2.setOnClickListener(new OnClickListener() {
        		@Override
        				public void onClick(View v) {
        				int asd1,asd2 ;
        				float asd3;
        		        final EditText ab1 = (EditText) findViewById(R.id.editText1);
        		        final EditText ab2 = (EditText) findViewById(R.id.editText2);
        				asd1 = Integer.parseInt(ab1.getText().toString());//1
        				asd2 = Integer.parseInt(ab2.getText().toString());//2
	        		        asd3 = (float)asd1 - (float)asd2;
        					StringBuilder ber = new StringBuilder(" ");
        					TextView tv = (TextView) findViewById(R.id.all_text); 
        					 ber.append( asd1 + " - " + asd2 + " = " + asd3 );
        					 tv.setText(ber);
        					 } } );
        	b3.setOnClickListener(new OnClickListener() {
        		@Override
        				public void onClick(View v) {
        				int asd1,asd2 ;
        				float asd3;
        		        final EditText ab1 = (EditText) findViewById(R.id.editText1);
        		        final EditText ab2 = (EditText) findViewById(R.id.editText2);
        				asd1 = Integer.parseInt(ab1.getText().toString());//1
        				asd2 = Integer.parseInt(ab2.getText().toString());//2
	        		        asd3 = (float)asd1 * (float)asd2;
        					StringBuilder ber = new StringBuilder(" ");
        					TextView tv = (TextView) findViewById(R.id.all_text); 
        					 ber.append( asd1 + " * " + asd2 + " = " + asd3 );
        					 tv.setText(ber);
        					 } } );
        	b4.setOnClickListener(new OnClickListener() {
        		@Override
        				public void onClick(View v) {
        				int asd1,asd2 ;
        				float asd3;
        		        final EditText ab1 = (EditText) findViewById(R.id.editText1);
        		        final EditText ab2 = (EditText) findViewById(R.id.editText2);
        				asd1 = Integer.parseInt(ab1.getText().toString());//1
        				asd2 = Integer.parseInt(ab2.getText().toString());//2
	        		        asd3 = (float)asd1 / (float)asd2;
        					StringBuilder ber = new StringBuilder(" ");
        					TextView tv = (TextView) findViewById(R.id.all_text); 
        					 ber.append( asd2 + " % " + asd1 + " = " + asd3 );
        					 tv.setText(ber);
        					 } } );

        	
        	
        	
        	
        	
        	
            bb2= (Button)findViewById(R.id.button2);
            bb2.setOnClickListener(new OnClickListener() {
    			
    			@Override
    			public void onClick(View v) {
    				i.setClass(Calculator.this , MainActivity.class);
    				startActivity(i);
    				
    			}
    		});
        
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.calculator, menu);
		return true;
	}

}
