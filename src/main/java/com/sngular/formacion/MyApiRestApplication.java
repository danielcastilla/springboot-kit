package com.sngular.formacion;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 
 * Todas las clases que se escanean tienen que estar dentro del paquete de esta clase
 * 
 * com.sngular.formacion
 * 
 * @author daniel
 *
 */


@SpringBootApplication
public class MyApiRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyApiRestApplication.class, args);
	}
}
