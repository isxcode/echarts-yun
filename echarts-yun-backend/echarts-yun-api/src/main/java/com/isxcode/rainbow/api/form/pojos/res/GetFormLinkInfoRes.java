package com.isxcode.rainbow.api.form.pojos.res;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class GetFormLinkInfoRes {

    private String formId;

    private String formVersion;

    private String tenantId;

    private String formToken;
}
