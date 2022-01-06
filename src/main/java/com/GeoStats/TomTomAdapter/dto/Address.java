package com.GeoStats.TomTomAdapter.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties({ "countrySecondarySubdivision", "countryTertiarySubdivision", "countryCodeISO3", "freeformAddress", "localName", "countrySubdivision", "countrySubdivisionName", "extendedPostalCode", "municipalitySubdivision", "countrySubdivision" })
public class Address {
        @JsonProperty("streetNumber") private String streetNumber;
        @JsonProperty("streetName") private String streetName;
        @JsonProperty("municipality") private String municipality;
        @JsonProperty("postalCode") private String postalCode;
        @JsonProperty("countryCode") private String countryCode;
        @JsonProperty("country") private String country;

        public Address() { }
}
