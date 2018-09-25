package com.siemens.controller;

import com.siemens.model.Model;
import com.siemens.dao.ModelDao;
import com.siemens.response.Result;
import com.siemens.response.Status;
import com.siemens.service.ModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.*;

/**
 * @author Thanos Yu
 * @date 2018/9/19
 */


@Controller
@RequestMapping("/v1")
@EnableAutoConfiguration
public class ModelController {

    @Autowired
    private ModelService modelService;

    /**
     * 保存模型
     *
     * @param model
     * @return
     */
    @RequestMapping(value = "model", method = {RequestMethod.POST}, consumes = "application/json", produces = "application/json")
    @ResponseBody
    public Result create(@RequestBody Model model) {
        Result<Model> result = new Result<Model>();
        result.setCode(Status.LSucceed.getCode());
        result.setMsg(Status.LSucceed.getMessage());
        try {
            modelService.save(model);
        } catch (Exception e) {
            e.printStackTrace();
            result.setCode(Status.LFailed.getCode());
            result.setMsg(Status.LFailed.getMessage());
        }
        return result;
    }

    /**
     * 更新模型
     *
     * @param model
     * @return
     */
    @RequestMapping(value = "model/{id}", method = {RequestMethod.PUT}, consumes = "application/json", produces = "application/json")
    @ResponseBody
    public Result update(@RequestBody Model model, @PathVariable String id) {
        Result<Model> result = new Result<Model>();
        result.setCode(Status.LSucceed.getCode());
        result.setMsg(Status.LSucceed.getMessage());
        try {
            model.setId(Long.parseLong(id));
            modelService.save(model);
        } catch (Exception e) {
            e.printStackTrace();
            result.setCode(Status.LFailed.getCode());
            result.setMsg(Status.LFailed.getMessage());
        }
        return result;
    }

    /**
     * 查询所有模型
     *
     * @return
     */
    @RequestMapping(value = "/model", method = {RequestMethod.GET}, consumes = "application/json", produces = "application/json")
    @ResponseBody
    public Result queryAll(HttpServletRequest request) {
        Result<Iterable<Model>> result = new Result<Iterable<Model>>();
        result.setCode(Status.LSucceed.getCode());
        result.setMsg(Status.LSucceed.getMessage());
        try {
            String page = request.getParameter("page");
            String size = request.getParameter("size");
            System.out.println("---------------page: " + page);
            System.out.println("---------------size: " + size);
            Pageable pageable = new PageRequest(Integer.parseInt(page), Integer.parseInt(size));
            Iterable<Model> models = modelService.findAll(pageable);
            result.setData(models);
        } catch (Exception e) {
            e.printStackTrace();
            result.setCode(Status.LFailed.getCode());
            result.setMsg(Status.LFailed.getMessage());
        }
        return result;
    }

    /**
     * 查询一个模型
     *
     * @param id
     * @return
     */
    @RequestMapping(value = "/model/{id}", method = {RequestMethod.GET}, consumes = "application/json", produces = "application/json")
    @ResponseBody
    public Result queryOne(@PathVariable String id) {
        Result<Model> result = new Result<Model>();
        result.setCode(Status.LSucceed.getCode());
        result.setMsg(Status.LSucceed.getMessage());
        try {
            Model model = modelService.findOne(Long.valueOf(id));
            result.setData(model);
        } catch (Exception e) {
            e.printStackTrace();
            result.setCode(Status.LFailed.getCode());
            result.setMsg(Status.LFailed.getMessage());
        }
        return result;
    }

    /**
     * 查询多个模型
     *
     * @param ids
     * @return
     */
    @RequestMapping(value = "/model/queryMulti", method = {RequestMethod.POST}, consumes = "application/json", produces = "application/json")
    @ResponseBody
    public Result queryMulti(@RequestBody List<Long> ids) {
        Result<Iterable<Model>> result = new Result<Iterable<Model>>();
        result.setCode(Status.LSucceed.getCode());
        result.setMsg(Status.LSucceed.getMessage());
        try {
            Iterable<Model> models = modelService.findMulti(ids);
            result.setData(models);
        } catch (Exception e) {
            e.printStackTrace();
            result.setCode(Status.LFailed.getCode());
            result.setMsg(Status.LFailed.getMessage());
        }
        return result;
    }

    /**
     * 删除一个模型
     *
     * @param id
     * @return
     */
    @RequestMapping(value = "model/{id}", method = {RequestMethod.DELETE}, consumes = "application/json", produces = "application/json")
    @ResponseBody
    public Result deleteOne(@PathVariable String id) {
        Result<Model> result = new Result<Model>();
        result.setCode(Status.LSucceed.getCode());
        result.setMsg(Status.LSucceed.getMessage());
        try {
            modelService.deleteOne(Long.valueOf(id));
        } catch (Exception e) {
            e.printStackTrace();
            result.setCode(Status.LFailed.getCode());
            result.setMsg(Status.LFailed.getMessage());
        }
        return result;
    }

    /**
     * 删除多个模型
     *
     * @param ids
     * @return
     */
    @RequestMapping(value = "model", method = {RequestMethod.DELETE}, consumes = "application/json", produces = "application/json")
    @ResponseBody
    public Result deleteMulti(@RequestBody List<Long> ids) {
        Result<Model> result = new Result<Model>();
        result.setCode(Status.LSucceed.getCode());
        result.setMsg(Status.LSucceed.getMessage());
        try {
            modelService.deleteMulti(ids);
        } catch (Exception e) {
            e.printStackTrace();
            result.setCode(Status.LFailed.getCode());
            result.setMsg(Status.LFailed.getMessage());
        }
        return result;
    }

    @RequestMapping(value = "updateStatus/{id}", method = {RequestMethod.PATCH}, consumes = "application/json", produces = "application/json")
    @ResponseBody
    public Result updateStatus(@RequestBody Map<String, Integer> map, @PathVariable Long id) {
        Result<Model> result = new Result<Model>();
        result.setCode(Status.LSucceed.getCode());
        result.setMsg(Status.LSucceed.getMessage());
        try {
            Integer status = map.get("status");
            modelService.updateStatus(status, id);
        } catch (Exception e) {
            e.printStackTrace();
            result.setCode(Status.LFailed.getCode());
            result.setMsg(Status.LFailed.getMessage());
        }
        return result;
    }
}
