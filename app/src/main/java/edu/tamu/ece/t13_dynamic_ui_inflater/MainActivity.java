package edu.tamu.ece.t13_dynamic_ui_inflater;

import android.support.annotation.DrawableRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LinearLayout layout = (LinearLayout) findViewById(R.id.mainlayout);


        //First item to inflate
        View cat = getLayoutInflater().inflate(R.layout.animal,layout);
        ImageButton catpic= (ImageButton) cat.findViewById(R.id.pic);
        catpic.setImageResource(R.drawable.lion);

        TextView cattext= (TextView) cat.findViewById(R.id.name);
        String catname = "Lion";
        cattext.setText(catname);

        catpic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Growl!", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
