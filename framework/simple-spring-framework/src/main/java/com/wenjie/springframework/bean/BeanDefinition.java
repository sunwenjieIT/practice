package com.wenjie.springframework.bean;

/**
 * @author wenji
 * @Date 2023/1/8
 */
public class BeanDefinition {


    /**
     * class类型
     */
    private Class   type;
    /**
     * 作用域 单例 多例
     */
    private String  scope;
    /**
     * 是否懒加载
     */
    private boolean isLazy;

    public Class getType() {
        return type;
    }

    public void setType(Class type) {
        this.type = type;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public boolean isLazy() {
        return isLazy;
    }

    public void setLazy(boolean lazy) {
        isLazy = lazy;
    }


}
