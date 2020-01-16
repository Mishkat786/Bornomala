package world.mishkat.bornomala;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class fiveActivity extends AppCompatActivity {

    private Button nxt5,pl5;
    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_five);
        mediaPlayer = new MediaPlayer();
        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.five);

        nxt5=(Button)findViewById(R.id.nxt5);

        nxt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new  Intent(fiveActivity.this,sixActivity.class);
                startActivity(i);
            }
        });


        pl5=(Button)findViewById(R.id.pl5);

        pl5.setOnClickListener(new View.OnClickListener() {
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
            pl5.setText("Pause");
        }
    }


    public void startMusic(){
        if (mediaPlayer != null ){
            mediaPlayer.start();
            pl5.setText("Play");
        }
    }
}
