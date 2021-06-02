package com.it.domain;

import lombok.Data;

import java.util.Date;

@Data
public class WorkerNode {
    private Long id;
    private String hostName;
    private String port;
    private Integer type;
    private Date launchDate;
    private Date modified;
    private Date created;
}
