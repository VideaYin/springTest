package com.imooc.IoC.learn.injectBean;

/**
 * Description:
 * <p>
 * Created by YinQZ on 2019/6/11.
 */
public class AnotherBean {
    private Integer id;
    private String name;
    private String add;

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

    @Override
    public String toString() {
        return "AnotherBean{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", add='" + add + '\'' +
                '}';
    }
}
