package com.zzr.starter;

import org.springframework.boot.context.properties.ConfigurationProperties;

// 自动获取配置文件中前缀为http的属性，把值传入对象参数
@ConfigurationProperties(prefix = "com.zzr.starter")
public class StarterProperties {

    // 如果配置文件有com.zzr.starter.a, 则该默认属性会被覆盖
    private String string = "starter";

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }
}
