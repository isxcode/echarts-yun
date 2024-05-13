package com.isxcode.rainbow.api.agent.pojos.dto;

import lombok.Data;

@Data
public class FlinkVerticesDto {

    private String id;

    private String name;

    private Long maxParallelism;

    private Long parallelism;

    private String status;
}
