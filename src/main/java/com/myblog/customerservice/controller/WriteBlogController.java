package com.myblog.customerservice.controller;

import com.myblog.customerservice.entity.Listlable;
import com.myblog.customerservice.entity.WriteBlog;
import com.myblog.customerservice.service.ListService;
import com.myblog.customerservice.service.WriteBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/writeBlog")
public class WriteBlogController {
    @Autowired
    private WriteBlogService writeBlogService;
    @Autowired
    private ListService listService;
    @PostMapping("/addBlog")
    public  String addBlog(@RequestBody WriteBlog writeBlog){
            String listName=writeBlog.getListname();
          Listlable lis = new Listlable();
          lis.setListname(listName);
          WriteBlog writeBlog1=  writeBlogService.save(writeBlog);
          Listlable writeBlog2 = listService.save(lis);
          if (!writeBlog1.equals("")|| !writeBlog2.equals("")){
              return "success";
          }
         return  null;
    }
    @GetMapping("/findAllBlog/{page}/{size}")
    public Page<WriteBlog> findAllBlog(@PathVariable("page") Integer page,@PathVariable("size") Integer size ){
        PageRequest pageRequest = PageRequest.of(page,size);
        return  writeBlogService.findAll(pageRequest);
    }
    @GetMapping("/findByBlogid/{blogid}")
    public WriteBlog findByBlogid(@PathVariable("blogid") Integer blogid){
        return writeBlogService.findById(blogid).get();
    }

}
