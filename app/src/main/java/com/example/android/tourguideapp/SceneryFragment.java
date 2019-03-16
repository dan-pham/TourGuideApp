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
public class SceneryFragment extends Fragment {

    public SceneryFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);

        // Create a list of locations
        // References: Images taken from Yelp
        final ArrayList<Location> locations = new ArrayList<Location>();
        // Reference: Image taken by Veronica C.
        locations.add(new Location(R.drawable.twin_peaks, R.string.scenery_twin_peaks,
                R.string.address_twin_peaks));
        // Reference: Image taken by Michael H.
        locations.add(new Location(R.drawable.filbert_steps, R.string.scenery_filbert_steps,
                R.string.address_filbert_steps));
        // Reference: Image taken by Jerianne G.
        locations.add(new Location(R.drawable.sixteenth_ave_tiled_steps,
                R.string.scenery_16th_ave_tiled_steps, R.string.address_16th_ave_tiled_steps));
        // Reference: Image taken by Alana M.
        locations.add(new Location(R.drawable.wave_organ, R.string.scenery_wave_organ,
                R.string.address_wave_organ));
        // Reference: Image taken by Brandon C.
        locations.add(new Location(R.drawable.dolores_park, R.string.scenery_dolores_park,
                R.string.address_dolores_park));
        // Reference: Image taken by Eric R.
        locations.add(new Location(R.drawable.crissy_fields, R.string.scenery_crissy_fields,
                R.string.address_crissy_fields));
        // Reference: Image taken by Ann S.
        locations.add(new Location(R.drawable.hidden_garden_steps,
                R.string.scenery_hidden_garden_steps, R.string.address_hidden_garden_steps));
        // Reference: Image taken by Mychael H.
        locations.add(new Location(R.drawable.billy_goat_hill, R.string.scenery_billy_goat_hill,
                R.string.address_billy_goat_hill));
        // Reference: Image taken by Jenny H.
        locations.add(new Location(R.drawable.strawberry_hill, R.string.scenery_strawberry_hill,
                R.string.address_strawberry_hill));
        // Reference: Image taken by Lillian L.
        locations.add(new Location(R.drawable.lovers_lane, R.string.scenery_lovers_lane,
                R.string.address_lovers_lane));

        // Create a {@link LocationAdapter}, whose data source is a list of {@link Location}s. The
        // adapter knows how to create list items for each item in the list.
        LocationAdapter adapter = new LocationAdapter(getActivity(), locations,
                R.color.category_scenery);

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
