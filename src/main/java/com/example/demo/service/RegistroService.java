package com.example.demo.service;

import java.io.BufferedReader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegistroService {

    private final EntidadeRegistroFactory classFactory;

    public RegistroService(@Autowired EntidadeRegistroFactory classFactory) {
        this.classFactory = classFactory;
    }

    public List<?> listaRegistros() {
        List<Object> registros = new ArrayList<>();

        BufferedReader conteudoArquivo = new BufferedReader(new StringReader(
                "|0000|015|0|01082017|31082017|POSTO CARCARA LTDA|07659546000106||PI|194579760|2204204|12||B|1|\n"
                        + "|0005|SCHULZ S.A|89219600|RUA DONA FRANCISCA|6901||DISTRITO INDUSTRIAL|4734516120||SCHULZ@SCHULZ.COM.BR|\n"
                        + "|0150|3483|SCHULZ S.A.|1058|84693183000168||250338815|4209102||RUA DONA FRANCISCA|6901||DISTRITO INDUSTRIAL|\n"
                        + "|C113|1|0|3483|55|003||643332|07102019|42191084693183000168550030006433321986642250|\n"
                        + "|E200|PI|01032021|31032021|\n" + "\n"));

        conteudoArquivo.lines().filter(linha -> !linha.isBlank()).forEach(linha -> {
            String[] campos = linha.split("\\|");
            Object obj = classFactory.criaInstanciaDeRegistro("Registro" + campos[1], linha);
            registros.add(obj);
        });

        return registros;
    }

}
