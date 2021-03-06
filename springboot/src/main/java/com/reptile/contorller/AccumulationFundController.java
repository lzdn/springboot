package com.reptile.contorller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.reptile.model.FormBean;
import com.reptile.service.AccumulationFundService;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.Map;

/**
 * Created by HotWong on 2017/5/2 003.
 */
@Controller
@RequestMapping("accumulationFund")
public class AccumulationFundController {

    @Resource
    private AccumulationFundService accumulationFundService;

    @ResponseBody
    @RequestMapping(value = "/Login.html",method = RequestMethod.POST)
    public Map<String,Object> Login(FormBean bean, HttpServletRequest request){
        return accumulationFundService.login(bean,request);
    }

    @ResponseBody
    @RequestMapping(value = "/getVerifyImage.jpg",method = RequestMethod.POST)
    public Map<String,Object> getVerifyImage(HttpServletResponse response, HttpServletRequest request){
        return accumulationFundService.getVerifyImage(response,request);
    }

}
