package com.xgim.demo4.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.social.twitter.api.Tweet;
import org.springframework.social.twitter.api.impl.TwitterTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TwitterServiceImpl implements TwitterService {

    @Autowired
    private TwitterTemplate template;

    @Override
    @Cacheable("tweets")
    public List<Tweet> findTweetsByHashtag(String hashtag) {
        return template.searchOperations().search(hashtag, 10).getTweets();
    }
}
