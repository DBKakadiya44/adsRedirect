package com.example.new_demo_238;

public class Datum {

    public Datum(String appName, String shortDescription, String appDescTitle, String appSubDesc, String appIcon, String appBanner, String appReview, String appLink, String appRate, String appSponsored) {
        this.appName = appName;
        this.shortDescription = shortDescription;
        this.appDescTitle = appDescTitle;
        this.appSubDesc = appSubDesc;
        this.appIcon = appIcon;
        this.appBanner = appBanner;
        this.appReview = appReview;
        this.appLink = appLink;
        this.appRate = appRate;
        this.appSponsored = appSponsored;
    }

    private String appName;

    private String shortDescription;

    private String appDescTitle;

    private String appSubDesc;

    private String appIcon;

    private String appBanner;

    private String appReview;

    private String appLink;

    private String appRate;

    private String appSponsored;

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getAppDescTitle() {
        return appDescTitle;
    }

    public void setAppDescTitle(String appDescTitle) {
        this.appDescTitle = appDescTitle;
    }

    public String getAppSubDesc() {
        return appSubDesc;
    }

    public void setAppSubDesc(String appSubDesc) {
        this.appSubDesc = appSubDesc;
    }

    public String getAppIcon() {
        return appIcon;
    }

    public void setAppIcon(String appIcon) {
        this.appIcon = appIcon;
    }

    public String getAppBanner() {
        return appBanner;
    }

    public void setAppBanner(String appBanner) {
        this.appBanner = appBanner;
    }

    public String getAppReview() {
        return appReview;
    }

    public void setAppReview(String appReview) {
        this.appReview = appReview;
    }

    public String getAppLink() {
        return appLink;
    }

    public void setAppLink(String appLink) {
        this.appLink = appLink;
    }

    public String getAppRate() {
        return appRate;
    }

    public void setAppRate(String appRate) {
        this.appRate = appRate;
    }

    public String getAppSponsored() {
        return appSponsored;
    }

    public void setAppSponsored(String appSponsored) {
        this.appSponsored = appSponsored;
    }

    @Override
    public String toString() {
        return "Datum{" +
                "appName='" + appName + '\'' +
                ", shortDescription='" + shortDescription + '\'' +
                ", appDescTitle='" + appDescTitle + '\'' +
                ", appSubDesc='" + appSubDesc + '\'' +
                ", appIcon='" + appIcon + '\'' +
                ", appBanner='" + appBanner + '\'' +
                ", appReview='" + appReview + '\'' +
                ", appLink='" + appLink + '\'' +
                ", appRate='" + appRate + '\'' +
                ", appSponsored='" + appSponsored + '\'' +
                '}';
    }
}