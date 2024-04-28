package ru.gb.example3_sem4.controller;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import ru.gb.example3_sem4.model.Client;
import ru.gb.example3_sem4.repository.ClienttRepository;

@Controller
@AllArgsConstructor
public class ClientController {

    private final ClienttRepository clienttRepository;

    @GetMapping("/clients")
    public String getClient(Model model)
    {
        model.addAttribute("clients",clienttRepository.getClients());
        return "clients";
    }

    @PostMapping("/clients")
    public String addClient(Client p, Model model)
    {
        clienttRepository.addClient(p);
        model.addAttribute("clients",clienttRepository.getClients());
        return "clients";
    }

}
