package com.tokuda.pmt.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "maker", schema = "pm_db", catalog = "")
public class MakerEntity {
    private int id;
    private ShopEntity shop;
    private String makerName;
    private String makerCode;
    private String tel;
    private String zipcode;
    private PrefEntity pref;
    private String ward;
    private String addr1;
    private String addr2;
    private Timestamp createdDate;
    private Timestamp updatedDate;
    private int status;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @ManyToOne
    @Column(name = "shop_id")
    public ShopEntity getShop() {
        return shop;
    }

    public void setShop(ShopEntity shop) {
        this.shop = shop;
    }

    @Basic
    @NotNull
    @Column(name = "maker_name")
    public String getMakerName() {
        return makerName;
    }

    public void setMakerName(String makerName) {
        this.makerName = makerName;
    }

    @Basic
    @NotNull
    @Column(name = "maker_code")
    public String getMakerCode() {
        return makerCode;
    }

    public void setMakerCode(String makerCode) {
        this.makerCode = makerCode;
    }

    @Basic
    @Column(name = "tel")
    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
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
        MakerEntity that = (MakerEntity) o;
        return id == that.id &&
                status == that.status &&
                Objects.equals(shop, that.shop) &&
                Objects.equals(makerName, that.makerName) &&
                Objects.equals(makerCode, that.makerCode) &&
                Objects.equals(tel, that.tel) &&
                Objects.equals(zipcode, that.zipcode) &&
                Objects.equals(pref, that.pref) &&
                Objects.equals(ward, that.ward) &&
                Objects.equals(addr1, that.addr1) &&
                Objects.equals(addr2, that.addr2) &&
                Objects.equals(createdDate, that.createdDate) &&
                Objects.equals(updatedDate, that.updatedDate);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, shop, makerName, makerCode, tel, zipcode, pref, ward, addr1, addr2, createdDate, updatedDate, status);
    }
}
