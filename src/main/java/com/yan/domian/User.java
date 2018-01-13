package com.yan.domian;


import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "USER")
public class User implements Serializable {

    private String isFalse;
    private Integer id;
    private String type;
    private String username;
    private String trueName;
    private String password;
    private String credit;
    private String mobile;
    private String email;
    private String headPhoto;
    private String pid;
    private String roles;
    private String status;
    private String agent;
    private String agentPass;
    private Date createTime;
    private Date loginTime;
    private String sessionId;
    private String certStatus;
    private String gid;
    private String paySecret;
    private String yewu;
    private String loginIp;
    private String userNo;
    private String vip;

    @Column(length = 20)
    public String getIsFalse() {
        return isFalse;
    }

    public void setIsFalse(String isFalse) {
        this.isFalse = isFalse;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(length = 20)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column(length = 30)
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Column(length = 200)
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Column(length = 40)
    public String getTrueName() {
        return trueName;
    }

    public void setTrueName(String trueName) {
        this.trueName = trueName;
    }

    @Column(length = 30)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Column(length = 30)
    public String getCredit() {
        return credit;
    }

    public void setCredit(String credit) {
        this.credit = credit;
    }

    @Column(length = 100)
    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @Column(length = 100)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Column(length = 30)
    public String getHeadPhoto() {
        return headPhoto;
    }

    public void setHeadPhoto(String headPhoto) {
        this.headPhoto = headPhoto;
    }

    @Column(length = 30)
    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    @Column(length = 30)
    public String getRoles() {
        return roles;
    }

    public void setRoles(String roles) {
        this.roles = roles;
    }

    @Column(length = 30)
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Column(length = 50)
    public String getAgent() {
        return agent;
    }

    public void setAgent(String agent) {
        this.agent = agent;
    }

    @Column(length = 200)
    public String getAgentPass() {
        return agentPass;
    }

    public void setAgentPass(String agentPass) {
        this.agentPass = agentPass;
    }

    @Column(length = 30)
    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Column(length = 100)
    public Date getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }

    @Column(length = 100)
    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    @Column(length = 30)
    public String getCertStatus() {
        return certStatus;
    }

    public void setCertStatus(String certStatus) {
        this.certStatus = certStatus;
    }

    @Column(length = 30)
    public String getGid() {
        return gid;
    }

    public void setGid(String gid) {
        this.gid = gid;
    }

    @Column(length = 30)
    public String getPaySecret() {
        return paySecret;
    }

    public void setPaySecret(String paySecret) {
        this.paySecret = paySecret;
    }

    @Column(length = 30)
    public String getYewu() {
        return yewu;
    }

    public void setYewu(String yewu) {
        this.yewu = yewu;
    }

    @Column(length = 30)
    public String getLoginIp() {
        return loginIp;
    }

    public void setLoginIp(String loginIp) {
        this.loginIp = loginIp;
    }

    @Column(length = 30)
    public String getUserNo() {
        return userNo;
    }

    public void setUserNo(String userNo) {
        this.userNo = userNo;
    }

    @Column(length = 30)
    public String getVip() {
        return vip;
    }

