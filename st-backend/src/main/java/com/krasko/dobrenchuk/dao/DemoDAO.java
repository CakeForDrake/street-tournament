package com.krasko.dobrenchuk.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.krasko.dobrenchuk.entity.DemoEntity;

@Repository
public interface DemoDAO extends JpaRepository<DemoEntity, Long> {
}
