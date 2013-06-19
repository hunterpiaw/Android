package th.ac.rru.csit.k_2_53023263002;

import java.io.IOException;
import java.io.InputStream;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;

public class MAP extends Activity {
	Button  b2;
    ImageView imageViews1;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_map);
        final Intent i=new Intent();

        
//        //ประกาศตัวแปรชนิด ImageView โดยให้เชื่อมโยงกับ imageView1 ในเลย์เอ้าท์
//        ImageView imageView1=(ImageView)findViewById(R.id.imageView1);
//        
//        //กำหนดภาพชนิด Bitmap ให้กับ imageView1 โดยเรียกใช้เมธอด getMapImage(ค่าละติจูด,ค่าลองกิจูด)
//        imageView1.setImageBitmap(getMapImage(13.730323,100.753426));
//		
        imageViews1 = (ImageView)findViewById(R.id.imageView1);
        imageViews1.setImageBitmap(getMapImage(13.730323,100.753426));
        
        
        
        
		b2= (Button)findViewById(R.id.button2);
        b2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				i.setClass(MAP.this , MainActivity.class);
				startActivity(i);
				
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.ma, menu);
		return true;
	}
	
	

public Bitmap getMapImage(double lati, double longi){
  //สร้างตัวแปรสตริง เก็บค่า URL ของ static map
      String URL = "http://maps.google.com/maps/api/staticmap?center="+lati+","+longi //กำหนดจุดศูนย์กลางของภาพ     
        +"&zoom=16"	 //กำหนดระดับการซูม
                  +"&markers="  //กำหนดค่าพิกัดของมาร์กเกอร์
                  +"icon:http://cdn1.iconfinder.com/data/icons/Map-Markers-Icons-Demo-PNG/48/Map-Marker-Board-Pink.png"	               
                  +"%7C"+lati+","+longi  //กำหนดค่าพิกัดของมาร์กเกอร์	             
                  +"&size=512x300&sensor=false" //กำหนดขนาดของภาพแผนที่	                               
                  +"&maptype=satellite"; //กำหนดรูปแบบภาพแผนที่  satellite (ภาพถ่ายดาวเทียม), roadmap (ภาพแผนที่เวคเตอร์), terrain (ภาพลักษณะภูมิประเทศ) 
      Bitmap bmp = null;      //ประกาศตัวแปรชนิด Bitmap
      HttpClient httpclient = new DefaultHttpClient();  //สร้างอ็อบเจ็กต์ httpclient
      HttpGet request = new HttpGet(URL); //สร้างอ็อบเจ็กต์ request โดยกำหนดพารามิเตอร์เป็น URL
      InputStream in = null;	 //สร้างตัวแปรชนิด InputStream ชื่อ in โดยกำหนดค่าเริ่มต้นเป็นค่าว่าง
      try {
          in = httpclient.execute(request).getEntity().getContent(); //ตัวแปร in เก็บค่าที่ได้จากการประมวลผลของ httpclient เมื่อส่ง request ไปยังเซิร์ฟเวอร์ 
          bmp = BitmapFactory.decodeStream(in);	 //ตัวแปร bmp เก็บค่าที่ได้จากการแปลงค่าในตัวแปร in เป็น Bitmap
          in.close();
      } catch (IllegalStateException e) {
          // TODO Auto-generated catch block
          e.printStackTrace();
      } catch (ClientProtocolException e) {
          // TODO Auto-generated catch block
          e.printStackTrace();
      } catch (IOException e) {
          // TODO Auto-generated catch block
          e.printStackTrace();
      }
      return bmp;	//ส่งค่าตัวแปรชนิด Bitmap ให้กับผู้เรียกใช้งานเมธอด
  }


}
 
