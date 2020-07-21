package com.boss.demo.controller;

import com.boss.demo.db.mapper.FormMapper;
import com.boss.demo.db.model.Form;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/demo/form")
public class FormController {
    @Autowired
    FormMapper formMapper;

    /**
     * 根据id查询form
     * @param request
     * @param response
     * @param formId
     * @return
     */
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Form getUser(HttpServletRequest request, HttpServletResponse response , @PathVariable("id") Integer formId) {
        Form form = (Form) formMapper.selectByPrimaryKey(formId);
        System.out.println(form);
        return form;
    }
}
