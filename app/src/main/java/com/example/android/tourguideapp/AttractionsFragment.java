package com.example.android.tourguideapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * {@link Fragment} that displays a list of attractions.
 */
public class AttractionsFragment extends Fragment {

    public AttractionsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);

        // Create a list of locations
        // References: Images taken from Yelp
        final ArrayList<Location> locations = new ArrayList<Location>();
        // Reference: Image taken by Ann S.
        locations.add(new Location(R.drawable.golden_gate_bridge,
                R.string.attraction_golden_gate_bridge, R.string.address_golden_gate_bridge));
        // Reference: Image taken by Adam S.
        locations.add(new Location(R.drawable.golden_gate_park,
                R.string.attraction_golden_gate_park, R.string.address_golden_gate_park));
        // Reference: Image taken by Pier 39
        locations.add(new Location(R.drawable.pier_39, R.string.attraction_pier_39,
                R.string.address_pier_39));
        // Reference: Image taken by Ryan M.
        locations.add(new Location(R.drawable.fishermans_wharf,
                R.string.attraction_fishermans_wharf, R.string.address_fishermans_wharf));
        // Reference: Image taken by The Original Ghirardelli Ice Cream & Chocolate Shop
        locations.add(new Location(R.drawable.ghirardelli_square,
                R.string.attraction_ghirardelli_square, R.string.address_ghirardelli_square));
        // Reference: Image taken by Hazel C.
        locations.add(new Location(R.drawable.palace_of_fine_arts,
                R.string.attraction_palace_of_fine_arts, R.string.address_palace_of_fine_arts));
        // Reference: Image taken by Joy U.
        locations.add(new Location(R.drawable.alcatraz_cruises,
                R.string.attraction_alcatraz_cruises, R.string.address_alcatraz_cruises));
        // Reference: Image taken by May A.
        locations.add(new Location(R.drawable.the_presidio, R.string.attraction_the_presidio,
                R.string.address_the_presidio));
        // Reference: Image taken by T S.
        locations.add(new Location(R.drawable.lands_end, R.string.attraction_lands_end,
                R.string.address_lands_end));
        // Reference: Image taken by John L.
        locations.add(new Location(R.drawable.alamo_square, R.string.attraction_alamo_square,
                R.string.address_alamo_square));

        // Create a {@link LocationAdapter}, whose data source is a list of {@link Location}s. The
        // adapter knows how to create list items for each item in the list.
        LocationAdapter adapter = new LocationAdapter(getActivity(), locations,
                R.color.category_attractions);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link LocationAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Location} in the list.
        listView.setAdapter(adapter);

        return rootView;
    }
}