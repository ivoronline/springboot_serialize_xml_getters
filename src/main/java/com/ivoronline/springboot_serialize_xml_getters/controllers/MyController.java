package com.ivoronline.springboot_serialize_xml_getters.controllers;

import com.ivoronline.springboot_serialize_xml_getters.dto.PersonDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {

  @ResponseBody
  @RequestMapping("/GetPerson")
  public PersonDTO getPerson() {

    //CREATE INSTANCE
    PersonDTO personDTO      = new PersonDTO();
              personDTO.setName("John");
              personDTO.setAge(20);

    //RETURN INSTANCE AS JSON
    return personDTO;

  }

}
