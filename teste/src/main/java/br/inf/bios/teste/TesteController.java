package br.inf.bios.teste;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TesteController {
 @GetMapping(path="/checarstatus")
 public String checarStatus(){
   return "Microservice Teste online";
 }
 @PostMapping(path="/user")
 public TestePessoa user(@RequestBody TestePessoa pessoa){
   //return "Dados pessoa - ID: "+pessoa.getId()+", Nome: "+pessoa.getNome()+", Sobrenome: "+pessoa.getSobrenome();
   return pessoa;
 }
}
