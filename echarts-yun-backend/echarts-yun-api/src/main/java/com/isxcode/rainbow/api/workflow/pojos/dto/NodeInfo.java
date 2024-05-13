package com.isxcode.rainbow.api.workflow.pojos.dto;

import lombok.Data;

@Data
public class NodeInfo {

    private String id;

    private String shape;

    private LineInfo source;

    private LineInfo target;
}
