package com.krasko.dobrenchuk.service;

import java.util.List;

import com.krasko.dobrenchuk.entity.DemoEntity;

public interface DemoService {

    DemoEntity getById(Long id);

    List<DemoEntity> getAll();

    DemoEntity save(DemoEntity demoEntity);

    DemoEntity update(DemoEntity demoEntity);

    void delete(Long id);
}
