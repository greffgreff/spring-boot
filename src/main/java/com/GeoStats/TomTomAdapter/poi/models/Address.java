package com.GeoStats.TomTomAdapter.poi.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Address {
        @JsonProperty("streetNumber") private int streetNumber;
        @JsonProperty("streetName") private String streetName;
        @JsonProperty("municipalitySubdivision") private String municipalitySubdivision;
        @JsonProperty("municipality") private String municipality;
        @JsonProperty("countrySecondarySubdivision") private String countrySecondarySubdivision;
        @JsonProperty("countryTertiarySubdivision") private String countryTertiarySubdivision;
        @JsonProperty("countrySubdivision") private String countrySubdivision;
        @JsonProperty("postalCode") private String postalCode;
        @JsonProperty("extendedPostalCode") private String extendedPostalCode;
        @JsonProperty("countryCode") private String countryCode;
        @JsonProperty("country") private String country;
        @JsonProperty("countryCodeISO3") private String countryCodeISO3;
        @JsonProperty("freeformAddress") private String freeformAddress;
        @JsonProperty("countrySubdivisionName") private String countrySubdivisionName;
        @JsonProperty("localName") private String localName;

        public Address() { }
}
