package edu.uncw.wilmingtonwalkabout;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    public static String savedStateMsg = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner spinner = findViewById(R.id.spinner1);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.Locations, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);

        if(savedInstanceState!= null) {
            savedStateMsg = savedInstanceState.getString("savedStateMsg");
            if (savedStateMsg.equals("Battleship North Carolina")) {
                TextView textViewTBS = (TextView) findViewById(R.id.textViewTBS);
                textViewTBS.setVisibility(View.VISIBLE);
                TextView textViewBeach = (TextView) findViewById(R.id.textViewCBSP);
                textViewBeach.setVisibility(View.GONE);
                TextView textViewTour = (TextView) findViewById(R.id.textViewTHT);
                textViewTour.setVisibility(View.GONE);
                TextView textViewFort = (TextView) findViewById(R.id.textViewFF);
                textViewFort.setVisibility(View.GONE);
            } else if (savedStateMsg.equals("Carolina Beach State Park")) {
                TextView textViewBattleship = (TextView) findViewById(R.id.textViewTBS);
                textViewBattleship.setVisibility(View.GONE);
                TextView textViewMuseum = (TextView) findViewById(R.id.textViewCBSP);
                textViewMuseum.setVisibility(View.VISIBLE);
                TextView textViewTour = (TextView) findViewById(R.id.textViewTHT);
                textViewTour.setVisibility(View.GONE);
                TextView textViewFort = (TextView) findViewById(R.id.textViewFF);
                textViewFort.setVisibility(View.GONE);
            } else if (savedStateMsg.equals("Haunted Cotton Exchange Tour")) {
                TextView textViewBattleship = (TextView) findViewById(R.id.textViewTBS);
                textViewBattleship.setVisibility(View.GONE);
                TextView textViewMuseum = (TextView) findViewById(R.id.textViewCBSP);
                textViewMuseum.setVisibility(View.GONE);
                TextView textViewTour = (TextView) findViewById(R.id.textViewTHT);
                textViewTour.setVisibility(View.VISIBLE);
                TextView textViewFort = (TextView) findViewById(R.id.textViewFF);
                textViewFort.setVisibility(View.GONE);
            } else if (savedStateMsg.equals("Fort Fischer State Historic Site")) {
                TextView textViewBattleship = (TextView) findViewById(R.id.textViewTBS);
                textViewBattleship.setVisibility(View.GONE);
                TextView textViewMuseum = (TextView) findViewById(R.id.textViewCBSP);
                textViewMuseum.setVisibility(View.GONE);
                TextView textViewTour = (TextView) findViewById(R.id.textViewTHT);
                textViewTour.setVisibility(View.GONE);
                TextView textViewFort = (TextView) findViewById(R.id.textViewFF);
                textViewFort.setVisibility(View.VISIBLE);
            }
        }

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        Context context = getApplicationContext();
        CharSequence greet = "Select a location to view for your next vacation!";
        int duration = Toast.LENGTH_LONG;
        Toast toast = Toast.makeText(context, greet, duration);

        String text = parent.getItemAtPosition(position).toString();
        Toast.makeText(parent.getContext(), text, Toast.LENGTH_SHORT);

        if(text.equals("Battleship North Carolina")) {
            TextView textViewBattleship = (TextView) findViewById(R.id.textViewBattleship);
            textViewBattleship.setVisibility(View.VISIBLE);
            TextView textViewBeach = (TextView) findViewById(R.id.textViewBeach);
            textViewBeach.setVisibility(View.VISIBLE);
            TextView textViewTour = (TextView) findViewById(R.id.textViewTour);
            textViewTour.setVisibility(View.GONE);
            TextView textViewFort = (TextView) findViewById(R.id.textViewFort);
            textViewFort.setVisibility(View.GONE);
            savedStateMsg = text;
            Intent intent = new Intent(this, DetailActivity.class);
            intent.putExtra(text, savedStateMsg);
            startActivity(intent);
        } else if (text.equals("Carolina Beach State Park")) {
            TextView textViewBattleship = (TextView) findViewById(R.id.textViewBattleship);
            textViewBattleship.setVisibility(View.GONE);
            TextView textViewBeach = (TextView) findViewById(R.id.textViewBeach);
            textViewBeach.setVisibility(View.VISIBLE);
            TextView textViewTour = (TextView) findViewById(R.id.textViewTour);
            textViewTour.setVisibility(View.GONE);
            TextView textViewFort = (TextView) findViewById(R.id.textViewFort);
            textViewFort.setVisibility(View.GONE);
            savedStateMsg = text;
            Intent intent = new Intent(this, DetailActivity.class);
            intent.putExtra(text, savedStateMsg);
            startActivity(intent);
        } else if (text.equals("Haunted Cotton Exchange Tour")) {
            TextView textViewBattleship = (TextView) findViewById(R.id.textViewBattleship);
            textViewBattleship.setVisibility(View.GONE);
            TextView textViewBeach = (TextView) findViewById(R.id.textViewBeach);
            textViewBeach.setVisibility(View.GONE);
            TextView textViewTour = (TextView) findViewById(R.id.textViewTour);
            textViewTour.setVisibility(View.VISIBLE);
            TextView textViewFort = (TextView) findViewById(R.id.textViewFort);
            textViewFort.setVisibility(View.GONE);
            savedStateMsg = text;
            Intent intent = new Intent(this, DetailActivity.class);
            intent.putExtra(text, savedStateMsg);
            startActivity(intent);
        } else if (text.equals("Fort Fischer State Historic Site")) {
            TextView textViewBattleship = (TextView) findViewById(R.id.textViewBattleship);
            textViewBattleship.setVisibility(View.GONE);
            TextView textViewBeach = (TextView) findViewById(R.id.textViewBeach);
            textViewBeach.setVisibility(View.GONE);
            TextView textViewTour = (TextView) findViewById(R.id.textViewTour);
            textViewTour.setVisibility(View.GONE);
            TextView textViewFort = (TextView) findViewById(R.id.textViewFort);
            textViewFort.setVisibility(View.VISIBLE);
            savedStateMsg = text;
            Intent intent = new Intent(this, DetailActivity.class);
            intent.putExtra(text, savedStateMsg);
            startActivity(intent);
        } else if(text.equals("Select a location to view for your next vacation!")) {
            toast.show();
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("savedStateMsg", savedStateMsg);
    }
}