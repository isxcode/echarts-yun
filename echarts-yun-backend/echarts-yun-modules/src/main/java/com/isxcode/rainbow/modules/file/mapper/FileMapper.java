package com.isxcode.rainbow.modules.file.mapper;

import com.isxcode.rainbow.api.file.pojos.res.PageFileRes;
import com.isxcode.rainbow.modules.file.entity.FileEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface FileMapper {

    PageFileRes fileEntityToPageFileRes(FileEntity fileEntity);
}
