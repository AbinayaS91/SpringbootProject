package com.example.SpringDemo.controller;

import com.example.SpringDemo.model.CloudVendor;
import com.example.SpringDemo.service.CloudVendorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/cloudVendor")
public class CloudVendorAPIController {


    CloudVendorService cloudVendorService;
    public CloudVendorAPIController(CloudVendorService cloudVendorService) {
        this.cloudVendorService = cloudVendorService;
    }
    @GetMapping("{vendorId}")
    public Optional<CloudVendor> getCloudVendorDetails(@PathVariable String vendorId){

        return cloudVendorService.getCloudVendorDetails(vendorId);

    }

    @GetMapping()
    public List<CloudVendor> getAllCloudVendor(){

        return cloudVendorService.getAllCloudVendorDetails();

    }

    @PostMapping
    public String createCloudVendor(@RequestBody CloudVendor cloudVendor){
        return cloudVendorService.createCloudVendor(cloudVendor);

    }

    @PutMapping
    public String updateCloudVendor(@RequestBody CloudVendor cloudVendor){
        return cloudVendorService.updateCloudVendor(cloudVendor);
    }
}
