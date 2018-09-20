package com.example.android.quakereport;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class EarthquakeAdapter extends ArrayAdapter<Earthquake> {

    public EarthquakeAdapter(Activity context, ArrayList<Earthquake> earthquakes) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context,0, earthquakes);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                R.layout.list_earthquake, parent, false);
        }

        Earthquake currentEarthquake = getItem(position);

        //Find the Text View in the List_earthquake layout with ID - magnitude_text_view
        TextView magnitudeTextView = (TextView) listItemView.findViewById(R.id.magnitude_text_view);
        //Get the current earthquake from the earthquake object and set it on the Text View
        magnitudeTextView.setText(currentEarthquake.getMagnitude());

        //Find the Text View in the List_earthquake layout with ID - city_text_view
        TextView cityTextView = (TextView) listItemView.findViewById(R.id.city_text_view);
        //Get the current earthquake from the earthquake object and set it on the Text View
        cityTextView.setText(currentEarthquake.getCity());

        //Find the Text View in the List_earthquake layout with ID - date_text_view
        TextView dateTextView = (TextView) listItemView.findViewById(R.id.date_text_view);
        //Get the current earthquake from the earthquake object and set it on the Text View
        dateTextView.setText(currentEarthquake.getDate());

        return  listItemView;
    }
}
