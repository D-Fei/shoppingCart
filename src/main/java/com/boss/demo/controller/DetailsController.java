package com.boss.demo.controller;

import com.boss.demo.db.mapper.DetailsMapper;
import com.boss.demo.db.model.Details;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/demo/details")
public class DetailsController {
    @Autowired
    DetailsMapper detailsMapper;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Details getUser(HttpServletRequest request, HttpServletResponse response , @PathVariable("id") Integer detailsId) {
        Details details = (Details) detailsMapper.selectByPrimaryKey(detailsId);
        System.out.println(details);
        return details;
    }
}
