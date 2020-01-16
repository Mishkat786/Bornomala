package world.mishkat.bornomala;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class a4Activity extends AppCompatActivity {
    private Button a4,apl4;
    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a4);
        a4=(Button)findViewById(R.id.a4);

        mediaPlayer = new MediaPlayer();
        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.egol);

        a4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(a4Activity.this,a5Activity.class);
                startActivity(i);

            }
        });

        apl4=(Button)findViewById(R.id.apl4);

        apl4.setOnClickListener(new View.OnClickListener() {
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
            apl4.setText("Pause");
        }
    }


    public void startMusic(){
        if (mediaPlayer != null ){
            mediaPlayer.start();
            apl4.setText("Play");
        }
    }

}
