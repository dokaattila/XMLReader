package com.da.xmlreader.service;

import com.da.xmlreader.entity.RSS;
import com.rometools.rome.feed.synd.SyndCategory;
import com.rometools.rome.feed.synd.SyndEntry;
import com.rometools.rome.feed.synd.SyndFeed;
import com.rometools.rome.io.SyndFeedInput;
import com.rometools.rome.io.XmlReader;
import org.springframework.stereotype.Service;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


@Service
public class RSSService {

    public List<RSS> getRss(String url) {
        List<RSS> rssList = new ArrayList<>();
        try {
            URL feedUrl = new URL(url);
            SyndFeedInput input = new SyndFeedInput();
            SyndFeed feed = input.build(new XmlReader(feedUrl));

            for (SyndEntry entry : feed.getEntries()) {
                RSS rss = new RSS();
                rss.setTitle(entry.getTitle());
                rss.setPubDate(String.format("%tY.%tm.%td", entry.getPublishedDate(), entry.getPublishedDate(), entry.getPublishedDate()));
                rss.setDescription(entry.getDescription().getValue());
                rss.setUrl(entry.getLink());
                rss.setAuthor(entry.getAuthor());
                rss.setCategory(entry.getCategories().stream().map(SyndCategory::getName).collect(Collectors.joining(",")));
                rssList.add(rss);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("ERROR: " + ex.getMessage());
        }
        return rssList;

    }
}
