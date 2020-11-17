package com.nytstories.hashim.stories.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Multimedia {

    String url;
    String format;
    int height;
    int width;
    String type;
    String subType;
    String caption;
    String copyright;
}
