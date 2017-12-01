package yukai.dicee;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ImageView leftDice = (ImageView) findViewById(R.id.image_leftDice) ;
        final ImageView rightDice = (ImageView) findViewById(R.id.image_rightDice);
        Button rollButton = (Button) findViewById(R.id.rollbutton);

        final int[] diceArray = {
                R.drawable.dice1,
                R.drawable.dice2,
                R.drawable.dice3,
                R.drawable.dice4,
                R.drawable.dice5,
                R.drawable.dice6,
        };

        rollButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                Log.d("Dicee","The button has been pressed!");

                Random random = new Random();

                int number = random.nextInt(6);
                Log.d("Dicee","The left dice number is " + (number+1));
                leftDice.setImageResource(diceArray[number]);

                number = random.nextInt(6);
                Log.d("Dicee","The right number is " + (number+1));
                rightDice.setImageResource(diceArray[number]);
            }
        });
    }
}
