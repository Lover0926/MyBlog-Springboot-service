package com.myblog.customerservice.controller;

import com.myblog.customerservice.entity.Listlable;
import com.myblog.customerservice.service.ListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/list")
public class ListController {
 @Autowired
    private ListService listService;

 @GetMapping("/findList")
    public List<Listlable> findList(){
     return listService.findAll();
 }
}
