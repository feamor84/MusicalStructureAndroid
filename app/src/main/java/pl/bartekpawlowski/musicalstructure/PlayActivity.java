package pl.bartekpawlowski.musicalstructure;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.google.android.exoplayer2.core.*;

public class PlayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);
    }
}
