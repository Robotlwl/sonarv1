package com.example.resttemplate;

import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

/**
 * call API
 */
@RestController
public class TestSpringRestTemplateController {
    @Autowired
    private RestTemplate restTemplate;

    /***********HTTP GET method*************/
    @GetMapping("/testGetAction")
    public Object getJson() {
        JSONObject json = new JSONObject();
        json.put("username", "tester");
        json.put("pwd", "123456748");
        return json;
    }

    @GetMapping("/getApi")
    public String testGet() {
        String url = "http://localhost:8088/demo/testGetAction";
        JSONObject json = restTemplate.getForEntity(url, JSONObject.class).getBody();
        return json.toJSONString();
    }

    /**********HTTP POST method**************/
    @PostMapping(value = "/testPostAction")
    public Object postJson(@RequestBody JSONObject param) {
        System.out.println(param.toJSONString());
        param.put("action", "post");
        param.put("username", "tester");
        param.put("pwd", "123456748");
        return param;
    }

    @PostMapping(value = "/postApi")
    public Object testPost() {
        String url = "http://localhost:8088/demo/testPostAction";
        JSONObject postData = new JSONObject();
        postData.put("descp", "request for post");
        JSONObject json = restTemplate.postForEntity(url, postData, JSONObject.class).getBody();
        return json.toJSONString();
    }
}