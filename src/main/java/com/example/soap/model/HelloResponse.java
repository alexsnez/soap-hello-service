package com.example.soap.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "HelloResponse", namespace = "http://learnwebservices.com/services/hello")
public class HelloResponse {
    private String message;

    @XmlElement(name = "Message")
    public String getMessage() { return message; }

    public void setMessage(String message) { this.message = message; }
}
