package com.emurugova.config;

import org.aeonbits.owner.Config;

@MainConfig.Sources({"classpath:config/credentials.properties"})
public interface MainConfig extends Config {

    @Config.Key("userName")
    String getUserName();

    @Config.Key("accessKey")
    String getAccessKey();

    @Config.Key("remoteUrl")
    String getRemoteUrl();
}
