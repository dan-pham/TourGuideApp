package com.example.android.tourguideapp;

public class Location {

    /** Constant value that represents no phone number was provided for this location */
    private static final int NO_PHONE_NUMBER_PROVIDED = -1;
    /** String resource ID for the name of the location */
    private int mLocationNameId;
    /** String resource ID for the address of the location */
    private int mAddressId;
    /** Image resource ID for the image of the location */
    private int mImageId;
    /** String resource ID for the phone number of the location */
    private int mPhoneNumberId = NO_PHONE_NUMBER_PROVIDED;

    /**
     * Create a new Location object.
     *
     * @param imageId is the image resource ID for the image of the location
     * @param locationNameId is the string resource ID for the name of the location
     * @param addressId is the string resource ID for the address of the location
     *
     */
    public Location(int imageId, int locationNameId, int addressId) {
        mImageId = imageId;
        mLocationNameId = locationNameId;
        mAddressId = addressId;
    }

    /**
     * Create a new Location object.
     *
     * @param imageId is the image resource ID for the image of the location
     * @param locationNameId is the string resource ID for the name of the location
     * @param addressId is the string resource ID for the address of the location
     * @param phoneNumberId is the string resource ID for the phone number of the location
     *
     */
    public Location(int imageId, int locationNameId, int addressId, int phoneNumberId) {
        mImageId = imageId;
        mLocationNameId = locationNameId;
        mAddressId = addressId;
        mPhoneNumberId = phoneNumberId;
    }

    /**
     * Get the image resource ID of the location.
     */
    public int getImageId() {
        return mImageId;
    }

    /**
     * Get the string resource ID of the location name.
     */
    public int getLocationNameId() {
        return mLocationNameId;
    }

    /**
     * Get the string resource ID of the location address.
     */
    public int getAddressId() {
        return mAddressId;
    }

    /**
     * Returns whether or not there is a phone number for this location.
     */
    public boolean hasPhoneNumber() {
        return mPhoneNumberId != NO_PHONE_NUMBER_PROVIDED;
    }

    /**
     * Get the string resource ID of the location phone number.
     */
    public int getPhoneNumberId() {
        return mPhoneNumberId;
    }
}