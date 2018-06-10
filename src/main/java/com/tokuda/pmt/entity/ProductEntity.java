package com.tokuda.pmt.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "product", schema = "pm_db", catalog = "")
public class ProductEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    private int id;
    private ShopEntity shop;
    private byte isEnable;
    private String productName;
    private String productCode;
    private int memberPrice;
    private Integer stockPrice;
    private Integer notaxPrice;
    private Integer taxPrice;
    private MstSizeEntity size;
    private MstColorEntity color;
    private MakerEntity maker;
    private SupplierEntity supplier;
    private String notes;
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

    @ManyToOne
    @JoinColumn(name = "shop_id")
    public ShopEntity getShop() {
        return shop;
    }

    public void setShop(ShopEntity shop) {
        this.shop = shop;
    }

    @Basic
    @NotNull
    @Column(name = "is_enable")
    public byte getIsEnable() {
        return isEnable;
    }

    public void setIsEnable(byte isEnable) {
        this.isEnable = isEnable;
    }

    @Basic
    @Column(name = "product_name")
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    @Basic
    @Column(name = "product_code")
    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    @Basic
    @NotNull
    @Column(name = "member_price")
    public int getMemberPrice() {
        return memberPrice;
    }

    public void setMemberPrice(int memberPrice) {
        this.memberPrice = memberPrice;
    }

    @Basic
    @Column(name = "stock_price")
    public Integer getStockPrice() {
        return stockPrice;
    }

    public void setStockPrice(Integer stockPrice) {
        this.stockPrice = stockPrice;
    }

    @Basic
    @Column(name = "notax_price")
    public Integer getNotaxPrice() {
        return notaxPrice;
    }

    public void setNotaxPrice(Integer notaxPrice) {
        this.notaxPrice = notaxPrice;
    }

    @Basic
    @Column(name = "tax_price")
    public Integer getTaxPrice() {
        return taxPrice;
    }

    public void setTaxPrice(Integer taxPrice) {
        this.taxPrice = taxPrice;
    }

    @ManyToOne
    @JoinColumn(name = "size_id")
    public MstSizeEntity getSize() {
        return size;
    }

    public void setSize(MstSizeEntity size) {
        this.size = size;
    }

    @ManyToOne
    @JoinColumn(name = "color_id")
    public MstColorEntity getColor() {
        return color;
    }

    public void setColor(MstColorEntity color) {
        this.color = color;
    }

    @ManyToOne
    @NotNull
    @JoinColumn(name = "maker_id")

    public MakerEntity getMaker() {
        return maker;
    }

    @ManyToOne
    @NotNull
    @JoinColumn(name = "supplier_id")
    public SupplierEntity getSupplier() {
        return supplier;
    }

    public void setSupplier(SupplierEntity supplier) {
        this.supplier = supplier;
    }

    public void setMaker(MakerEntity maker) {
        this.maker = maker;
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
        ProductEntity that = (ProductEntity) o;
        return id == that.id &&
                Objects.equals(shop, that.shop) &&
                isEnable == that.isEnable &&
                memberPrice == that.memberPrice &&
                status == that.status &&
                Objects.equals(productName, that.productName) &&
                Objects.equals(productCode, that.productCode) &&
                Objects.equals(stockPrice, that.stockPrice) &&
                Objects.equals(notaxPrice, that.notaxPrice) &&
                Objects.equals(taxPrice, that.taxPrice) &&
                Objects.equals(maker, that.maker) &&
                Objects.equals(supplier, that.supplier) &&
                Objects.equals(size, that.size) &&
                Objects.equals(color, that.color) &&
                Objects.equals(notes, that.notes) &&
                Objects.equals(createdDate, that.createdDate) &&
                Objects.equals(updatedDate, that.updatedDate);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, shop, isEnable, productName, productCode, memberPrice, stockPrice, notaxPrice, taxPrice, size, color, maker, supplier, notes, createdDate, updatedDate, status);
    }
}
