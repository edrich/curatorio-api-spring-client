package com.iminsys.curatorio.apiclient;

import com.iminsys.curatorio.apiclient.dto.CuratorIOFeedItem;
import com.iminsys.curatorio.apiclient.dto.CuratorIOPostResponse;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Log4j2
@Service
public class CuratorIOImporterService {

    private final String API_KEY = "";
    private final String FEEDS_URL = "https://api.curator.io/v1/feeds?api_key={api_key}";
    private final String POSTS_URL = "https://api.curator.io/v1/feeds/{feed_id}/posts?api_key={api_key}&limit={limit}";
    private final Integer LIMIT = 10;

    public CuratorIOFeedItem[] getFeeds() {

        String url = FEEDS_URL.replace("{api_key}", API_KEY);
        RestTemplate restTemplate = new RestTemplate();

        CuratorIOFeedItem[] feeds = restTemplate.getForObject(url, CuratorIOFeedItem[].class);

        return feeds;
    }

    public CuratorIOPostResponse getPosts(String feedId) {

        String url = POSTS_URL.replace("{feed_id}", feedId).replace("{api_key}", API_KEY).replace("{limit}", LIMIT.toString());
        RestTemplate restTemplate = new RestTemplate();

        CuratorIOPostResponse response = restTemplate.getForObject(url, CuratorIOPostResponse.class);

        return response;
    }

}
