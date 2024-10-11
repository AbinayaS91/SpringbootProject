package com.example.SpringDemo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@Entity
@Table(name = "cloud_vendor_info")
public class CloudVendor {
    @Id
    private  String vendorId;
    private String vendorName;
    private String vendorPhoneNum;
    private String vendorAddress;

    public String getVendorId() {
        return vendorId;
    }

    public void setVendorId(String vendorId) {
        this.vendorId = vendorId;
    }

    public String getVendorName() {
        return vendorName;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    public String getVendorPhoneNum() {
        return vendorPhoneNum;
    }

    public void setVendorPhoneNum(String vendorPhoneNum) {
        this.vendorPhoneNum = vendorPhoneNum;
    }

    public String getVendorAddress() {
        return vendorAddress;
    }

    public void setVendorAddress(String vendorAddress) {
        this.vendorAddress = vendorAddress;
    }

    public CloudVendor() {
    }

    public CloudVendor(String vendorId, String vendorName, String vendorPhoneNum, String vendorAddress) {
        this.vendorId = vendorId;
        this.vendorName = vendorName;
        this.vendorPhoneNum = vendorPhoneNum;
        this.vendorAddress = vendorAddress;
    }
}
