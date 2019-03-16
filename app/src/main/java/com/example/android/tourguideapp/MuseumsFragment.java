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
public class MuseumsFragment extends Fragment {

    public MuseumsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);

        // Create a list of locations
        // References: Images taken from Yelp
        final ArrayList<Location> locations = new ArrayList<Location>();
        // Reference: Image taken by Bryan R.
        locations.add(new Location(R.drawable.exploratorium, R.string.museum_exploratorium,
                R.string.address_exploratorium, R.string.phone_number_exploratorium));
        // Reference: Image taken by by Angela A M.
        locations.add(new Location(R.drawable.calacademy_of_sciences,
                R.string.museum_calacademy_of_sciences, R.string.address_calacademy_of_sciences,
                R.string.phone_number_calacademy_of_sciences));
        // Reference: Image taken by Michael E.
        locations.add(new Location(R.drawable.alcatraz_island, R.string.museum_alcatraz_island,
                R.string.address_alcatraz_island, R.string.phone_number_alcatraz_island));
        // Reference: Image taken by Mikey L.
        locations.add(new Location(R.drawable.coit_tower, R.string.museum_coit_tower,
                R.string.address_coit_tower, R.string.phone_number_coit_tower));
        // Reference: Image taken by Museum of Ice Cream
        locations.add(new Location(R.drawable.museum_of_ice_cream,
                R.string.museum_museum_of_ice_cream, R.string.address_museum_of_ice_cream,
                R.string.phone_number_museum_of_ice_cream));
        // Reference: Image taken by Alex P.
        locations.add(new Location(R.drawable.musee_mecanique, R.string.museum_musee_mecanique,
                R.string.address_musee_mecanique, R.string.phone_number_musee_mecanique));
        // Reference: Image taken by Stan L.
        locations.add(new Location(R.drawable.de_young_museum, R.string.museum_de_young_museum,
                R.string.address_de_young_museum, R.string.phone_number_de_young_museum));
        // Reference: Image taken by May A.
        locations.add(new Location(R.drawable.walt_disney_museum,
                R.string.museum_walt_disney_museum, R.string.address_walt_disney_museum,
                R.string.phone_number_walt_disney_museum));
        // Reference: Image taken by Candytopia
        locations.add(new Location(R.drawable.candytopia, R.string.museum_candytopia,
                R.string.address_candytopia, R.string.phone_number_candytopia));
        // Reference: Image taken by Jennifer O.
        locations.add(new Location(R.drawable.museum_of_modern_art,
                R.string.museum_museum_of_modern_art, R.string.address_museum_of_modern_art,
                R.string.phone_number_museum_of_modern_art));

        // Create a {@link LocationAdapter}, whose data source is a list of {@link Location}s. The
        // adapter knows how to create list items for each item in the list.
        LocationAdapter adapter = new LocationAdapter(getActivity(), locations,
                R.color.category_museums);

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