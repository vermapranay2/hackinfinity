package org.tensorflow.demo;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Main2Activity extends Activity {

    private ImageButton b1;
    private ImageButton b2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        b1 = (ImageButton)findViewById(R.id.scanLeavesBtn);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent scanAct = new Intent(Main2Activity.this, ClassifierActivity.class);
                startActivity(scanAct);
            }
        });

        b2 = (ImageButton)findViewById(R.id.pesticideDealerBtn);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try
                {
                   String address = "pesticide+stores+near+me";
                   Intent geoIntent = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("geo:0,0?q="+address));
                   startActivity(geoIntent);
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
        });
    }
}
