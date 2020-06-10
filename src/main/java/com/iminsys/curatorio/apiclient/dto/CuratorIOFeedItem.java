package com.iminsys.curatorio.apiclient.dto;

import lombok.Data;

@Data
public class CuratorIOFeedItem {

    private String id; // use for category v1
    private String name; // use for category v1
    private String type;
    private String widget_type;
    private String widget_theme;
    private String slug;
    private String public_key;
    private String moderation;
    private Integer post_status;
    private String widget_options;
    private String widget_styles;
    private String widget_colours;
    private Integer widget_advanced_styles;
    private String colour_options = null;
    private String default_image = null;
    private String default_user_image = null;
    private String widget_endpoint = null;
    private Integer debug;
    private String widget_version;
    private String js_loader_version;
    private String html_before = null;
    private String html_after = null;
    private Integer cache;
    private Integer cache_time;
    private Integer default_feed_layout_id;
    private Integer post_count;
    private Boolean is_latest_version;

}
