package model;

import java.util.List;

public class Password {
    private Integer EventId;
    private String userId, passId, passName, userName, password, notes, siteLink;
    private List<String> passHistory;
    public Password(String userId, String passId, String passName, String userName, String password, String notes, String siteLink){
        this.userId = userId;
        this.passId = passId;
        this.passName = passName;
        this.userName = userName;
        this.password = password;
        this.notes = notes;
        this. siteLink = siteLink;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        userId = userId;
    }

    public String getPassId() {
        return passId;
    }

    public void setPassId(String passId) {
        passId = passId;
    }

    public Password(){

    }

    public Integer getEventId() {
        return EventId;
    }

    public void setEventId(Integer eventId) {
        EventId = eventId;
    }

    public String getPassName() {
        return passName;
    }

    public void setPassName(String passName) {
        this.passName = passName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public List<String> getPassHistory() {
        return passHistory;
    }

    public void setPassHistory(List<String> passHistory) {
        this.passHistory = passHistory;
    }

    public String getSiteLink() {
        return siteLink;
    }

    public void setSiteLink(String siteLink) {
        this.siteLink = siteLink;
    }

    @Override
    public String toString(){
        return String.format("[userId: %s, passName: %s, faceUser: %s, password: %s, notes: %s, passHistory: %s, siteLink: %s]", userId, passName, userName, password, notes, passHistory, siteLink);
    }
}
