package com.abishek.springrest.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.abishek.springrest.model.Country;

@Service
public class CountryService {

    private List<Country> countries = new ArrayList<>();

    public CountryService() {

        countries.add(new Country("IN", "India"));
        countries.add(new Country("US", "United States"));
        countries.add(new Country("JP", "Japan"));

    }

    public List<Country> getAllCountries() {
        return countries;
    }

    public Country getCountry(String code) {

        for (Country c : countries) {

            if (c.getCode().equalsIgnoreCase(code)) {
                return c;
            }

        }

        return null;
    }

}