package com.myblog.customerservice.service;

import com.myblog.customerservice.entity.Listlable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface ListService extends JpaRepository<Listlable,Integer>, CrudRepository<Listlable,Integer> {

}
