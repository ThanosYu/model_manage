package com.siemens.service;

import com.siemens.dao.ModelDao;
import com.siemens.model.Model;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * Created by Z003ZDBC on 9/25/2018.
 */
@Service
public class ModelServiceImpl implements ModelService {

    @Autowired
    private ModelDao modelDao;

    @Override
    public void save(Model model) {
        modelDao.save(model);
    }

    @Override
    public Page<Model> findAll(Pageable pageable) {
        return modelDao.findAll(pageable);
    }

    @Override
    public Optional<Model> findOne(Long id) {
        return modelDao.findById(id);
    }


    @Override
    public Iterable<Model> findMulti(List<Long> ids) {
        return modelDao.findAllById(ids);
    }

    @Override
    public void deleteOne(Long id) {
        modelDao.deleteById(id);
    }

    @Override
    public void deleteMulti(List<Long> ids) {
//        List<Model> list = new ArrayList<>();
//        Model model1 = new Model();
//        Model model2 = new Model();
//        model1.setId(8L);
//        model2.setId(9L);
//        list.add(model1);
//        list.add(model2);
//        modelDao.deleteAll(list);
        for (Long id : ids) {
            modelDao.deleteById(id);
        }
    }

    @Override
    public void updateStatus(Integer status, Long id) {
        modelDao.updateStatus(status, id);
    }
}
