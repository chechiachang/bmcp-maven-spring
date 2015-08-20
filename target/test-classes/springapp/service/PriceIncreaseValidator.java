/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package springapp.service;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

/**
 *
 * @author davidchang
 */
public class PriceIncreaseValidator implements Validator{

    private int DEFAULT_MIN_PERCENTAGE =0;
    private int DEFAULT_MAX_PERCENTAGE = 50;
    private int minPercentage = DEFAULT_MIN_PERCENTAGE;
    private int maxPercentage = DEFAULT_MAX_PERCENTAGE;
    
    protected final Log logger = LogFactory.getLog(getClass());
    
    @Override
    public boolean supports(Class<?> clazz) {
        return PriceIncrease.class.equals(clazz);
    }

    @Override
    public void validate(Object obj, Errors errors) {
        PriceIncrease pi = (PriceIncrease) obj;
        if(pi==null){
            errors.rejectValue("percentage", "error.not-specified", null, "Value required.");
        }else{
            logger.info("Validating with " + pi + ": " + pi.getPercentage());
            if(pi.getPercentage() > maxPercentage){
                errors.rejectValue("percentage", "error.too-high", new Object[]{maxPercentage}, "Value too high.");
            }
            if(pi.getPercentage()<=minPercentage){
                errors.rejectValue("percentage", "error.too-low", new Object[]{minPercentage}, "Value too low.");
            }
        }
    }

    public int getDEFAULT_MIN_PERCENTAGE() {
        return DEFAULT_MIN_PERCENTAGE;
    }

    public void setDEFAULT_MIN_PERCENTAGE(int DEFAULT_MIN_PERCENTAGE) {
        this.DEFAULT_MIN_PERCENTAGE = DEFAULT_MIN_PERCENTAGE;
    }

    public int getDEFAULT_MAX_PERCENTAGE() {
        return DEFAULT_MAX_PERCENTAGE;
    }

    public void setDEFAULT_MAX_PERCENTAGE(int DEFAULT_MAX_PERCENTAGE) {
        this.DEFAULT_MAX_PERCENTAGE = DEFAULT_MAX_PERCENTAGE;
    }

    public int getMinPercentage() {
        return minPercentage;
    }

    public void setMinPercentage(int minPercentage) {
        this.minPercentage = minPercentage;
    }

    public int getMaxPercentage() {
        return maxPercentage;
    }

    public void setMaxPercentage(int maxPercentage) {
        this.maxPercentage = maxPercentage;
    }
    
}
