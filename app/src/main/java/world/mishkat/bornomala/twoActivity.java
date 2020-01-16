package world.mishkat.bornomala;


import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class twoActivity extends AppCompatActivity {


    private Button nxt2,pl2;
    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);

        mediaPlayer = new MediaPlayer();
        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.two);

        nxt2=(Button)findViewById(R.id.nxt2);

        nxt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new  Intent(twoActivity.this,threeActivity.class);
                startActivity(i);
            }
        });


        pl2=(Button)findViewById(R.id.pl2);

        pl2.setOnClickListener(new View.OnClickListener() {
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
            pl2.setText("Pause");
        }
    }


    public void startMusic(){
        if (mediaPlayer != null ){
            mediaPlayer.start();
            pl2.setText("Play");
        }
    }

}
