package edu.uncw.wilmingtonwalkabout;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class DetailActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_activity);

        Intent intent = getIntent();
        String page = intent.getStringExtra(MainActivity.savedStateMsg);
        if (page.equals("Battleship North Carolina")) {
            TextView textViewTBS = (TextView) findViewById(R.id.textViewTBS);
            TextView textViewBSI = (TextView) findViewById(R.id.textViewBSI);

            textViewTBS.setVisibility(View.VISIBLE);
            textViewBSI.setVisibility(View.VISIBLE);
        } else if (page.equals("Carolina Beach State Park")) {
            TextView textViewCBSP = (TextView) findViewById(R.id.textViewCBSP);
            TextView textViewCBSPI = (TextView) findViewById(R.id.textViewCBSPI);

            textViewCBSP.setVisibility(View.VISIBLE);
            textViewCBSPI.setVisibility(View.VISIBLE);
        } else if (page.equals("Haunted Cotton Exchange Tour")) {
            TextView textViewTHT = (TextView) findViewById(R.id.textViewTHT);
            TextView textViewHTI = (TextView) findViewById(R.id.textViewHTI);

            textViewTHT.setVisibility(View.VISIBLE);
            textViewHTI.setVisibility(View.VISIBLE);
        }
        else if (page.equals("Fort Fischer State Historic Site")) {
            TextView textViewFF = (TextView) findViewById(R.id.textViewFF);
            TextView textViewFFI = (TextView) findViewById(R.id.textviewFFI);

            textViewFF.setVisibility(View.VISIBLE);
            textViewFFI.setVisibility(View.VISIBLE);
        }

    }



}