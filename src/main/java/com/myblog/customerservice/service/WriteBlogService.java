package com.myblog.customerservice.service;

import com.myblog.customerservice.entity.WriteBlog;
import org.springframework.data.domain.Page;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface WriteBlogService extends JpaRepository<WriteBlog,Integer> {


}
