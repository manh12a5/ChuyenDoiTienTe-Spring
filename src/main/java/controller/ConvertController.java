package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import service.ConvertService;

@Controller
@RequestMapping("/convert")
public class ConvertController {

    ConvertService convert = new ConvertService();

    @GetMapping("/vnd/{VND}")
    public ModelAndView convertVND(@PathVariable Double VND) {
        ModelAndView modelAndView = new ModelAndView("view");
        modelAndView.addObject("convertVND", convert.convertToUSA(VND));
        return modelAndView;
    }

    @GetMapping("usa/{USA}")
    public ModelAndView convertUSA(@PathVariable Double USA) {
        ModelAndView modelAndView = new ModelAndView("view");
        modelAndView.addObject("convertUSA", convert.convertToVND(USA));
        return modelAndView;
    }
}
