package com.xgim.demo4.service;

import org.springframework.social.twitter.api.Tweet;

import java.util.List;

public interface TwitterService {
    List<Tweet> findTweetsByHashtag(String hashtag);
}
