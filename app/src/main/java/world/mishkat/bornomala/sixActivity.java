package world.mishkat.bornomala;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class sixActivity extends AppCompatActivity {

    private Button nxt6,pl6;
    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_six);
        mediaPlayer = new MediaPlayer();
        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.six);

        nxt6=(Button)findViewById(R.id.nxt6);

        nxt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new  Intent(sixActivity.this,MainActivity.class);
                startActivity(i);
            }
        });


        pl6=(Button)findViewById(R.id.pl6);

        pl6.setOnClickListener(new View.OnClickListener() {
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
            pl6.setText("Pause");
        }
    }


    public void startMusic(){
        if (mediaPlayer != null ){
            mediaPlayer.start();
            pl6.setText("Play");
        }
    }
}
