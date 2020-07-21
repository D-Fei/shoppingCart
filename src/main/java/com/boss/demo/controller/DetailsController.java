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
import java.util.List;

@RestController
@RequestMapping("/demo/details")
public class DetailsController {
    @Autowired
    DetailsMapper detailsMapper;

    /**
     * 根据id查询明细
     * @param request
     * @param response
     * @param id
     * @return
     */
    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
    public Details getDetails(HttpServletRequest request, HttpServletResponse response , @PathVariable("id") Integer id) {
        Details details = (Details) detailsMapper.selectByPrimaryKey(id);
        System.out.println(details);
        return details;
    }

    /**
     * 根据detailId查询明细
     * @param request
     * @param response
     * @param detailsId
     * @return
     */
    @RequestMapping(value = "/gets/{detailsId}",method = RequestMethod.GET)
    public List<Details> getAllDetails(HttpServletRequest request,HttpServletResponse response ,@PathVariable("detailsId") Integer detailsId) {
        List<Details> details = detailsMapper.selectAll(detailsId);
        System.out.println(details);
        return details;
    }
}
