package com.hp.devops.demoapp.tests.ui;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class TestData {

    private WebDriver driver;
    private boolean isBehindProxy = false;
    private String testProxy;
    private String appUrl;
    private boolean isMusicApp;

    public WebDriver getDriver() {
        return driver;
    }

    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isBehindProxy() {
        return isBehindProxy;
    }

    public void setBehindProxy(boolean behindProxy) {
        isBehindProxy = behindProxy;
    }

    public String getTestProxy() {
        return testProxy;
    }

    public void setTestProxy(String testProxy) {
        this.testProxy = testProxy;
    }

    public String getAppUrl() {
        return appUrl;
    }

    public void setAppUrl(String appUrl) {
        this.appUrl = appUrl;
    }

    public static TestData generate(){
        return generate(false);
    }

    public boolean isMusicApp() {
        return isMusicApp;
    }

    public void setMusicApp(boolean musicApp) {
        isMusicApp = musicApp;
    }

    private static TestData generate(boolean isMusicApp){

        TestData data = new TestData();
        data.setMusicApp(isMusicApp);
        if(isMusicApp){
            data.setTestProxy("web-proxy.bbn.hp.com:8081");
            data.setAppUrl("http://54.146.140.70:9000");
        } else {
            data.setTestProxy("");
            data.setAppUrl("http://myd-vm10629.hpeswlab.net:8080");
        }

        if ("true".equals(System.getProperty("proxy"))) {
            data.setBehindProxy(true);
            System.out.println("isBehindProxy is true!");
            if (System.getenv("testproxy") != null) {
                data.setTestProxy(System.getenv("testproxy"));
            }
            System.out.println("testProxy is " + data.getTestProxy() + "; can be modified via environment variable, i.e., 'export testproxy=web-proxy.bbn.hp.com:8080'");

        }
        else {
            System.out.println("We do not use proxy.");
        }

        if (data.isBehindProxy) {
            Proxy proxy = new Proxy();
            proxy.setHttpProxy(data.getTestProxy());
            DesiredCapabilities cap = new DesiredCapabilities();
            cap.setCapability(CapabilityType.PROXY, proxy);
            data.setDriver(new HtmlUnitDriver(cap));
        }
        else {
            data.setDriver(new HtmlUnitDriver());
        }
        if (System.getProperty("appUrl") != null) {
            data.setAppUrl(System.getProperty("appUrl"));
        }
        System.out.println("App URL is " + data.getAppUrl() + "; can be modifed via system property, i.e., '-DappUrl=\"http://54.146.140.70:9000\"'");

        data.getDriver().get(data.getAppUrl());
        return data;
    }
}
