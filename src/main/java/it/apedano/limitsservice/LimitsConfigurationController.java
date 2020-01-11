/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.apedano.limitsservice;

import it.apedano.limitsservice.bean.LimitConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Alessandro
 */
@RestController
public class LimitsConfigurationController {
    
    @Autowired
    private Configuration configuration;
    
    @GetMapping("/limits")
    public LimitConfiguration retrieveLimitsFromConfiguration() {
        return new LimitConfiguration(
                configuration.getMaximum(), 
                configuration.getMinimum());
    }
    
}
