package com.isxcode.rainbow.modules.func.service;

import com.isxcode.rainbow.backend.api.base.exceptions.IsxAppException;
import com.isxcode.rainbow.modules.func.entity.FuncEntity;
import com.isxcode.rainbow.modules.func.repository.FuncRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class FuncService {

    private final FuncRepository funcRepository;

    public FuncEntity getFunc(String funcId) {

        return funcRepository.findById(funcId).orElseThrow(() -> new IsxAppException("自定义函数不存在"));
    }
}
