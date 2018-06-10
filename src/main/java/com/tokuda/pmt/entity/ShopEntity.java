package com.tokuda.pmt.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "shop", schema = "pm_db", catalog = "")
public class ShopEntity {
    private int id;
    private String shopCode;
    private String shopName;
    private String color;
    private String tel;
    private String zipcode;
    private PrefEntity pref;
    private String ward;
    private String addr1;
    private String addr2;
    private int registerPrice;
    private int secondRegisterPrice;
    private int otherShopEntryFee;
    private String username;
    private String password;
    private Timestamp lastLoginTime;
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
    @Column(name = "shop_code")
    public String getShopCode() {
        return shopCode;
    }

    public void setShopCode(String shopCode) {
        this.shopCode = shopCode;
    }

    @Basic
    @Column(name = "shop_name")
    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    @Basic
    @Column(name = "color")
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
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
    @NotNull
    @Column(name = "register_price")
    public int getRegisterPrice() {
        return registerPrice;
    }

    public void setRegisterPrice(int registerPrice) {
        this.registerPrice = registerPrice;
    }

    @Basic
    @NotNull
    @Column(name = "second_register_price")
    public int getSecondRegisterPrice() {
        return secondRegisterPrice;
    }

    public void setSecondRegisterPrice(int secondRegisterPrice) {
        this.secondRegisterPrice = secondRegisterPrice;
    }

    @Basic
    @NotNull
    @Column(name = "other_shop_entry_fee")
    public int getOtherShopEntryFee() {
        return otherShopEntryFee;
    }

    public void setOtherShopEntryFee(int otherShopEntryFee) {
        this.otherShopEntryFee = otherShopEntryFee;
    }

    @Basic
    @Column(name = "username")
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Basic
    @Column(name = "password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "last_login_time")
    public Timestamp getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Timestamp lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
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
        ShopEntity that = (ShopEntity) o;
        return id == that.id &&
                registerPrice == that.registerPrice &&
                secondRegisterPrice == that.secondRegisterPrice &&
                otherShopEntryFee == that.otherShopEntryFee &&
                status == that.status &&
                Objects.equals(shopCode, that.shopCode) &&
                Objects.equals(shopName, that.shopName) &&
                Objects.equals(color, that.color) &&
                Objects.equals(tel, that.tel) &&
                Objects.equals(zipcode, that.zipcode) &&
                Objects.equals(pref, that.pref) &&
                Objects.equals(ward, that.ward) &&
                Objects.equals(addr1, that.addr1) &&
                Objects.equals(addr2, that.addr2) &&
                Objects.equals(username, that.username) &&
                Objects.equals(password, that.password) &&
                Objects.equals(lastLoginTime, that.lastLoginTime) &&
                Objects.equals(createdDate, that.createdDate) &&
                Objects.equals(updatedDate, that.updatedDate);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, shopCode, shopName, color, tel, zipcode, pref, ward, addr1, addr2, registerPrice, secondRegisterPrice, otherShopEntryFee, username, password, lastLoginTime, createdDate, updatedDate, status);
    }
}
