package nikhil.gupta;

import org.json.JSONObject;
import android.app.Activity;
import android.os.Bundle;
import android.widget.CalendarView;
import android.widget.CalendarView.OnDateChangeListener;
import android.widget.Toast;

public class TestCalActivity extends Activity{
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        CalendarView CV = (CalendarView) findViewById(R.id.calendarView1);



        
        CV.setOnDateChangeListener(new OnDateChangeListener(){

			@Override
			public void onSelectedDayChange(CalendarView view, int year,
					int month, int dayOfMonth) {
				// TODO Auto-generated method stub
				// getting JSON string from URL
		        JSONParser jParser = new JSONParser();
		    	String url = "http://192.168.1.2/Yo/test.php";
				JSONObject json = jParser.getJSONFromUrl(url);
				if(json != null){
				Toast.makeText(getApplicationContext(), json.toString(), Toast.LENGTH_SHORT).show();
			}}
        	
        });
        
    }
}