package com.xgim.demo4;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.social.twitter.api.impl.TwitterTemplate;

@Configuration
@PropertySource("classpath:twitter.properties")
public class TwitterConfig {


    @Value("${api.key}")
    private String apiKey;
    @Value("${api.key.secret}")
    private String apiKeySecret;
    @Value("${access.token}")
    private String accessToken;
    @Value("${access.token.secret}")
    private String accessTokenSecret;

    @Bean
    public TwitterTemplate getTwitterTemplate() {
        TwitterTemplate twitterTemplate = new TwitterTemplate(apiKey, apiKeySecret, accessToken, accessTokenSecret);
        return twitterTemplate;
    }
}
