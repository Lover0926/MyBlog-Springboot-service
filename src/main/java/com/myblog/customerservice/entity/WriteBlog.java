package com.myblog.customerservice.entity;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.relational.core.sql.In;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
@Setter
@Getter
public class WriteBlog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer blogid;
    private Integer userid;
    private String  blogauthor;
    private String  blogtitle;
    private String  blogcontent;
    private String  blogcreatetime;
    private String  blogupdatetime;
    private String  blogremarks;
    private String  listname;

    public String getListname() {
        return listname;
    }

    public void setListname(String listname) {
        this.listname = listname;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }


    public String getBlogtitle() {
        return blogtitle;
    }

    public void setBlogtitle(String blogtitle) {
        this.blogtitle = blogtitle;
    }



    public Integer getBlogid() {
        return blogid;
    }

    public void setBlogid(Integer blogid) {
        this.blogid = blogid;
    }

    public String getBlogauthor() {
        return blogauthor;
    }

    public void setBlogauthor(String blogauthor) {
        this.blogauthor = blogauthor;
    }

    public String getBlogcontent() {
        return blogcontent;
    }

    public void setBlogcontent(String blogcontent) {
        this.blogcontent = blogcontent;
    }

    public String getBlogcreatetime() {
        return blogcreatetime;
    }

    public void setBlogcreatetime(String blogcreatetime) {
        this.blogcreatetime = blogcreatetime;
    }

    public String getBlogupdatetime() {
        return blogupdatetime;
    }

    public void setBlogupdatetime(String blogupdatetime) {
        this.blogupdatetime = blogupdatetime;
    }

    public String getBlogremarks() {
        return blogremarks;
    }

    public void setBlogremarks(String blogremarks) {
        this.blogremarks = blogremarks;
    }
}
