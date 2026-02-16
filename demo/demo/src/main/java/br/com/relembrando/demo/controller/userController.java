package br.com.relembrando.demo.controller;

import br.com.relembrando.demo.models.Users;
import br.com.relembrando.demo.repository.usersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@CrossOrigin
@RequestMapping("/users")
//A restController e a requestmapping vem da biblioteca springframework e quando o navegador recebe essa requisição http ele mapeia e chama essa requestmapping

public class   userController {

@Autowired
    private usersRepository usersRepository ;//aqui

@GetMapping("/")
    public List<Users>encontrarTodosOsUsuarios(){
    return usersRepository.findAll();
}
@PostMapping(value = "/save",consumes = "application/json",produces = "application/json")
    public Users create(@RequestBody Users database){

    System.out.println("Objeto recebido : "+database);
    System.out.println("Brhitday : "+database.getBrhitday());


    return usersRepository.save(database);
}

}
//Anotações são basicamente metadados , nós usamos anotações para informatizar um código
//essas informações podem ser usadas pelo computador ou pela jvm durante o tempo de execução (run time)
//A ideia é add informação sobre o código sem afetar sua funcionalidade, implementar novos comportamentos sem afetar o código
//Anotação é uma configuração colocada no seu código java , ela foi criada para substituir e diminuir a verbosidade de documentações java facilitando as configurações dentro das próprias classes, outra biblioteca lê sua anotação , lê seu código e ela consegue entender e mapear o que está setado em seu código, ou seja outra biblioteca interpreta essa configuração e entende como voce quer  essa configuração , nesse caso a biblioteca aqui é  a hibernate e as anotações daqui vem da jpa (java persistence api)