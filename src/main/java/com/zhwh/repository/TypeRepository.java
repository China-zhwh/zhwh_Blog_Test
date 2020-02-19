package com.zhwh.repository;

import com.zhwh.po.Type;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TypeRepository extends JpaRepository<Type,Long> {

    /**
     * 根据名字查询
     * @param name
     * @return
     */
    Type findByName(String name);
}
