package bu.unmika.butraffic;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import static bu.unmika.butraffic.R.id.button;

public class MainActivity extends AppCompatActivity {

    //Explicit ประกาศตัวแปร
    private ListView trafficListView;
    private Button aboutMeButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Bind Widget
        bindWidget();

        //Button Controller
        buttonController();

    }  //Main Method เริ่มต้นการทำงานที่ Method นี้

    private void buttonController() {
        aboutMeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Sound Effect
                MediaPlayer buttonPlayer = MediaPlayer.create(getBaseContext(), R.raw.lion);
                buttonPlayer.start();

                // Intent to WebView


            } //event
        });

    }

    private void bindWidget() {
        trafficListView = (ListView) findViewById(R.id.listView); //เชื่อมกับ ListView
        aboutMeButton = (Button) findViewById(button);

    }

} //Main Class นี่คือคลาสหลัก
