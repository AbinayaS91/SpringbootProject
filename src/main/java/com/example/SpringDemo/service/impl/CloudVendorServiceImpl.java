package com.example.SpringDemo.service.impl;

import com.example.SpringDemo.model.CloudVendor;
import com.example.SpringDemo.repository.CloudVendorRepository;
import com.example.SpringDemo.service.CloudVendorService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CloudVendorServiceImpl implements CloudVendorService {


    CloudVendorRepository cloudVendorRepository;
    public CloudVendorServiceImpl(CloudVendorRepository cloudVendorRepository) {
        this.cloudVendorRepository = cloudVendorRepository;
    }
    @Override
    public String createCloudVendor(CloudVendor cloudVendor) {
        cloudVendorRepository.save(cloudVendor);
        return "Saved Successfully";
    }

    @Override
    public String updateCloudVendor(CloudVendor cloudVendor) {
        cloudVendorRepository.save(cloudVendor);
        return "Updated Successfully";
    }

    @Override
    public Optional<CloudVendor> getCloudVendorDetails(String vendorId) {


            return cloudVendorRepository.findById(vendorId);



    }

    @Override
    public List<CloudVendor> getAllCloudVendorDetails() {

        return cloudVendorRepository.findAll();
    }
}
