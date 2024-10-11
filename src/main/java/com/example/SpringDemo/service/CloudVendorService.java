package com.example.SpringDemo.service;

import com.example.SpringDemo.model.CloudVendor;

import java.util.List;
import java.util.Optional;

public interface CloudVendorService {
    public String createCloudVendor(CloudVendor cloudVendor);
    public String updateCloudVendor(CloudVendor cloudVendor);
    public Optional<CloudVendor> getCloudVendorDetails(String vendorId);
    public List<CloudVendor> getAllCloudVendorDetails();
}
