package world.mishkat.bornomala;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class fourActivity extends AppCompatActivity {

    private Button nxt4,pl4;
    private MediaPlayer mediaPlayer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_four);
        mediaPlayer = new MediaPlayer();
        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.four);

        nxt4=(Button)findViewById(R.id.nxt4);

        nxt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new  Intent(fourActivity.this,fiveActivity.class);
                startActivity(i);
            }
        });


        pl4=(Button)findViewById(R.id.pl4);

        pl4.setOnClickListener(new View.OnClickListener() {
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
            pl4.setText("Pause");
        }
    }


    public void startMusic(){
        if (mediaPlayer != null ){
            mediaPlayer.start();
            pl4.setText("Play");
        }
    }
}
