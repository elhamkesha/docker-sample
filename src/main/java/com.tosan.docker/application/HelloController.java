package com.tosan.docker.application;

import org.apache.commons.text.CaseUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Keshavarz
 * @since 8/7/2022
 */
@RequestMapping("/")
@RestController
public class HelloController {
    @GetMapping(value = "/helloworld",
            produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<String> helloworld(String name) {
        if (!StringUtils.hasText(name)) {
            name = "Stranger";
        }
        else
        {
            name= CaseUtils.toCamelCase(name,true,' ');
        }
        return new ResponseEntity<>("Hello " + name, HttpStatus.OK);
    }
    @GetMapping(value = "/author",
            produces = MediaType.APPLICATION_JSON_VALUE)
    public  ResponseEntity<String> getName()
    {
        return new ResponseEntity<>("Ali Ahmadi", HttpStatus.OK);
    }
}