    public void setVip(String vip) {
        this.vip = vip;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (isFalse != null ? !isFalse.equals(user.isFalse) : user.isFalse != null) return false;
        if (id != null ? !id.equals(user.id) : user.id != null) return false;
        if (type != null ? !type.equals(user.type) : user.type != null) return false;
        if (username != null ? !username.equals(user.username) : user.username != null) return false;
        if (trueName != null ? !trueName.equals(user.trueName) : user.trueName != null) return false;
        if (password != null ? !password.equals(user.password) : user.password != null) return false;
        if (credit != null ? !credit.equals(user.credit) : user.credit != null) return false;
        if (mobile != null ? !mobile.equals(user.mobile) : user.mobile != null) return false;
        if (email != null ? !email.equals(user.email) : user.email != null) return false;
        if (headPhoto != null ? !headPhoto.equals(user.headPhoto) : user.headPhoto != null) return false;
        if (pid != null ? !pid.equals(user.pid) : user.pid != null) return false;
        if (roles != null ? !roles.equals(user.roles) : user.roles != null) return false;
        if (status != null ? !status.equals(user.status) : user.status != null) return false;
        if (agent != null ? !agent.equals(user.agent) : user.agent != null) return false;
        if (agentPass != null ? !agentPass.equals(user.agentPass) : user.agentPass != null) return false;
        if (createTime != null ? !createTime.equals(user.createTime) : user.createTime != null) return false;
        if (loginTime != null ? !loginTime.equals(user.loginTime) : user.loginTime != null) return false;
        if (sessionId != null ? !sessionId.equals(user.sessionId) : user.sessionId != null) return false;
        if (certStatus != null ? !certStatus.equals(user.certStatus) : user.certStatus != null) return false;
        if (gid != null ? !gid.equals(user.gid) : user.gid != null) return false;
        if (paySecret != null ? !paySecret.equals(user.paySecret) : user.paySecret != null) return false;
        if (yewu != null ? !yewu.equals(user.yewu) : user.yewu != null) return false;
        if (loginIp != null ? !loginIp.equals(user.loginIp) : user.loginIp != null) return false;
        if (userNo != null ? !userNo.equals(user.userNo) : user.userNo != null) return false;
        return vip != null ? vip.equals(user.vip) : user.vip == null;
    }

    @Override
    public int hashCode() {
        int result = isFalse != null ? isFalse.hashCode() : 0;
        result = 31 * result + (id != null ? id.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (username != null ? username.hashCode() : 0);
        result = 31 * result + (trueName != null ? trueName.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (credit != null ? credit.hashCode() : 0);
        result = 31 * result + (mobile != null ? mobile.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (headPhoto != null ? headPhoto.hashCode() : 0);
        result = 31 * result + (pid != null ? pid.hashCode() : 0);
        result = 31 * result + (roles != null ? roles.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (agent != null ? agent.hashCode() : 0);
        result = 31 * result + (agentPass != null ? agentPass.hashCode() : 0);
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        result = 31 * result + (loginTime != null ? loginTime.hashCode() : 0);
        result = 31 * result + (sessionId != null ? sessionId.hashCode() : 0);
        result = 31 * result + (certStatus != null ? certStatus.hashCode() : 0);
        result = 31 * result + (gid != null ? gid.hashCode() : 0);
        result = 31 * result + (paySecret != null ? paySecret.hashCode() : 0);
        result = 31 * result + (yewu != null ? yewu.hashCode() : 0);
        result = 31 * result + (loginIp != null ? loginIp.hashCode() : 0);
        result = 31 * result + (userNo != null ? userNo.hashCode() : 0);
        result = 31 * result + (vip != null ? vip.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "User{" +
                "isFalse='" + isFalse + '\'' +
                ", id=" + id +
                ", type='" + type + '\'' +
                ", username='" + username + '\'' +
                ", trueName='" + trueName + '\'' +
                ", password='" + password + '\'' +
                ", credit='" + credit + '\'' +
                ", mobile='" + mobile + '\'' +
                ", email='" + email + '\'' +
                ", headPhoto='" + headPhoto + '\'' +
                ", pid='" + pid + '\'' +
                ", roles='" + roles + '\'' +
                ", status='" + status + '\'' +
                ", agent='" + agent + '\'' +
                ", agentPass='" + agentPass + '\'' +
                ", createTime=" + createTime +
                ", loginTime=" + loginTime +
                ", sessionId='" + sessionId + '\'' +
                ", certStatus='" + certStatus + '\'' +
                ", gid='" + gid + '\'' +
                ", paySecret='" + paySecret + '\'' +
                ", yewu='" + yewu + '\'' +
                ", loginIp='" + loginIp + '\'' +
                ", userNo='" + userNo + '\'' +
                ", vip='" + vip + '\'' +
                '}';
    }
}
