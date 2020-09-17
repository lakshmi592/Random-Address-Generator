package com.randomaddressgenerator.randomaddressgenerator.controller;

import com.randomaddressgenerator.randomaddressgenerator.model.Address;
import com.randomaddressgenerator.randomaddressgenerator.service.RandomAddressGenerationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Below class acts as {@link RestController} for all Incoming {@link org.springframework.http.HttpRequest}
 * on accepting request forwards to corresponding service class
 */
@RestController
public class RandomAddressGenerateController {

    private RandomAddressGenerationService randomAddressGenerationService;

    @Autowired
    public RandomAddressGenerateController(RandomAddressGenerationService randomAddressGenerationService) {
        this.randomAddressGenerationService = randomAddressGenerationService;
    }

    @GetMapping("/randomizer/address")
    public Address getRandomAddress() {
        return randomAddressGenerationService.generateRandomAddress();
    }
}
