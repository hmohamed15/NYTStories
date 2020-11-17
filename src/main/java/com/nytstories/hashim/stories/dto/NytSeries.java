package com.nytstories.hashim.stories.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.ArrayList;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class NytSeries {

    String status;
    String copyright;
    String section;
    String lastUpdated;

    int numResults;

    List<Results> results = new ArrayList<>();
}
