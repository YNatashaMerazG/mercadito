package com.mercadito.mercadito;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MercaditoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MercaditoApplication.class, args);
        saludo();

	}
    public static String saludo(){
        return "Aplicacion mercadito";
    }


}
