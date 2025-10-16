package com.example.soap.model;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "HelloRequest", namespace = "http://learnwebservices.com/services/hello")
@XmlAccessorType(XmlAccessType.FIELD)
public class HelloRequest {

    @XmlElement(name = "Name", namespace = "http://learnwebservices.com/services/hello", required = true)
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
