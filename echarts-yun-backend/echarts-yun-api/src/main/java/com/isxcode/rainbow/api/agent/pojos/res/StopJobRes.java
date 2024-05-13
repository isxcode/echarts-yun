package com.isxcode.rainbow.api.agent.pojos.res;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class StopJobRes {

    private String requestId;
}
