package com.example.android.tourguideapp;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

/**
 * {@link LocationAdapter} is an {@link ArrayAdapter} that can provide the layout for each list item
 * based on a data source, which is a list of {@link Location} objects.
 */
public class LocationAdapter extends ArrayAdapter<Location> {

    /**
     * Resource ID for the background color for this list of locations
     */
    private int mColorResourceId;

    /**
     * Create a new {@link LocationAdapter} object.
     *
     * @param context         is the current context (i.e. Activity) that the adapter is being created in.
     * @param locations       is the list of {@link Location}s to be displayed.
     * @param colorResourceId is the resource ID for the background color for this list of words
     */
    public LocationAdapter(Context context, ArrayList<Location> locations, int colorResourceId) {
        super(context, 0, locations);
        mColorResourceId = colorResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link Location} object located at this position in the list
        Location currentLocation = getItem(position);

        // Find the ImageView in the list_item.xml layout with the ID image.
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        // Get the image from the currentLocation object and set this image on the ImageView.
        imageView.setImageResource(currentLocation.getImageId());

        // Find the TextView in the list_item.xml layout with the ID location_name_text_view.
        TextView locationTextView = (TextView) listItemView.findViewById(R.id.location_name_text_view);
        // Get the location name from the currentLocation object and set this text on the location TextView.
        locationTextView.setText(currentLocation.getLocationNameId());

        // Find the TextView in the list_item.xml layout with the ID address_text_view.
        TextView addressTextView = (TextView) listItemView.findViewById(R.id.address_text_view);
        // Get the address from the currentLocation object and set this text on the address TextView.
        addressTextView.setText(currentLocation.getAddressId());

        // Find the TextView in the list_item.xml layout with the ID phone_number_text_view.
        TextView phoneNumberTextView = (TextView) listItemView.findViewById(R.id.phone_number_text_view);
        // Check if a phone number is provided for this location or not
        if (currentLocation.hasPhoneNumber()) {
            // If a phone number is available, display the provided text based on the resource ID
            phoneNumberTextView.setText(currentLocation.getPhoneNumberId());
            // Make sure the view is visible
            phoneNumberTextView.setVisibility(View.VISIBLE);
        } else {
            // Otherwise hide the TextView
            phoneNumberTextView.setVisibility(View.GONE);
        }

        // Set the theme color for the list item
        View textContainer = listItemView.findViewById(R.id.text_container);
        // Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        // Set the background color of the text container View
        textContainer.setBackgroundColor(color);

        return listItemView;
    }
}