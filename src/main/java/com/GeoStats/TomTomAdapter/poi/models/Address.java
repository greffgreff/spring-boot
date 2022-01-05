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

        public Address() {}

        public Address(
            int streetNumber, 
            String streetName, 
            String municipalitySubdivision, 
            String municipality, 
            String countrySecondarySubdivision, 
            String countryTertiarySubdivision, 
            String countrySubdivision, 
            String postalCode, 
            String extendedPostalCode, 
            String countryCode, 
            String country, 
            String countryCodeISO3, 
            String freeformAddress, 
            String countrySubdivisionName, 
            String localName
        ) {
            this.streetNumber = streetNumber;
            this.streetName = streetName;
            this.municipalitySubdivision = municipalitySubdivision;
            this.municipality = municipality;
            this.countrySecondarySubdivision = countrySecondarySubdivision;
            this.countryTertiarySubdivision = countryTertiarySubdivision;
            this.countrySubdivision = countrySubdivision;
            this.postalCode = postalCode;
            this.extendedPostalCode = extendedPostalCode;
            this.countryCode = countryCode;
            this.country = country;
            this.countryCodeISO3 = countryCodeISO3;
            this.freeformAddress = freeformAddress;
            this.countrySubdivisionName = countrySubdivisionName;
        }
}
