package com.isxcode.rainbow.api.datasource.pojos.req;

import com.isxcode.rainbow.backend.api.base.pojos.BasePageRequest;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class PageDatasourceReq extends BasePageRequest {

    @Schema(title = "数据源类型")
    private String datasourceType;
}
