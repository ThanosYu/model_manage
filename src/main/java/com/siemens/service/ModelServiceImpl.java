package com.siemens.service;

import com.siemens.dao.ModelDao;
import com.siemens.model.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

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
    public Iterable<Model> findAll(Pageable pageable) {
        return modelDao.findAll(pageable);
    }

    @Override
    public Model findOne(Long id) {
        return modelDao.findOne(id);
    }


    @Override
    public Iterable<Model> findMulti(List<Long> ids) {
        return modelDao.findAll(ids);
    }

    @Override
    public void deleteOne(Long id) {
        modelDao.delete(id);
    }

    @Override
    public void deleteMulti(List<Long> ids) {
//        modelDao.delete(models);
        for (Long id : ids) {
            modelDao.delete(id);
        }
    }

    @Override
    public void updateStatus(Integer status, Long id) {
        modelDao.updateStatus(status, id);
    }
}
