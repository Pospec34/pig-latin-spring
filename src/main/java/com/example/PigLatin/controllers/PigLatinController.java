package com.example.PigLatin.controllers;

import com.example.PigLatin.models.PigLatinConverter;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@AllArgsConstructor
public class PigLatinController {

    private final PigLatinConverter pigLatinConverter;

    /**
     * Renders the initial view
     */
    @RequestMapping("/")
    public String layout(){
        return "layout";
    }

    @PostMapping("/translate")
    public String translate(String inputText, Model model){
        String pigLatinOutput = pigLatinConverter.convertToPigLatin(inputText);
        model.addAttribute("outputText", pigLatinOutput);
        return "layout";
    }

}