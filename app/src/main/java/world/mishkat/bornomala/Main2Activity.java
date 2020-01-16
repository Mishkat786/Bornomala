package world.mishkat.bornomala;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {


    private Button c1,cpl1;
    private MediaPlayer mediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        c1=(Button)findViewById(R.id.c1);

        mediaPlayer = new MediaPlayer();
        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.ka);

        c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Main2Activity.this,C2Activity.class);
                startActivity(i);

            }
        });

        cpl1=(Button)findViewById(R.id.cpl1);

        cpl1.setOnClickListener(new View.OnClickListener() {
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
            cpl1.setText("Pause");
        }
    }


    public void startMusic(){
        if (mediaPlayer != null ){
            mediaPlayer.start();
            cpl1.setText("Play");
        }
    }
}
