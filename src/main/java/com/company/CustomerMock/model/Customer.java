package com.company.CustomerMS.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "id",
        "customerFirstName",
        "customerLastName",
        "homeAddressLine1",
        "homeAddressLine2",
        "homeAddressLine3",
        "homePostCode"
})
@XmlRootElement(name = "Customer")
public class Customer {
    @XmlElement
    private String id;
    @XmlElement
    private String customerFirstName;
    @XmlElement
    private String customerLastName;
    @XmlElement
    private String homeAddressLine1;
    @XmlElement
    private String homeAddressLine2;
    @XmlElement
    private String homeAddressLine3;
    @XmlElement
    private String homePostCode;
}
