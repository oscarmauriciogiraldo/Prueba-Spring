package co.edu.utp.isc.gia.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
//@RequestMapping("hello")
@RequestMapping(value = "hello")
public class HelloApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloApplication.class, args);
	}
        
        //Primera parte del taller - reto
        /*@GetMapping("/{firstName}/{lastName}")
        public String sayHello(
                @PathVariable("firstName") String firstName,
                @PathVariable("lastName") String lastName) {
            return String.format("<h1> Hello  %S %S </h1>", firstName, lastName);
        }*/
        
        //segunda parte del Taller dia1 - reto
        @GetMapping("/{nombre}/{apellido}")
        public String hello(@PathVariable("nombre") String nombre, @PathVariable("apellido") String apellido){
            return "Hello" + nombre + " " + apellido;
        }
        
        
        
        @GetMapping()
        public String helloMundo(@RequestParam("nombre") String nombre, @RequestParam("apellido") String apellido){
            return "Hello" + nombre + " " + apellido;
        }
        //nota
        /*en el segundo @GetMapping("/{nombre}/{apellido}") al momento de compilar me muestra un error */

} 
