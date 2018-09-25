package com.siemens.service;

import com.siemens.model.Model;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * Created by Z003ZDBC on 9/25/2018.
 */
public interface ModelService {

    /**
     * 更新保存模型
     *
     * @param model
     */
    void save(Model model);

    /**
     * 查询所有模型
     *
     * @param pageable
     * @return
     */
    Iterable<Model> findAll(Pageable pageable);

    /**
     * 查询一个模型
     *
     * @param id
     * @return
     */
    Model findOne(Long id);

    /**
     * 查询多个模型
     *
     * @param ids
     * @return
     */
    Iterable<Model> findMulti(List<Long> ids);

    /**
     * 删除一个模型
     *
     * @param id
     */
    void deleteOne(Long id);

    /**
     * 删除多个模型
     *
     * @param ids
     */
    void deleteMulti(List<Long> ids);

    /**
     * 更新模型状态
     *
     * @param status
     * @param id
     */
    void updateStatus(Integer status, Long id);

}
