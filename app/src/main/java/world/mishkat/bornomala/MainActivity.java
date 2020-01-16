package world.mishkat.bornomala;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button b1;
    Button b2;
    Button b3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = (Button) findViewById(R.id.b1);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent স্বরবর্ণ=new Intent(MainActivity.this,Main4Activity.class);
                startActivity(স্বরবর্ণ);



            }
        });

        b2 = (Button) findViewById(R.id.b2);

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ব্যঞ্জনবর্ণ=new Intent(MainActivity.this,Main2Activity.class);
                startActivity(ব্যঞ্জনবর্ণ);


            }
        });

        b3 = (Button) findViewById(R.id.b3);

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent সংখ্যা=new Intent(MainActivity.this,Main3Activity.class);
                startActivity(সংখ্যা);

            }
        });




    }
}
