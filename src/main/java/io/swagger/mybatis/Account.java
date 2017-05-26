package io.swagger.mybatis;

import java.util.Date;
import java.util.List;

public class Account {
    private Integer id;

    private String accountName;

    private String address;

    private String nickname;

    private String smsConfirmCode;

    private Date smsConfirmCodeExpiryDate;

    private Boolean smsConfirmed;

    private String status;

    private String userToken;

    private String avatarPath;

    private Boolean passwordReset;

    private String passwordResetCode;

    private Date passwordResetCodeExpiryDate;

    private String type;

    private String signature;

    private String degree;

    private String passwordX;


    private List<Pet> pets;

    private Integer likedPostCount;

    private Integer followingCount;

    private Integer followerCount;

    public Integer getLikedPostCount() {
        return likedPostCount;
    }

    public void setLikedPostCount(Integer likedPostCount) {
        this.likedPostCount = likedPostCount;
    }

    public Integer getFollowingCount() {
        return followingCount;
    }

    public void setFollowingCount(Integer followingCount) {
        this.followingCount = followingCount;
    }

    public Integer getFollowerCount() {
        return followerCount;
    }

    public void setFollowerCount(Integer followerCount) {
        this.followerCount = followerCount;
    }

    public List<Pet> getPets() {
        return pets;
    }

    private  Integer postCount;

    public Integer getPostCount() {
        return postCount;
    }

    public void setPostCount(Integer postCount) {
        this.postCount = postCount;
    }

    public void setPets(List<Pet> pets) {
        this.pets = pets;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName == null ? null : accountName.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    public String getSmsConfirmCode() {
        return smsConfirmCode;
    }

    public void setSmsConfirmCode(String smsConfirmCode) {
        this.smsConfirmCode = smsConfirmCode == null ? null : smsConfirmCode.trim();
    }

    public Date getSmsConfirmCodeExpiryDate() {
        return smsConfirmCodeExpiryDate;
    }

    public void setSmsConfirmCodeExpiryDate(Date smsConfirmCodeExpiryDate) {
        this.smsConfirmCodeExpiryDate = smsConfirmCodeExpiryDate;
    }

    public Boolean getSmsConfirmed() {
        return smsConfirmed;
    }

    public void setSmsConfirmed(Boolean smsConfirmed) {
        this.smsConfirmed = smsConfirmed;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getUserToken() {
        return userToken;
    }

    public void setUserToken(String userToken) {
        this.userToken = userToken == null ? null : userToken.trim();
    }

    public String getAvatarPath() {
        return avatarPath;
    }

    public void setAvatarPath(String avatarPath) {
        this.avatarPath = avatarPath == null ? null : avatarPath.trim();
    }

    public Boolean getPasswordReset() {
        return passwordReset;
    }

    public void setPasswordReset(Boolean passwordReset) {
        this.passwordReset = passwordReset;
    }

    public String getPasswordResetCode() {
        return passwordResetCode;
    }

    public void setPasswordResetCode(String passwordResetCode) {
        this.passwordResetCode = passwordResetCode == null ? null : passwordResetCode.trim();
    }

    public Date getPasswordResetCodeExpiryDate() {
        return passwordResetCodeExpiryDate;
    }

    public void setPasswordResetCodeExpiryDate(Date passwordResetCodeExpiryDate) {
        this.passwordResetCodeExpiryDate = passwordResetCodeExpiryDate;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature == null ? null : signature.trim();
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree == null ? null : degree.trim();
    }

    public String getPasswordX() {
        return passwordX;
    }

    public void setPasswordX(String passwordX) {
        this.passwordX = passwordX == null ? null : passwordX.trim();
    }
}