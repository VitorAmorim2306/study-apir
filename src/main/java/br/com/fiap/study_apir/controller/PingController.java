package br.com.fiap.study_apir.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("campeao")
public class PingController {

    @GetMapping ("/palmeiras")
    public String palmeiras() {
        return "Parabéns!";
    }

    @GetMapping ("palmeiras2")
    public String palmeiras2() {
        return "Parabéns de novo!";
    }
}
