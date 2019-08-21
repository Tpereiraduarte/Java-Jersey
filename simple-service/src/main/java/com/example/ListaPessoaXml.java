package com.example;

import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;

@Path("listaxml")
public class ListaPessoaXml {

	@GET	
	@Produces(MediaType.APPLICATION_XML)
	public List<Pessoa> getPessoaXml() {

		List<Pessoa> usuarios = new ArrayList<>();
		
		usuarios.add(new Pessoa("Thiago","Pereira",30));
		usuarios.add(new Pessoa("João","Fulano",20));
		usuarios.add(new Pessoa("Thais","Baltazar",33));
		usuarios.add(new Pessoa("Maria","Duarte",35));
		usuarios.add(new Pessoa("Marcio","Roberto",37));
		usuarios.add(new Pessoa("Ana","maria",40));
		usuarios.add(new Pessoa("Gullar","Peixoto",20));
		usuarios.add(new Pessoa("Jennifer","Parreira",40));
		return usuarios;
	}

}
