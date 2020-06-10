package com.iminsys.curatorio.apiclient.dto;

import lombok.Data;

import java.util.List;

@Data
public class CuratorIOPostResponse {

    private Boolean success;
    private CuratorIOPagination pagination;
    private List<Integer> networks;
    private List<CuratorIOSource> sources;
    private Integer postCount;
    private List<CuratorIOPostItem> posts;

}
