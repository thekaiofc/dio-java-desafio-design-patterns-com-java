package dio.lab_padroes_projeto_spring.service;

import dio.lab_padroes_projeto_spring.model.Endereco;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@FeignCliente(name = "viacep", url = "https://viacep.com.br/ws")
public interface ViaCepService {
    @RequestMapping(method = RequestMethod.GET, value = "/{cep}/json?")
    Endereco consultarCep(PathVariable("cep")String cep);
}
