package com.da.xmlreader.controller;

import com.da.xmlreader.entity.RSS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.da.xmlreader.service.RSSService;
import java.util.List;

@RestController
@RequestMapping(value = "/getrss")
public class RSSController {

    @Autowired
    private RSSService rssService;

    @GetMapping(params = "url")
    public List<RSS> getRSS(@RequestParam String url) {
        return this.rssService.getRss(url);
    }

}
