package com.hp.devops.demoapp.tests.ui;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class TestData {

    private WebDriver driver;
    private String autHost;
    private String autPort;
    private String proxyHost;   //  web-proxy.bbn.hp.com
    private String proxyPort;   //  8080
    private String appUrl = "";
    private boolean isMusicApp;

    public static TestData generate() {

        TestData data = new TestData();
        data.setMusicApp(false);
        if (data.isMusicApp()) {
            data.setAutHost(System.getProperty("app.host"));
            if (data.getAutHost() == null || data.getAutHost().compareTo("") == 0) {
                data.setAutHost("http://localhost");
            }
            data.setAutPort(System.getProperty("app.port"));
            if (data.getAutPort() == null || data.getAutPort().compareTo("") == 0) {
                data.setAutPort("9999");
            }

            data.setProxyHost(System.getProperty("proxy.host"));
            data.setProxyPort(System.getProperty("proxy.port"));
            data.setAppUrl(data.getAutHost() + ":" + data.getAutPort());
        } else {
            data.setProxyHost("");
            data.setProxyPort("");
            data.setAutHost("http://myd-vm10629.hpeswlab.net");
            data.setAutPort("8080");
            data.setAppUrl(data.getAutHost() + ":" + data.getAutPort());
        }
        if (data.getProxyHost() == null || data.getProxyPort() == null || data.getProxyHost().compareTo("") == 0 || data.getProxyPort().compareTo("") == 0) {
            data.setDriver(new HtmlUnitDriver());
        } else {
            Proxy proxy = new Proxy();
            proxy.setHttpProxy(data.getProxyHost() + ":" + data.getProxyPort());
            DesiredCapabilities cap = new DesiredCapabilities();
            cap.setCapability(CapabilityType.PROXY, proxy);
            data.setDriver(new ChromeDriver(cap));
        }

        data.getDriver().get(data.getAppUrl());
        return data;
    }

    public String getProxyHost() {
        return proxyHost;
    }

    public void setProxyHost(String proxyHost) {
        this.proxyHost = proxyHost;
    }

    public WebDriver getDriver() {
        return driver;
    }

    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }

    public String getAutHost() {
        return autHost;
    }

    public void setAutHost(String autHost) {
        this.autHost = autHost;
    }

    public String getAutPort() {
        return autPort;
    }

    public void setAutPort(String autPort) {
        this.autPort = autPort;
    }

    public String getProxyPort() {
        return proxyPort;
    }

    public void setProxyPort(String proxyPort) {
        this.proxyPort = proxyPort;
    }

    public String getAppUrl() {
        return appUrl;
    }

    public void setAppUrl(String appUrl) {
        this.appUrl = appUrl;
    }

    public boolean isMusicApp() {
        return isMusicApp;
    }

    public void setMusicApp(boolean musicApp) {
        isMusicApp = musicApp;
    }
}
