package fun.rabshet.ilovechplaying;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
TextView TVone ,TVtwo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TVone=(TextView)findViewById(R.id.textView);
        TVtwo=(TextView)findViewById(R.id.texttw);
        Typeface type = Typeface.createFromAsset(getAssets(), "fonts/hh.ttf");
        TVone.setTypeface(type);
        TVtwo.setTypeface(type);

    }
}
