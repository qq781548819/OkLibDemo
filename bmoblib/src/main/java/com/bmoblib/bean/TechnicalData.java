package com.bmoblib.bean;

import cn.bmob.v3.BmobObject;

/**
 * 时间：2017/9/29
 * 作者：黄伟才
 * 简书：http://www.jianshu.com/p/87e7392a16ff
 * github：https://github.com/huangweicai/OkLibDemo
 * 描述：技术资料
 */

public class TechnicalData extends BmobObject {
    private String headPortrait;//头像
    private String name;//名称
    private String introduce;//介绍
    private String referralLinks;//资料链接
    private Integer recordNum;//插入记录号码
    private String inviteCode;//邀请码

    public String getInviteCode() {
        return inviteCode;
    }

    public void setInviteCode(String inviteCode) {
        this.inviteCode = inviteCode;
    }

    public String getHeadPortrait() {
        return headPortrait;
    }

    public void setHeadPortrait(String headPortrait) {
        this.headPortrait = headPortrait;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }

    public String getReferralLinks() {
        return referralLinks;
    }

    public void setReferralLinks(String referralLinks) {
        this.referralLinks = referralLinks;
    }

    public Integer getRecordNum() {
        return recordNum;
    }

    public void setRecordNum(Integer recordNum) {
        this.recordNum = recordNum;
    }

    @Override
    public String toString() {
        return "TechnicalData{" +
                "headPortrait='" + headPortrait + '\'' +
                ", name='" + name + '\'' +
                ", introduce='" + introduce + '\'' +
                ", referralLinks='" + referralLinks + '\'' +
                ", recordNum=" + recordNum +
                ", inviteCode=" + inviteCode +
                '}';
    }
}
