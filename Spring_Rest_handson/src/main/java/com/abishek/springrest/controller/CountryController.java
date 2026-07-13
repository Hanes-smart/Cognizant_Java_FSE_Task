package com.abishek.springrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.abishek.springrest.model.Country;
import com.abishek.springrest.service.CountryService;

@RestController
public class CountryController {

    @Autowired
    private CountryService service;

    @Autowired
    private ApplicationContext context;

    // Load Country Bean from XML
    @GetMapping("/country")
    public Country loadCountry() {
        return context.getBean("country", Country.class);
    }

    // Get All Countries
    @GetMapping("/countries")
    public List<Country> getCountries() {
        return service.getAllCountries();
    }

    // Get Country by Code
    @GetMapping("/countries/{code}")
    public Country getCountry(@PathVariable String code) {
        return service.getCountry(code);
    }

}