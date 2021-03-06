package com.kendoui.spring.controllers.polarcharts;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller("dataviz-polar_charts-polar_scatter-controller")
@RequestMapping(value="/polar-charts/")
public class PolarScatterController {
    @RequestMapping(value = "/polar-scatter", method = RequestMethod.GET)
    public String index() {
        return "/polar-charts/polar-scatter";
    }
}
