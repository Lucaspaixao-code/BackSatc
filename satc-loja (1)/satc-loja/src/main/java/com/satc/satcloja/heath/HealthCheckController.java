package com.satc.satcloja.heath;

import com.fasterxml.jackson.databind.util.JSONPObject;
import com.satc.satcloja.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.satc.satcloja.repository.*;

import java.time.LocalDate;

@RestController
public class HealthCheckController {

    @Autowired
    public ProdutoRepository produtoRepository;
    @Autowired
    public ServicoRepository servicoRepository;
    @Autowired
    public ClienteRepository clienteRepository;
    @Autowired
    public VendaRepository vendaRepository;

    @GetMapping("/health2")
    public String healthCheck() {
        Produto prod = new Produto();
        prod.setNome("teste nome foda");
        prod.setDescricao("imagine uma descrição incrivel");
        prod.setValorUnitario(1000.0);
        prod.setDataPrazo(LocalDate.now());
        prod.setDataValidade(LocalDate.now());
        prod.setPrecoCompra(850.0);
        prod.setStatus(Status.DISPONIVEL);
        prod.setEstocavel(Boolean.TRUE);

        produtoRepository.save(prod);

        Servico serv = new Servico("teste", 15.00, 1500.0);
        serv.setEstocavel(Boolean.TRUE);

        servicoRepository.save(serv);

        Cliente cli = new Cliente();

        cli.setCpf("123112312312");
        cli.setRg("78945612");
        cli.setNome("nome foda");
        cli.setEmail("emailincrivel@gmail.com");
        cli.setEndereco("aquela rua");
        cli.setTelefone("999999999");

        clienteRepository.save(cli);

        Venda venda = new Venda();
        venda.setCliente(cli);
        venda.setDataVenda(LocalDate.now());
        venda.setObservacao("desc incrivel");
        venda.setFormaPagamento(FormaPagamento.A_VISTA);

        ItemVenda itemVenda = new ItemVenda(prod, 1000.00, 1.0,10.00);
        ItemVenda itemVenda2 = new ItemVenda(serv, 120.00, 1.0,10.00);

        venda.addItemVenda(itemVenda);
        venda.addItemVenda(itemVenda2);

        vendaRepository.save(venda);

        return "Comando Executado";
    }
}
