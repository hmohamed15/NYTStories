package com.nytstories.hashim.stories.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.ArrayList;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Results {

    String section;
    String subsection;
    String title;
    String aabstract;

    String url;

    String uri;
    String byline;

    String itemType;
    String updatedDate;

    String createdDate;
    String publishedDate;

    String materialTypeFacet;
    String kicker;

    List<String> desFacet;

    List<String> perFacet;
    List<String> orgFacet;

    List<String> geoFacet;

    List<Multimedia> multimedia = new ArrayList<>();
}
