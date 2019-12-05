package com.imooc.IoC.learn.injectBean.annotate;

import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Description:
 * <p>
 * Created by YinQZ on 2019/11/7.
 */
@Component("abean")
public class AnnotateBean {
    private Integer id;
    private String name;
    private String add;
    private List<String> behavior;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdd() {
        return add;
    }

    public void setAdd(String add) {
        this.add = add;
    }

    public List<String> getBehavior() {
        return behavior;
    }

    public void setBehavior(List<String> behavior) {
        this.behavior = behavior;
    }
}
