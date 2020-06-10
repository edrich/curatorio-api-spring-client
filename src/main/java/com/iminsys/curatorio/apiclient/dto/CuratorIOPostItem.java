package com.iminsys.curatorio.apiclient.dto;

import lombok.Data;

import java.util.ArrayList;

@Data
public class CuratorIOPostItem {

    private Integer id; // use for article v1
    private Integer network_id;
    private Integer status;
    private Integer flagged;
    private Integer has_media;
    private Integer source_type;
    private String source_identifier;
    private String source_created_at;
    private Integer post_user_id;
    private String user_screen_name;
    private String user_full_name;
    private String user_image;
    private String text; // use for article v1
    private Integer is_html;
    private String image; // use for article v1
    private String video;
    private String url; // use for article v1
    private String user_url;
    private String thumbnail;
    private Integer video_width;
    private Integer video_height;
    private Integer comments;
    private Integer views;
    private Integer is_repost;
    private Integer is_reply;
    private Integer is_deleted;
    private Integer is_edited;
    private Integer likes;
    private String originator_user_screenname;
    private String originator_user_url;
    private String originator_post_url;
    private Integer pinned;
    private String pinned_at = null;
    private String longitude;
    private String latitude;
    private String location_name;
    private Integer image_width;
    private Integer image_height;
    private Integer image_processed;
    private Integer has_image;
    private Integer has_video;
    private String image_large;
    private Integer image_large_width;
    private Integer image_large_height;
    private String network_name;
    private String post_status;
    ArrayList<String> images = new ArrayList<>();
    ArrayList<CuratorIOPostItemDataField> data = new ArrayList<>(); // use for article v1
    private String source_id;
    private String feed_id;
    private String last_modified;

}

