package android.guide.receiveintent;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SharedTextActivity extends AppCompatActivity {
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sharedtext_layout);

        textView = findViewById(R.id.textviewid);

//      TODO 1 : CREATE AN INTENT OBJECT

//        getIntent() will receive  incoming intent from the system
        Intent intent = getIntent();
//        make a string to Handle the incoming content
        String sharedText = intent.getStringExtra(Intent.EXTRA_TEXT);
//        set the shared text into text view
        textView.setText(sharedText);

        Log.d("mainactivity", "onCreate: "+ sharedText);

    }
}
