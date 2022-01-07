package com.GeoStats.TomTomAdapter.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties({ "countrySecondarySubdivision", "countryTertiarySubdivision", "countryCodeISO3", "freeformAddress", "localName", "countrySubdivision", "countrySubdivisionName", "extendedPostalCode", "municipalitySubdivision", "countrySubdivision" })
public class Address {
        @JsonProperty("streetNumber")
        @JsonInclude(JsonInclude.Include.NON_NULL)
        private String streetNumber;

        @JsonProperty("streetName")
        @JsonInclude(JsonInclude.Include.NON_NULL)
        private String streetName;

        @JsonProperty("municipality")
        @JsonInclude(JsonInclude.Include.NON_NULL)
        private String municipality;

        @JsonProperty("postalCode")
        @JsonInclude(JsonInclude.Include.NON_NULL)
        private String postalCode;

        @JsonProperty("countryCode")
        @JsonInclude(JsonInclude.Include.NON_NULL)
        private String countryCode;

        @JsonProperty("country")
        @JsonInclude(JsonInclude.Include.NON_NULL)
        private String country;

        public Address() { }
}
