package com.example.soap.model;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "HelloRequest", namespace = "http://learnwebservices.com/services/hello")
public class HelloRequest {
    private String name;

    @XmlElement(name = "Name")
    public String getName() { return name; }

    public void setName(String name) { this.name = name; }
}
