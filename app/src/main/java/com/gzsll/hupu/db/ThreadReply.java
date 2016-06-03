package com.gzsll.hupu.db;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 

import com.gzsll.hupu.bean.ThreadReplyQuote;
import java.util.List;

/**
 * Entity mapped to table THREAD_REPLY.
 */
public class ThreadReply {

    private String tid;
    private String pid;
    private String puid;
    private String via;
    private String content;
    private String create_time;
    private String update_info;
    private Integer light_count;
    private Integer user_banned;
    private Integer floor;
    private String time;
    private String userName;
    private String userImg;
    private String smallcontent;
    private String togglecontent;
    private Integer index;
    private Boolean isLight;
    private String quoteHeader;
    private String quoteContent;
    private String quoteToggle;
    private Integer pageIndex;
    private List<ThreadReplyQuote> quote;

    public ThreadReply() {
    }

    public ThreadReply(String tid, String pid, String puid, String via, String content,
        String create_time, String update_info, Integer light_count, Integer user_banned,
        Integer floor, String time, String userName, String userImg, String smallcontent,
        String togglecontent, Integer index, Boolean isLight, String quoteHeader,
        String quoteContent, String quoteToggle, Integer pageIndex) {
        this.tid = tid;
        this.pid = pid;
        this.puid = puid;
        this.via = via;
        this.content = content;
        this.create_time = create_time;
        this.update_info = update_info;
        this.light_count = light_count;
        this.user_banned = user_banned;
        this.floor = floor;
        this.time = time;
        this.userName = userName;
        this.userImg = userImg;
        this.smallcontent = smallcontent;
        this.togglecontent = togglecontent;
        this.index = index;
        this.isLight = isLight;
        this.quoteHeader = quoteHeader;
        this.quoteContent = quoteContent;
        this.quoteToggle = quoteToggle;
        this.pageIndex = pageIndex;
    }

    public String getTid() {
        return tid;
    }

    public void setTid(String tid) {
        this.tid = tid;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getPuid() {
        return puid;
    }

    public void setPuid(String puid) {
        this.puid = puid;
    }

    public String getVia() {
        return via;
    }

    public void setVia(String via) {
        this.via = via;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getCreate_time() {
        return create_time;
    }

    public void setCreate_time(String create_time) {
        this.create_time = create_time;
    }

    public String getUpdate_info() {
        return update_info;
    }

    public void setUpdate_info(String update_info) {
        this.update_info = update_info;
    }

    public Integer getLight_count() {
        return light_count;
    }

    public void setLight_count(Integer light_count) {
        this.light_count = light_count;
    }

    public Integer getUser_banned() {
        return user_banned;
    }

    public void setUser_banned(Integer user_banned) {
        this.user_banned = user_banned;
    }

    public Integer getFloor() {
        return floor;
    }

    public void setFloor(Integer floor) {
        this.floor = floor;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserImg() {
        return userImg;
    }

    public void setUserImg(String userImg) {
        this.userImg = userImg;
    }

    public String getSmallcontent() {
        return smallcontent;
    }

    public void setSmallcontent(String smallcontent) {
        this.smallcontent = smallcontent;
    }

    public String getTogglecontent() {
        return togglecontent;
    }

    public void setTogglecontent(String togglecontent) {
        this.togglecontent = togglecontent;
    }

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    public Boolean getIsLight() {
        return isLight;
    }

    public void setIsLight(Boolean isLight) {
        this.isLight = isLight;
    }

    public String getQuoteHeader() {
        return quoteHeader;
    }

    public void setQuoteHeader(String quoteHeader) {
        this.quoteHeader = quoteHeader;
    }

    public String getQuoteContent() {
        return quoteContent;
    }

    public void setQuoteContent(String quoteContent) {
        this.quoteContent = quoteContent;
    }

    public String getQuoteToggle() {
        return quoteToggle;
    }

    public void setQuoteToggle(String quoteToggle) {
        this.quoteToggle = quoteToggle;
    }

    public Integer getPageIndex() {
        return pageIndex;
    }

    public void setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
    }

  public List<ThreadReplyQuote> getQuote() {
    return quote;
  }

  public void setQuote(List<ThreadReplyQuote> quote) {
    this.quote = quote;
  }
}
