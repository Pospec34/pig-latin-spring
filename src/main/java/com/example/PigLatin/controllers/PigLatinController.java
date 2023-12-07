package com.example.PigLatin.controllers;

import com.example.PigLatin.models.PigLatinConverter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PigLatinController {

    /**
     * Renders the initial view
     */
    @RequestMapping("/")
    public String layout(){
        return "layout";
    }

    @PostMapping("/translate")
    public String translate(String inputText, Model model){
        PigLatinConverter converter = new PigLatinConverter();
        String pigLatinOutput = converter.convertToPigLatin(inputText);

        model.addAttribute("outputText", pigLatinOutput);
        return "layout";
    }

}