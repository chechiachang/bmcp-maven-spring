/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tutorialspoint.springtutorial.innercollection;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import org.springframework.beans.factory.annotation.Required;

/**
 *
 * @author davidchang
 */
public class JavaCollection {

    List addressList;
    Set addressSet;
    Map addressMap;
    Properties addressProperties;

    public List getAddressList() {
        System.out.println("List Elements : " + addressList);
        return addressList;
    }

    @Required
    public void setAddressList(List addressList) {
        this.addressList = addressList;
    }

    public Set getAddressSet() {
        System.out.println("Set Elements : " + addressSet);
        return addressSet;
    }

    @Required
    public void setAddressSet(Set addressSet) {
        this.addressSet = addressSet;
    }

    public Map getAddressMap() {
        System.out.println("Map Elements : " + addressMap);
        return addressMap;
    }

    @Required
    public void setAddressMap(Map addressMap) {
        this.addressMap = addressMap;
    }

    public Properties getAddressProperties() {
        System.out.println("Properties Elements : " + addressProperties);
        return addressProperties;
    }

    @Required
    public void setAddressProperties(Properties addressProperties) {
        this.addressProperties = addressProperties;
    }

}
