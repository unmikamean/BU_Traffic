package bu.unmika.butraffic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ScoreActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);

        int intScore = getIntent().getIntExtra("Score",0);
        TextView scoreTextView = (TextView) findViewById(R.id.textView);
        scoreTextView.setText(Integer.toString(intScore));


    }
}
