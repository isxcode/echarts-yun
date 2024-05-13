package com.isxcode.rainbow.api.workflow.pojos.res;

import com.isxcode.rainbow.api.work.pojos.dto.CronConfig;
import lombok.Data;

@Data
public class GetWorkflowRes {

    private Object webConfig;

    private CronConfig cronConfig;
}
