package pl.bartekpawlowski.musicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;

public class PaymentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);

        ViewGroup playButton = (ViewGroup) findViewById(R.id.playButton);
        playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent playIntent = new Intent(PaymentActivity.this, PlayActivity.class);
                startActivity(playIntent);
            }
        });

        ViewGroup playlistButton = (ViewGroup) findViewById(R.id.playlistButton);
        playlistButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent playlistIntent = new Intent(PaymentActivity.this, PlaylistActivity.class);
                startActivity(playlistIntent);
            }
        });
    }
}
