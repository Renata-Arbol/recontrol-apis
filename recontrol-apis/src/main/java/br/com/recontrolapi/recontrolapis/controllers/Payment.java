package br.com.recontrolapi.recontrolapis.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Payment {
    //required the name
    @RequestMapping("/")
    @ResponseBody
    public String helloWorld(@RequestParam String name, @RequestParam Integer idade, @RequestParam Double preco, @RequestParam String mercado){
        if (name.equals("renata")){
            System.out.print("Voce nao esta entendendo nada");
            return "Voce nao esta entendendo nada";
        }
        System.out.print("Hello World from Spring Boot to you "+ upperName(name) +" idade aqui "+ msgOfAge(idade) +"");
        return "Hello World from Spring Boot to you "+ (name) +" Idade "+ idade +" Preço" +
                " "+ preco+" Mercado "+ mercado;
    }

    public String upperName(String name){
        return name.toUpperCase();
    }

    public Integer msgOfAge(Integer idade){
        return idade;
    }


}
