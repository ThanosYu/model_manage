package com.siemens.dao;


import com.siemens.model.Model;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.Table;

/**
 * @author Thanos Yu
 * @date 2018/9/19
 */


@Repository
@Table(name = "model")
@Qualifier("modelDao")
public interface ModelDao extends PagingAndSortingRepository<Model, Long> {

    @Modifying
    @Transactional
    @Query("update Model m set m.status=:status where m.id = :id")
    void updateStatus(@Param("status") Integer status, @Param("id") Long id);
}
