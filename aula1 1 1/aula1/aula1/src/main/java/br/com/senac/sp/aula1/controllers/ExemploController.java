package br.com.senac.sp.aula1.controllers;

import br.com.senac.sp.aula1.domainmodel.Dados;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


import java.time.LocalDateTime;

@Controller
@RequestMapping("/exemplo")
public class ExemploController {

//    @GetMapping("/mensagem2")
//    public ModelAndView saudar2(Model modelo){
//        return new ModelAndView("mensagem-view");
//    }

    @GetMapping("/exemplo-request-param")
    public ModelAndView exemploRequestParam (
            @RequestParam(value = "param1str", required = true, defaultValue =
                    "valor") String param1,
            @RequestParam(value = "param2int", required = false, defaultValue = "99")
            int param2) {
        ModelAndView resposta = new ModelAndView("mensagem-view");
        return resposta;
    }

    @GetMapping("/exemplo-view-obj")
    public ModelAndView exemploViewObj() {
        ModelAndView mv = new ModelAndView("obj-view");
        mv.addObject("texto", "Texto gerado no Controller v2");
        mv.addObject("numero", 100);
        mv.addObject("dataHora"
                , LocalDateTime.now());
        return mv;
    }

    @GetMapping("/profile")
    public ModelAndView profileView() {
        ModelAndView mv = new ModelAndView("profile");
        mv.addObject("nome", "Fernando Tsuda");
        mv.addObject("email", "fernando.tsuda@sp.senac.br");
        mv.addObject("telefone", "98231-4497");
        mv.addObject("nascimento", "01/01/1982");
        mv.addObject("linkedin", "https://br.linkedin.com/in/ftsuda");
        mv.addObject("github", "https://github.com/ftsuda-senac");


        return mv;
    }

    @GetMapping("/salvar")
    public ModelAndView formulario(Dados dados){
        ModelAndView mv = new ModelAndView("formulario");
        mv.addObject("dados", "dados");
        return mv;
    }


    @PostMapping("/salvar")
    public ModelAndView salvar(
            @ModelAttribute("dados") @Valid Dados dadosRecebidos, // Garante que o objeto 'dado' seja preenchido com os dados do formulário
            BindingResult bindingResult, RedirectAttributes redirAttr) {

        // Verifica se houve erros durante validação
        if (bindingResult.hasErrors()) {
            // Reapresenta formulário em caso de erro
            return new ModelAndView("formulario");
        }

        // Gera resposta indicando redirecionamento para /profile
        ModelAndView mv = new ModelAndView("redirect:/profile");
        // Configura os dadosRecebidos como um atributo flash
        redirAttr.addFlashAttribute("dados", dadosRecebidos);
        return mv;


    }


}
