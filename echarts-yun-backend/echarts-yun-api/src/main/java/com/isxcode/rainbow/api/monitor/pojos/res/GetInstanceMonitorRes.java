package com.isxcode.rainbow.api.monitor.pojos.res;

import com.isxcode.rainbow.api.monitor.pojos.dto.WorkflowInstanceLineDto;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class GetInstanceMonitorRes {

    List<WorkflowInstanceLineDto> instanceNumLine;
}
