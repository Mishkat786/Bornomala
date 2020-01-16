package world.mishkat.bornomala;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class threeActivity extends AppCompatActivity {

    private Button nxt3,pl3;
    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three);

        mediaPlayer = new MediaPlayer();
        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.three);

        nxt3=(Button)findViewById(R.id.nxt3);

        nxt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new  Intent(threeActivity.this,fourActivity.class);
                startActivity(i);
            }
        });


        pl3=(Button)findViewById(R.id.pl3);

        pl3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mediaPlayer.isPlaying()){

                    pauseMusic();


                }else {

                    startMusic();
                }
            }
        });

    }


    public void pauseMusic(){
        if (mediaPlayer!= null){
            mediaPlayer.pause();
            pl3.setText("Pause");
        }
    }


    public void startMusic(){
        if (mediaPlayer != null ){
            mediaPlayer.start();
            pl3.setText("Play");
        }
    }
}
