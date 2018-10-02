package com.algaworks.gestaofesta.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.algaworks.gestaofesta.dao.ConvidadoDAO;
import com.algaworks.gestaofesta.model.Convidado;

@Controller
@RequestMapping("/convidados")
public class ConvidadosController {
	
	@Autowired
	private ConvidadoDAO convidadoDAO;

	@GetMapping
	public ModelAndView listar() {
		ModelAndView modelAndView = new ModelAndView("ListaConvidados");

		modelAndView.addObject("convidados", convidadoDAO.findAll());
		modelAndView.addObject(new Convidado());

		return modelAndView;
	}

	@PostMapping
	public String salvar(Convidado convidado) {
		convidadoDAO.save(convidado);

		return "redirect:/convidados";
	}

	/* GET & SET */
	public ConvidadoDAO getConvidadoDAO() {
		return convidadoDAO;
	}
	public void setConvidadoDAO(ConvidadoDAO convidadoDAO) {
		this.convidadoDAO = convidadoDAO;
	}
	
}
