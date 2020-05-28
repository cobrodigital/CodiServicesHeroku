/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.banxico.dgspim.codi.heroku.controller;

import javax.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author angel
 */
@RestController
public class accionesController {
    
    @RequestMapping(value = "/registroSubsecuente", method = RequestMethod.POST)
    public ResponseEntity<String> registroSubsecuente(@RequestBody String cadenaEntrada, HttpServletRequest request) {
        return new ResponseEntity<>("SIN_RESULTADO", HttpStatus.OK);
    }
    
}
