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
public class RestaurantsFragment extends Fragment {

    public RestaurantsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);

        // Create a list of locations
        // References: Images taken from Yelp
        final ArrayList<Location> locations = new ArrayList<Location>();
        // Reference: Image taken by Kathryn W.
        locations.add(new Location(R.drawable.house_of_prime_rib,
                R.string.restaurant_house_of_prime_rib, R.string.address_house_of_prime_rib,
                R.string.phone_number_house_of_prime_rib));
        // Reference: Image taken by Wiseley F.
        locations.add(new Location(R.drawable.marugame_udon, R.string.restaurant_marugame_udon,
                R.string.address_marugame_udon, R.string.phone_number_marugame_udon));
        // Reference: Image taken by Regina N.
        locations.add(new Location(R.drawable.marufuku_ramen, R.string.restaurant_marufuku_ramen,
                R.string.address_marufuku_ramen, R.string.phone_number_marufuku_ramen));
        // Reference: Image taken by Fog Harbor Fish House
        locations.add(new Location(R.drawable.fog_harbor_fish_house,
                R.string.restaurant_fog_harbor_fish_house, R.string.address_fog_harbor_fish_house,
                R.string.phone_number_fog_harbor_fish_house));
        // Reference: Image taken by David T.
        locations.add(new Location(R.drawable.delicious_dim_sum,
                R.string.restaurant_delicious_dim_sum, R.string.address_delicious_dim_sum,
                R.string.phone_number_delicious_dim_sum));
        // Reference: Image taken by Sushirrito
        locations.add(new Location(R.drawable.sushirrito, R.string.restaurant_sushirrito,
                R.string.address_sushirrito, R.string.phone_number_sushirrito));
        // Reference: Image taken by Tiffany P.
        locations.add(new Location(R.drawable.ipot, R.string.restaurant_ipot,
                R.string.address_ipot, R.string.phone_number_ipot));
        // Reference: Image taken by Ester S.
        locations.add(new Location(R.drawable.japanese_tea_garden,
                R.string.restaurant_japanese_tea_garden, R.string.address_japanese_tea_garden,
                R.string.phone_number_japanese_tea_garden));
        // Reference: Image taken by Brian G.
        locations.add(new Location(R.drawable.macd, R.string.restaurant_macd,
                R.string.address_macd, R.string.phone_number_macd));
        // Reference: Image taken by Z&Y Restaurant
        locations.add(new Location(R.drawable.zy_restaurant, R.string.restaurant_zy_restaurant,
                R.string.address_zy_restaurant, R.string.phone_number_zy_restaurant));

        // Create a {@link LocationAdapter}, whose data source is a list of {@link Location}s. The
        // adapter knows how to create list items for each item in the list.
        LocationAdapter adapter = new LocationAdapter(getActivity(), locations,
                R.color.category_restaurants);

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