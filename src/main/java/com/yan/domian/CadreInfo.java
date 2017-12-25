package com.yan.domian;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by hp yan on 2017/11/1.
 *
 * @author hp yan
 * @version 1.0
 * @since 1.0
 * Copyright (C) 2017. hp yan All Rights Received
 */
@Entity
@Table(name = "CADRE_INFO")
public class CadreInfo implements Serializable {

    private static final long serialVersionUID = -5462074612688379506L;

    /**
     * 单位个人信息唯一标识
     */
    private String id;
    /**
     * 姓名
     */
    private String name;
    /**
     * 性别
     */
    private String gender;
    /**
     * 出生日期
     */
    private Date birthday;
    /**
     * 籍贯名称
     */
    private String nativePlace;
    /**
     * 出生地名称
     */
    private String birthPlace;
    /**
     * 民族
     */
    private String nation;
    /**
     * 健康状况
     */
    private String health;
    /**
     * 婚姻状况
     */
    private String maritalStatus;
    /**
     * 参加工作日期
     */
    private Date workDate;
    /**
     * 个人身份特殊标识
     */
    private String specialIdentification;
    /**
     * 人事关系所在单位名称
     */
    private String leadershipName;
    /**
     * 人事关系所在单位代码
     */
    private String leadershipId;
    /**
     * 离岗退养标识
     */
    private Boolean retire;
    /**
     * 人员类别
     */
    private Boolean personType;
    /**
     * 人事关系所在单位行政区划
     */
    private String leadershipDivision;
    /**
     * 人事关系所在单位隶属关系
     */
    private String leadershipLevel;
    /**
     * 人员管理状态
     */
    private String personStatus;
    /**
     * 人员管理类别
     */
    private String personManageCategory;
    /**
     * 户籍所在地
     */
    private String domicilePlace;
    /**
     * 成长地
     */
    private String growthPlace;
    /**
     * 现工作单位及职务
     */
    private String duty;
    /**
     * 公民身份号码
     */
    private String identityNumber;
    /**
     * 专长
     */
    private String specialty;
    /**
     * 爱好
     */
    private String hobby;
    /**
     * 基层工作经历时间
     */
    private Integer grassrootsWorkTime;
    /**
     * 是否具有基层工作经历
     */
    private String grassrootsWork;
    /**
     * 基层工作单位
     */
    private String grassrootsWorkDepartment;
    /**
     * 年龄
     */
    private Integer age;



    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid")
    @Column(length = 36)
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Column(length = 50)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(length = 3)
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Column(length = 80)
    public String getNativePlace() {
        return nativePlace;
    }

    public void setNativePlace(String nativePlace) {
        this.nativePlace = nativePlace;
    }

    @Column(length = 80)
    public String getBirthPlace() {
        return birthPlace;
    }

    public void setBirthPlace(String birthPlace) {
        this.birthPlace = birthPlace;
    }

    @Column(length = 20)
    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    @Column(length = 50)
    public String getHealth() {
        return health;
    }

    public void setHealth(String health) {
        this.health = health;
    }

    @Column(length = 20)
    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public Date getWorkDate() {
        return workDate;
    }

    public void setWorkDate(Date workDate) {
        this.workDate = workDate;
    }

    @Column(length = 50)
    public String getSpecialIdentification() {
        return specialIdentification;
    }

    public void setSpecialIdentification(String specialIdentification) {
        this.specialIdentification = specialIdentification;
    }

    @Column(length = 120)
    public String getLeadershipName() {
        return leadershipName;
    }

    public void setLeadershipName(String leadershipName) {
        this.leadershipName = leadershipName;
    }

    @Column(length = 36)
    public String getLeadershipId() {
        return leadershipId;
    }

    public void setLeadershipId(String leadershipId) {
        this.leadershipId = leadershipId;
    }

    @Column(length = 1)
    public Boolean getRetire() {
        return retire;
    }

    public void setRetire(Boolean retire) {
        this.retire = retire;
    }

    @Column(length = 50)
    public Boolean getPersonType() {
        return personType;
    }

