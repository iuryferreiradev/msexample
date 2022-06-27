package br.inf.bios.teste2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Teste2Controller {
 @GetMapping(path="/checarstatus")
 public String checarStatus(){
   return "Microservice Teste2 online";
 }
}
