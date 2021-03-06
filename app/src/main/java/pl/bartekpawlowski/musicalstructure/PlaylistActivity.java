package pl.bartekpawlowski.musicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;

public class PlaylistActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playlist);

        ViewGroup playButton = (ViewGroup) findViewById(R.id.playButton);
        playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent playIntent = new Intent(PlaylistActivity.this, PlayActivity.class);
                startActivity(playIntent);
            }
        });

        ViewGroup paymentButton = (ViewGroup) findViewById(R.id.paymentButton);
        paymentButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent paymentIntent = new Intent(PlaylistActivity.this, PaymentActivity.class);
                startActivity(paymentIntent);
            }
        });
    }
}
