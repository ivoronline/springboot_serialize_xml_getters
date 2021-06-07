package com.ivoronline.springboot_serialize_xml_getters.dto;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class PersonDTO {

  //PROPERTIES
  private String  name;
  private Integer age;

  //SETTERS (Used by us to set Properties)
  public void setName(String  name) { this.name = name; }
  public void setAge (Integer age ) { this.age  = age;  }

  //GETTERS (Used by JAXB for Marshaling)
  public String  getName() { return "Getter " + name; }
  public Integer getAge () { return age;  }

}