    public void setPersonType(Boolean personType) {
        this.personType = personType;
    }

    @Column(length = 80)
    public String getLeadershipDivision() {
        return leadershipDivision;
    }

    public void setLeadershipDivision(String leadershipDivision) {
        this.leadershipDivision = leadershipDivision;
    }

    @Column(length = 30)
    public String getLeadershipLevel() {
        return leadershipLevel;
    }

    public void setLeadershipLevel(String leadershipLevel) {
        this.leadershipLevel = leadershipLevel;
    }

    @Column(length = 10)
    public String getPersonStatus() {
        return personStatus;
    }

    public void setPersonStatus(String personStatus) {
        this.personStatus = personStatus;
    }

    @Column(length = 20)
    public String getPersonManageCategory() {
        return personManageCategory;
    }

    public void setPersonManageCategory(String personManageCategory) {
        this.personManageCategory = personManageCategory;
    }

    @Column(length = 80)
    public String getDomicilePlace() {
        return domicilePlace;
    }

    public void setDomicilePlace(String domicilePlace) {
        this.domicilePlace = domicilePlace;
    }

    @Column(length = 50)
    public String getGrowthPlace() {
        return growthPlace;
    }

    public void setGrowthPlace(String growthPlace) {
        this.growthPlace = growthPlace;
    }

    @Column(length = 1000)
    public String getDuty() {
        return duty;
    }

    public void setDuty(String duty) {
        this.duty = duty;
    }

    @Column(length = 18)
    public String getIdentityNumber() {
        return identityNumber;
    }

    public void setIdentityNumber(String identityNumber) {
        this.identityNumber = identityNumber;
    }

    @Column(length = 100)
    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    @Column(length = 100)
    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    @Column(length = 2)
    public Integer getGrassrootsWorkTime() {
        return grassrootsWorkTime;
    }

    public void setGrassrootsWorkTime(Integer grassrootsWorkTime) {
        this.grassrootsWorkTime = grassrootsWorkTime;
    }

    @Column(length = 2)
    public String getGrassrootsWork() {
        return grassrootsWork;
    }

    public void setGrassrootsWork(String grassrootsWork) {
        this.grassrootsWork = grassrootsWork;
    }

    @Column(length = 120)
    public String getGrassrootsWorkDepartment() {
        return grassrootsWorkDepartment;
    }

    public void setGrassrootsWorkDepartment(String grassrootsWorkDepartment) {
        this.grassrootsWorkDepartment = grassrootsWorkDepartment;
    }

    @Column(length = 3)
    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        CadreInfo cadreInfo = (CadreInfo) o;

