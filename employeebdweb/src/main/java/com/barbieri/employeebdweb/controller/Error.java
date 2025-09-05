package com.barbieri.employeebdweb.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Error implements ErrorController {

    @RequestMapping("/error")
    public String handleError(HttpServletRequest request) {
        Integer statusCode = (Integer) request.getAttribute("jakarta.servlet.error.status_code");

        if (statusCode != null) {
            if (statusCode == 404) {
                return "/error/404"; // Thymeleaf carrega templates/error/404.html
            } else if (statusCode == 500) {
                return "/error/500";
            }
        }
        return "/error/default"; // caso queira tratar outros erros
    }
}
