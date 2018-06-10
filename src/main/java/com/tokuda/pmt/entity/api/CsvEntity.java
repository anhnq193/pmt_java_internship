package com.tokuda.pmt.entity.api;

public class CsvEntity {
//      0.Mã sản phẩm , 1.thể loại, 2.nhà sản xuất, 3.tên mặt hàng,
//      4.màu sắc, 5.kích cỡ, 6.nhận xét, 7.giá mua,
//      8.giá loại trừ thuế, 9.giá bao gồm thuế, 10.giá thành viên, 11.hàng tồn kho
    private String productCode;
    private int type;
    private int makerId;
    private String productName;
    private int colorId;
    private int sizeId;
    private String note;
    private int stockPrice;
    private int notaxPrice;
    private int taxPrice;
    private int memberPrice;
    private int availableNumber;

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getMakerId() {
        return makerId;
    }

    public void setMakerId(int makerId) {
        this.makerId = makerId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getColorId() {
        return colorId;
    }

    public void setColorId(int colorId) {
        this.colorId = colorId;
    }

    public int getSizeId() {
        return sizeId;
    }

    public void setSizeId(int sizeId) {
        this.sizeId = sizeId;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public int getStockPrice() {
        return stockPrice;
    }

    public void setStockPrice(int stockPrice) {
        this.stockPrice = stockPrice;
    }

    public int getNotaxPrice() {
        return notaxPrice;
    }

    public void setNotaxPrice(int notaxPrice) {
        this.notaxPrice = notaxPrice;
    }

    public int getTaxPrice() {
        return taxPrice;
    }

    public void setTaxPrice(int taxPrice) {
        this.taxPrice = taxPrice;
    }

    public int getMemberPrice() {
        return memberPrice;
    }

    public void setMemberPrice(int memberPrice) {
        this.memberPrice = memberPrice;
    }

    public int getAvailableNumber() {
        return availableNumber;
    }

    public void setAvailableNumber(int availableNumber) {
        this.availableNumber = availableNumber;
    }
}
