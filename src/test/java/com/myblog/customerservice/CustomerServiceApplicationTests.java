package com.myblog.customerservice;

import com.myblog.customerservice.entity.WriteBlog;
import com.myblog.customerservice.service.WriteBlogService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CustomerServiceApplicationTests {

    @Autowired
    private WriteBlogService writeBlogService;

    @Test
    void contextLoads() {
    }
    @Test
    public String addBlog(){
        WriteBlog writeBlog = new WriteBlog();
      writeBlog.setBlogid(1);
writeBlog.setBlogauthor("zhangh");
writeBlog.setBlogcontent("adasdsadasdsd");
        System.out.println(writeBlogService.save(writeBlog));
        return  null;
    }

}
