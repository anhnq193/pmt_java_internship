package com.tokuda.pmt.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "zipcode", schema = "pm_db", catalog = "")
public class ZipcodeEntity {
    private int id;
    private String zipcode;
    private PrefEntity pref;
    private String ward;
    private String addr1;
    private String addr2;
    private Byte disableFlag;
    private Timestamp createdDate;
    private Timestamp updatedDate;
    private int status;

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
    @Column(name = "zipcode")
    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    @Basic
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
    @Column(name = "disable_flag")
    public Byte getDisableFlag() {
        return disableFlag;
    }

    public void setDisableFlag(Byte disableFlag) {
        this.disableFlag = disableFlag;
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

    @Basic
    @NotNull
    @Column(name = "status")
    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ZipcodeEntity that = (ZipcodeEntity) o;
        return id == that.id &&
                status == that.status &&
                Objects.equals(zipcode, that.zipcode) &&
                Objects.equals(pref, that.pref) &&
                Objects.equals(ward, that.ward) &&
                Objects.equals(addr1, that.addr1) &&
                Objects.equals(addr2, that.addr2) &&
                Objects.equals(disableFlag, that.disableFlag) &&
                Objects.equals(createdDate, that.createdDate) &&
                Objects.equals(updatedDate, that.updatedDate);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, zipcode, pref, ward, addr1, addr2, disableFlag, createdDate, updatedDate, status);
    }
}
