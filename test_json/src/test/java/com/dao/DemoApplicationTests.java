package com.dao;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

    @Test
    void contextLoads() {
        String str = "{\"data\":[{\"info\":" +
                "{\"student2\":{\"age\":10,\"name\":\"小黑\"}," +
                "\"student1\":{\"age\":20,\"name\":\"小白\"}}}]," +
                "\"resultCode\":200,\"" +
                "resultMsg\":\"成功\"}";

        Response response = JSON.parseObject(str, Response.class);
        String s = JSON.toJSONString(response.getData());
        JSONArray array = JSONArray.parseArray(s);
        // str: {"info":{"student2":{"name":"小黑","age":10},"student1":{"name":"小白","age":20}}}
        String arr = JSON.toJSONString(array.get(0));
        JSONObject jsonObject = JSONObject.parseObject(arr);
        JSONObject info = (JSONObject) jsonObject.get("info");
        System.out.println(info);
        String student = info.getString("student1");
        Student su = JSON.parseObject(student, Student.class);
    }
}
