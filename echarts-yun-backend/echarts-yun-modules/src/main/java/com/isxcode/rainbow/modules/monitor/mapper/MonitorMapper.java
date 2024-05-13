package com.isxcode.rainbow.modules.monitor.mapper;

import com.isxcode.rainbow.api.monitor.pojos.dto.NodeMonitorInfo;
import com.isxcode.rainbow.modules.monitor.entity.MonitorEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface MonitorMapper {

    MonitorEntity nodeMonitorInfoToMonitorEntity(NodeMonitorInfo nodeMonitorInfo);
}
