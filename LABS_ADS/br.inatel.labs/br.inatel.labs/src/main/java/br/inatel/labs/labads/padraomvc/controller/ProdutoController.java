package br.inatel.labs.labads.padraomvc.controller;

import br.inatel.labs.labads.padraomvc.model.entidade.Produto;
import br.inatel.labs.labads.padraomvc.model.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


import java.util.List;

@Controller
public class ProdutoController{

    @Autowired
    private ProdutoService service;

    @GetMapping("/produtos")
    public String getProdutos(Model model){
        List<Produto> produtos = service.findAll();
        model.addAttribute("listaDeProdutos", produtos);
        return "lista-de-produtos";
    }
}
