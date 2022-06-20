package com.da.xmlreader.entity;

import lombok.Data;
import java.time.LocalDate;

@Data
public class RSS {

    private String title;
    private String description;
    private String pubDate;
    private String url;
    private String author;
    private String category;


}
