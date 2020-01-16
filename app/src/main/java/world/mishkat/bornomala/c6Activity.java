package world.mishkat.bornomala;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class c6Activity extends AppCompatActivity {

    private Button c6,cpl6;
    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c6);
        c6=(Button)findViewById(R.id.c6);

        mediaPlayer = new MediaPlayer();
        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.ca);

        c6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(c6Activity.this,c7Activity.class);
                startActivity(i);

            }
        });

        cpl6=(Button)findViewById(R.id.cpl6);

        cpl6.setOnClickListener(new View.OnClickListener() {
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
            cpl6.setText("Pause");
        }
    }


    public void startMusic(){
        if (mediaPlayer != null ){
            mediaPlayer.start();
            cpl6.setText("Play");
        }
    }
}
