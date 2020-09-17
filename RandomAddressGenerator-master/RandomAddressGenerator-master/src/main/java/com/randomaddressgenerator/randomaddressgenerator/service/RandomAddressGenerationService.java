package com.randomaddressgenerator.randomaddressgenerator.service;

import com.randomaddressgenerator.randomaddressgenerator.model.Address;
import com.randomaddressgenerator.randomaddressgenerator.util.RandomGeneratorUtil;
import org.springframework.stereotype.Component;

import static com.randomaddressgenerator.randomaddressgenerator.util.RandomGeneratorUtil.*;

/**
 * Below class contains logic to generate random address logic
 */
@Component
public class RandomAddressGenerationService {
    
    public Address generateRandomAddress() {
        Address address = new Address();
        address.setHouse(getHouse());
        address.setStreet(getStreet());
        address.setPostalCode(getPostalCode());
        address.setCity(getCity());
        address.setCountry(getCounty());
        address.setState(getState());
        address.setStateCode(getStateCode());
        String[] codes = getCountry().split("|");
        address.setCountry(codes[0]);
        address.setCountryCode(codes[1]);
        return address;
    }

    private String getHouse() {
        return getRandomNumber();
    }

    private String getStreet() {
        return getRandomStreet();
    }

    private String getPostalCode() {
        return RandomGeneratorUtil.getPostalCode();
    }

    private String getCity() {
        return getRandomAlphaNumericStringOfGivenLength(10);
    }

    private String getCounty() {
        return getRandomString();
    }

    private String getState() {
        return RandomGeneratorUtil.getState();
    }

    private String getStateCode() {
        return getRandomString();
    }

    private String getCountry() {
        return RandomGeneratorUtil.getCountry();
    }

}
