package com.xgim.demo4.controller;

import com.xgim.demo4.service.TwitterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class TweetController {

    @Autowired
    private TwitterService twitterService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String tweets() {

        return "home";
    }

    @RequestMapping(value = "/search", method = RequestMethod.POST,  params = "hashtag")
    public String tweets(Model model, String hashtag) {
        model.addAttribute("tweets", twitterService.findTweetsByHashtag(hashtag));
        return tweets();
    }
}
