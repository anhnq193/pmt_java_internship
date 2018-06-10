package com.tokuda.pmt.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "member", schema = "pm_db", catalog = "")
public class MemberEntity {
    private int id;
    private String memberCode;
    private String memberName;
    private byte isVirtualRegister;
    private Timestamp cameDatetime;
    private Timestamp outDatetime;
    private String kanaName;
    private Integer registedShopId;
    private Integer sex;
    private Date birth;
    private int customerType;
    private String zipcode;
    private PrefEntity pref;
    private String ward;
    private String addr1;
    private String addr2;
    private String tel;
    private String urgencyTel;
    private String urgencyName;
    private String urgencyKana;
    private Integer familyType;
    private String bloodType;
    private double footSize;
    private Double climbingYear;
    private Integer knowingType;
    private Integer age;
    private String notes;
    private String contactNote;
    private int status;
    private Timestamp createdDate;
    private Timestamp updatedDate;

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "member_code")
    public String getMemberCode() {
        return memberCode;
    }

    public void setMemberCode(String memberCode) {
        this.memberCode = memberCode;
    }

    @Basic
    @NotNull
    @Column(name = "member_name")
    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    @Basic
    @NotNull
    @Column(name = "is_virtual_register")
    public byte getIsVirtualRegister() {
        return isVirtualRegister;
    }

    public void setIsVirtualRegister(byte isVirtualRegister) {
        this.isVirtualRegister = isVirtualRegister;
    }

    @Basic
    @Column(name = "came_datetime")
    public Timestamp getCameDatetime() {
        return cameDatetime;
    }

    public void setCameDatetime(Timestamp cameDatetime) {
        this.cameDatetime = cameDatetime;
    }

    @Basic
    @Column(name = "out_datetime")
    public Timestamp getOutDatetime() {
        return outDatetime;
    }

    public void setOutDatetime(Timestamp outDatetime) {
        this.outDatetime = outDatetime;
    }

    @Basic
    @Column(name = "kana_name")
    public String getKanaName() {
        return kanaName;
    }

    public void setKanaName(String kanaName) {
        this.kanaName = kanaName;
    }

    @Basic
    @Column(name = "registed_shop_id")
    public Integer getRegistedShopId() {
        return registedShopId;
    }

    public void setRegistedShopId(Integer registedShopId) {
        this.registedShopId = registedShopId;
    }

    @Basic
    @Column(name = "sex")
    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    @Basic
    @Column(name = "birth")
    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    @Basic
    @NotNull
    @Column(name = "customer_type")
    public int getCustomerType() {
        return customerType;
    }

    public void setCustomerType(int customerType) {
        this.customerType = customerType;
    }

    @Basic
    @Column(name = "zipcode")
    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    @ManyToOne
    @NotNull
    @Column(name = "pref_id")
    public PrefEntity getPref() {
        return pref;
    }

    public void setPref(PrefEntity pref) {
        this.pref = pref;
    }

    @Basic
    @Column(name = "ward")
    public String getWard() {
        return ward;
    }

    public void setWard(String ward) {
        this.ward = ward;
    }

    @Basic
    @Column(name = "addr1")
    public String getAddr1() {
        return addr1;
    }

    public void setAddr1(String addr1) {
        this.addr1 = addr1;
    }

    @Basic
    @Column(name = "addr2")
    public String getAddr2() {
        return addr2;
    }

    public void setAddr2(String addr2) {
        this.addr2 = addr2;
    }

    @Basic
    @NotNull
    @Column(name = "tel")
    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    @Basic
    @Column(name = "urgency_tel")
    public String getUrgencyTel() {
        return urgencyTel;
    }

    public void setUrgencyTel(String urgencyTel) {
        this.urgencyTel = urgencyTel;
    }

    @Basic
    @Column(name = "urgency_name")
    public String getUrgencyName() {
        return urgencyName;
    }

    public void setUrgencyName(String urgencyName) {
        this.urgencyName = urgencyName;
    }

    @Basic
    @Column(name = "urgency_kana")
    public String getUrgencyKana() {
        return urgencyKana;
    }

    public void setUrgencyKana(String urgencyKana) {
        this.urgencyKana = urgencyKana;
    }

    @Basic
    @Column(name = "family_type")
    public Integer getFamilyType() {
        return familyType;
    }

    public void setFamilyType(Integer familyType) {
        this.familyType = familyType;
    }

    @Basic
    @NotNull
    @Column(name = "blood_type")
    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    @Basic
    @NotNull
    @Column(name = "foot_size")
    public double getFootSize() {
        return footSize;
    }

    public void setFootSize(double footSize) {
        this.footSize = footSize;
    }

    @Basic
    @Column(name = "climbing_year")
    public Double getClimbingYear() {
        return climbingYear;
    }

    public void setClimbingYear(Double climbingYear) {
        this.climbingYear = climbingYear;
    }

    @Basic
    @Column(name = "knowing_type")
    public Integer getKnowingType() {
        return knowingType;
    }

    public void setKnowingType(Integer knowingType) {
        this.knowingType = knowingType;
    }

    @Basic
    @Column(name = "age")
    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Basic
    @Column(name = "notes")
    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    @Basic
    @Column(name = "contact_note")
    public String getContactNote() {
        return contactNote;
    }

    public void setContactNote(String contactNote) {
        this.contactNote = contactNote;
    }

    @Basic
    @NotNull
    @Column(name = "status")
    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Basic
    @Column(name = "created_date")
    public Timestamp getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Timestamp createdDate) {
        this.createdDate = createdDate;
    }

    @Basic
    @Column(name = "updated_date")
    public Timestamp getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(Timestamp updatedDate) {
        this.updatedDate = updatedDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MemberEntity that = (MemberEntity) o;
        return id == that.id &&
                isVirtualRegister == that.isVirtualRegister &&
                customerType == that.customerType &&
                pref == that.pref &&
                Double.compare(that.footSize, footSize) == 0 &&
                status == that.status &&
                Objects.equals(memberCode, that.memberCode) &&
                Objects.equals(memberName, that.memberName) &&
                Objects.equals(cameDatetime, that.cameDatetime) &&
                Objects.equals(outDatetime, that.outDatetime) &&
                Objects.equals(kanaName, that.kanaName) &&
                Objects.equals(registedShopId, that.registedShopId) &&
                Objects.equals(sex, that.sex) &&
                Objects.equals(birth, that.birth) &&
                Objects.equals(zipcode, that.zipcode) &&
                Objects.equals(ward, that.ward) &&
                Objects.equals(addr1, that.addr1) &&
                Objects.equals(addr2, that.addr2) &&
                Objects.equals(tel, that.tel) &&
                Objects.equals(urgencyTel, that.urgencyTel) &&
                Objects.equals(urgencyName, that.urgencyName) &&
                Objects.equals(urgencyKana, that.urgencyKana) &&
                Objects.equals(familyType, that.familyType) &&
                Objects.equals(bloodType, that.bloodType) &&
                Objects.equals(climbingYear, that.climbingYear) &&
                Objects.equals(knowingType, that.knowingType) &&
                Objects.equals(age, that.age) &&
                Objects.equals(notes, that.notes) &&
                Objects.equals(contactNote, that.contactNote) &&
                Objects.equals(createdDate, that.createdDate) &&
                Objects.equals(updatedDate, that.updatedDate);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, memberCode, memberName, isVirtualRegister, cameDatetime, outDatetime, kanaName, registedShopId, sex, birth, customerType, zipcode, pref, ward, addr1, addr2, tel, urgencyTel, urgencyName, urgencyKana, familyType, bloodType, footSize, climbingYear, knowingType, age, notes, contactNote, status, createdDate, updatedDate);
    }
}
