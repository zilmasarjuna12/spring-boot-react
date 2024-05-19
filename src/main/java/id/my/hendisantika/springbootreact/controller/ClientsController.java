package id.my.hendisantika.springbootreact.controller;

import id.my.hendisantika.springbootreact.entity.Client;
import id.my.hendisantika.springbootreact.repository.ClientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-react
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 5/19/24
 * Time: 08:56
 * To change this template use File | Settings | File Templates.
 */
@RestController
@RequestMapping("/clients")
@RequiredArgsConstructor
public class ClientsController {

    private final ClientRepository clientRepository;

    @GetMapping
    public List<Client> getClients() {
        return clientRepository.findAll();
    }
}
