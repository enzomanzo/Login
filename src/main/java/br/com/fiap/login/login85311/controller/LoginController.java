package br.com.fiap.login.login85311.controller;


import br.com.fiap.login.login85311.dto.LoginDto;
import br.com.fiap.login.login85311.model.Login;
import br.com.fiap.login.login85311.repository.LoginRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
@RequestMapping("/login")
public class LoginController {

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private LoginRepository loginRepository;


@GetMapping ("/index")
    public ModelAndView login(){

        return new ModelAndView("login/index");
}


@GetMapping ("/cadastro")
    public ModelAndView criar (LoginDto model){

        return new ModelAndView("login/cadastro");
}

@PostMapping ("/cadastro")
    public ModelAndView salvar (@Valid LoginDto model, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
           ModelAndView mv = new ModelAndView("login/cadastro");
           return mv;
        }
        Login loginEntity = modelMapper.map(model, Login.class);
        loginRepository.save(loginEntity);


        return new ModelAndView("redirect:/login/index");
}

}
