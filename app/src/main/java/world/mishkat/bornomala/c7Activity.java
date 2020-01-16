package world.mishkat.bornomala;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class c7Activity extends AppCompatActivity {

    private Button c7,cpl7;
    private MediaPlayer mediaPlayer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c7);

        c7=(Button)findViewById(R.id.c7);

        mediaPlayer = new MediaPlayer();
        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.cho);

        c7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(c7Activity.this,MainActivity.class);
                startActivity(i);

            }
        });

        cpl7=(Button)findViewById(R.id.cpl7);

        cpl7.setOnClickListener(new View.OnClickListener() {
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
            cpl7.setText("Pause");
        }
    }


    public void startMusic(){
        if (mediaPlayer != null ){
            mediaPlayer.start();
            cpl7.setText("Play");
        }
    }
}
