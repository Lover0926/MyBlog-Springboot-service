package com.myblog.customerservice.service;

import com.myblog.customerservice.entity.WriteBlog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WriteBlogService extends JpaRepository<WriteBlog,Integer> {



}
