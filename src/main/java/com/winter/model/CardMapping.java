package com.winter.model;

import java.util.Date;

public class CardMapping {
    private Long id;

    private String wid;

    private String appid;

    private Long merchantId;

    private Long cardTemplateId;

    private Byte cardType;

    private String thirdCardId;

    private String localCode;

    private String thirdBusinessCode;

    private Byte channel;

    private Byte source;

    private Byte thirdStatus;

    private Date createTime;

    private Date updateTime;

    private String thirdUserId;

    private String thirdBizCode;

    private Byte bizType;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getWid() {
        return wid;
    }

    public void setWid(String wid) {
        this.wid = wid == null ? null : wid.trim();
    }

    public String getAppid() {
        return appid;
    }

    public void setAppid(String appid) {
        this.appid = appid == null ? null : appid.trim();
    }

    public Long getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(Long merchantId) {
        this.merchantId = merchantId;
    }

    public Long getCardTemplateId() {
        return cardTemplateId;
    }

    public void setCardTemplateId(Long cardTemplateId) {
        this.cardTemplateId = cardTemplateId;
    }

    public Byte getCardType() {
        return cardType;
    }

    public void setCardType(Byte cardType) {
        this.cardType = cardType;
    }

    public String getThirdCardId() {
        return thirdCardId;
    }

    public void setThirdCardId(String thirdCardId) {
        this.thirdCardId = thirdCardId == null ? null : thirdCardId.trim();
    }

    public String getLocalCode() {
        return localCode;
    }

    public void setLocalCode(String localCode) {
        this.localCode = localCode == null ? null : localCode.trim();
    }

    public String getThirdBusinessCode() {
        return thirdBusinessCode;
    }

    public void setThirdBusinessCode(String thirdBusinessCode) {
        this.thirdBusinessCode = thirdBusinessCode == null ? null : thirdBusinessCode.trim();
    }

    public Byte getChannel() {
        return channel;
    }

    public void setChannel(Byte channel) {
        this.channel = channel;
    }

    public Byte getSource() {
        return source;
    }

    public void setSource(Byte source) {
        this.source = source;
    }

    public Byte getThirdStatus() {
        return thirdStatus;
    }

    public void setThirdStatus(Byte thirdStatus) {
        this.thirdStatus = thirdStatus;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getThirdUserId() {
        return thirdUserId;
    }

    public void setThirdUserId(String thirdUserId) {
        this.thirdUserId = thirdUserId == null ? null : thirdUserId.trim();
    }

    public String getThirdBizCode() {
        return thirdBizCode;
    }

    public void setThirdBizCode(String thirdBizCode) {
        this.thirdBizCode = thirdBizCode == null ? null : thirdBizCode.trim();
    }

    public Byte getBizType() {
        return bizType;
    }

    public void setBizType(Byte bizType) {
        this.bizType = bizType;
    }
}