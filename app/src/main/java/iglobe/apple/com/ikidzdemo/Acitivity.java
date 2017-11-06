package iglobe.apple.com.ikidzdemo;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.widget.GridView;

import java.util.ArrayList;

public class Acitivity extends Activity {

    GridView gv;
    Context context;
    ArrayList prgmName;
    public static String [] prgmNameList={"Photo","Video","Observation","Food","Nap","Potty","Note","Kudos","Custom","Meds","Name to Face","Incident"};
    public static int [] prgmImages={R.drawable.ic_photo_camera_blue,R.drawable.ic_videocam_pink,R.drawable.ic_observation_light_green,R.drawable.ic_restaurant_menu_green,R.drawable.ic_child_care_indigo,R.drawable.ic_android_blue_500_24dp,R.drawable.ic_event_note_cyan,R.drawable.ic_filter_center_focus_purple,R.drawable.ic_settings_input_svideo_yellow,R.drawable.ic_local_hospital_yellow,R.drawable.ic_directions_run_blue_grey,R.drawable.ic_dns_red};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acitivity);
        gv=(GridView) findViewById(R.id.activities);
        gv.setAdapter(new CustomAdapter(this, prgmNameList,prgmImages));
    }
    @Override

    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.activity_main_drawer, menu);
        return true;
    }


}