        if (getId() != null ? !getId().equals(cadreInfo.getId()) : cadreInfo.getId() != null) {
            return false;
        }
        if (getName() != null ? !getName().equals(cadreInfo.getName()) : cadreInfo.getName() != null) {
            return false;
        }
        if (getGender() != null ? !getGender().equals(cadreInfo.getGender()) : cadreInfo.getGender() != null) {
            return false;
        }
        if (getBirthday() != null ? !getBirthday().equals(cadreInfo.getBirthday()) : cadreInfo.getBirthday() != null) {
            return false;
        }
        if (getNativePlace() != null ? !getNativePlace().equals(cadreInfo.getNativePlace()) : cadreInfo.getNativePlace() != null) {
            return false;
        }
        if (getBirthPlace() != null ? !getBirthPlace().equals(cadreInfo.getBirthPlace()) : cadreInfo.getBirthPlace() != null) {
            return false;
        }
        if (getNation() != null ? !getNation().equals(cadreInfo.getNation()) : cadreInfo.getNation() != null) {
            return false;
        }
        if (getHealth() != null ? !getHealth().equals(cadreInfo.getHealth()) : cadreInfo.getHealth() != null) {
            return false;
        }
        if (getMaritalStatus() != null ? !getMaritalStatus().equals(cadreInfo.getMaritalStatus()) : cadreInfo.getMaritalStatus() != null) {
            return false;
        }
        if (getWorkDate() != null ? !getWorkDate().equals(cadreInfo.getWorkDate()) : cadreInfo.getWorkDate() != null) {
            return false;
        }
        if (getSpecialIdentification() != null ? !getSpecialIdentification().equals(cadreInfo.getSpecialIdentification()) : cadreInfo.getSpecialIdentification() != null) {
            return false;
        }
        if (getLeadershipName() != null ? !getLeadershipName().equals(cadreInfo.getLeadershipName()) : cadreInfo.getLeadershipName() != null) {
            return false;
        }
        if (getLeadershipId() != null ? !getLeadershipId().equals(cadreInfo.getLeadershipId()) : cadreInfo.getLeadershipId() != null) {
            return false;
        }
        if (getRetire() != null ? !getRetire().equals(cadreInfo.getRetire()) : cadreInfo.getRetire() != null) {
            return false;
        }
        if (getPersonType() != null ? !getPersonType().equals(cadreInfo.getPersonType()) : cadreInfo.getPersonType() != null) {
            return false;
        }
        if (getLeadershipDivision() != null ? !getLeadershipDivision().equals(cadreInfo.getLeadershipDivision()) : cadreInfo.getLeadershipDivision() != null) {
            return false;
        }
        if (getLeadershipLevel() != null ? !getLeadershipLevel().equals(cadreInfo.getLeadershipLevel()) : cadreInfo.getLeadershipLevel() != null) {
            return false;
        }
        if (getPersonStatus() != null ? !getPersonStatus().equals(cadreInfo.getPersonStatus()) : cadreInfo.getPersonStatus() != null) {
            return false;
        }
        if (getPersonManageCategory() != null ? !getPersonManageCategory().equals(cadreInfo.getPersonManageCategory()) : cadreInfo.getPersonManageCategory() != null) {
            return false;
        }
        if (getDomicilePlace() != null ? !getDomicilePlace().equals(cadreInfo.getDomicilePlace()) : cadreInfo.getDomicilePlace() != null) {
            return false;
        }
        if (getGrowthPlace() != null ? !getGrowthPlace().equals(cadreInfo.getGrowthPlace()) : cadreInfo.getGrowthPlace() != null) {
            return false;
        }
        if (getDuty() != null ? !getDuty().equals(cadreInfo.getDuty()) : cadreInfo.getDuty() != null) {
            return false;
        }
        if (getIdentityNumber() != null ? !getIdentityNumber().equals(cadreInfo.getIdentityNumber()) : cadreInfo.getIdentityNumber() != null) {
            return false;
        }
        if (getSpecialty() != null ? !getSpecialty().equals(cadreInfo.getSpecialty()) : cadreInfo.getSpecialty() != null) {
            return false;
        }
        if (getHobby() != null ? !getHobby().equals(cadreInfo.getHobby()) : cadreInfo.getHobby() != null) {
            return false;
        }
        if (getGrassrootsWorkTime() != null ? !getGrassrootsWorkTime().equals(cadreInfo.getGrassrootsWorkTime()) : cadreInfo.getGrassrootsWorkTime() != null) {
            return false;
        }
        if (getGrassrootsWork() != null ? !getGrassrootsWork().equals(cadreInfo.getGrassrootsWork()) : cadreInfo.getGrassrootsWork() != null) {
            return false;
        }
        if (getGrassrootsWorkDepartment() != null ? !getGrassrootsWorkDepartment().equals(cadreInfo.getGrassrootsWorkDepartment()) : cadreInfo.getGrassrootsWorkDepartment() != null) {
            return false;
        }
        if (getAge() != null ? !getAge().equals(cadreInfo.getAge()) : cadreInfo.getAge() != null) {
            return false;
        }
        return false;
    }

    @Override
    public int hashCode() {
        int result = getId() != null ? getId().hashCode() : 0;
        result = 31 * result + (getName() != null ? getName().hashCode() : 0);
        result = 31 * result + (getGender() != null ? getGender().hashCode() : 0);
        result = 31 * result + (getBirthday() != null ? getBirthday().hashCode() : 0);
        result = 31 * result + (getNativePlace() != null ? getNativePlace().hashCode() : 0);
        result = 31 * result + (getBirthPlace() != null ? getBirthPlace().hashCode() : 0);
        result = 31 * result + (getNation() != null ? getNation().hashCode() : 0);
        result = 31 * result + (getHealth() != null ? getHealth().hashCode() : 0);
        result = 31 * result + (getMaritalStatus() != null ? getMaritalStatus().hashCode() : 0);
        result = 31 * result + (getWorkDate() != null ? getWorkDate().hashCode() : 0);
        result = 31 * result + (getSpecialIdentification() != null ? getSpecialIdentification().hashCode() : 0);
        result = 31 * result + (getLeadershipName() != null ? getLeadershipName().hashCode() : 0);
        result = 31 * result + (getLeadershipId() != null ? getLeadershipId().hashCode() : 0);
        result = 31 * result + (getRetire() != null ? getRetire().hashCode() : 0);
        result = 31 * result + (getPersonType() != null ? getPersonType().hashCode() : 0);
        result = 31 * result + (getLeadershipDivision() != null ? getLeadershipDivision().hashCode() : 0);
        result = 31 * result + (getLeadershipLevel() != null ? getLeadershipLevel().hashCode() : 0);
        result = 31 * result + (getPersonStatus() != null ? getPersonStatus().hashCode() : 0);
        result = 31 * result + (getPersonManageCategory() != null ? getPersonManageCategory().hashCode() : 0);
        result = 31 * result + (getDomicilePlace() != null ? getDomicilePlace().hashCode() : 0);
        result = 31 * result + (getGrowthPlace() != null ? getGrowthPlace().hashCode() : 0);
        result = 31 * result + (getDuty() != null ? getDuty().hashCode() : 0);
        result = 31 * result + (getIdentityNumber() != null ? getIdentityNumber().hashCode() : 0);
        result = 31 * result + (getSpecialty() != null ? getSpecialty().hashCode() : 0);
        result = 31 * result + (getHobby() != null ? getHobby().hashCode() : 0);
        result = 31 * result + (getGrassrootsWorkTime() != null ? getGrassrootsWorkTime().hashCode() : 0);
        result = 31 * result + (getGrassrootsWork() != null ? getGrassrootsWork().hashCode() : 0);
        result = 31 * result + (getGrassrootsWorkDepartment() != null ? getGrassrootsWorkDepartment().hashCode() : 0);
        result = 31 * result + (getAge() != null ? getAge().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "CadreInfo{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", birthday=" + birthday +
                ", nativePlace='" + nativePlace + '\'' +
                ", birthPlace='" + birthPlace + '\'' +
                ", nation='" + nation + '\'' +
                ", health='" + health + '\'' +
                ", maritalStatus='" + maritalStatus + '\'' +
                ", workDate=" + workDate +
                ", specialIdentification='" + specialIdentification + '\'' +
                ", leadershipName='" + leadershipName + '\'' +
                ", leadershipId='" + leadershipId + '\'' +
                ", retire=" + retire +
                ", personType=" + personType +
                ", leadershipDivision='" + leadershipDivision + '\'' +
                ", leadershipLevel='" + leadershipLevel + '\'' +
                ", personStatus='" + personStatus + '\'' +
                ", personManageCategory='" + personManageCategory + '\'' +
                ", domicilePlace='" + domicilePlace + '\'' +
                ", growthPlace='" + growthPlace + '\'' +
                ", duty='" + duty + '\'' +
                ", identityNumber='" + identityNumber + '\'' +
                ", specialty='" + specialty + '\'' +
                ", hobby='" + hobby + '\'' +
                ", grassrootsWorkTime=" + grassrootsWorkTime +
                ", grassrootsWork='" + grassrootsWork + '\'' +
                ", grassrootsWorkDepartment='" + grassrootsWorkDepartment + '\'' +
                ", age=" + age +
                '}';
    }
}
