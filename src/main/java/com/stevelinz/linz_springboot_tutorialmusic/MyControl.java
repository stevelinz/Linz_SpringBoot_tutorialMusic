package com.stevelinz.linz_springboot_tutorialmusic;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
class MyControl {


    @RequestMapping("/resident")
    public String showResidentGood() {return "pages/resident";}

    @RequestMapping("/develop")
    public String showDevelop() {return "pages/develop";}

    @RequestMapping("/perform")
    public String showPerform() {return "pages/perform";}

    @RequestMapping("/linz")
    public String goToLinzPage() {return "redirect:http://www.stevelinz.com";}

}

