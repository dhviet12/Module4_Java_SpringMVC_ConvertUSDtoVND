package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import service.ConvertUSDtoVND;

@Controller
@RequestMapping("/convert")
public class ConvertController {
    private ConvertUSDtoVND convertUSDtoVND = new ConvertUSDtoVND();

    @GetMapping("")

    public ModelAndView ShowConvert() {
        ModelAndView modelAndView = new ModelAndView("convert");
        return  modelAndView;
    }
    @PostMapping("")
    public ModelAndView convert(@RequestParam double amount){
        ModelAndView modelAndView = new ModelAndView("convert");
        double result = convertUSDtoVND.convert(amount);
        modelAndView.addObject("result",result);
        return modelAndView;
    }

}
