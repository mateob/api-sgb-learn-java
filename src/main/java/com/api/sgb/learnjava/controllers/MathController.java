package com.api.sgb.learnjava.controllers;

import com.api.sgb.learnjava.exeptions.UnsupportedMathOperationException;
import com.api.sgb.learnjava.math.SampleMath;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MathController {

    private SampleMath math = new SampleMath();

    @RequestMapping(
            value = "/sum/{numOne}/{numTow}",
            method = RequestMethod.GET
    )
    public Double sum(@PathVariable("numOne") String numOne, @PathVariable("numTow") String numTow) {
        if(!NumberConverter.isNumeric(numOne) || !NumberConverter.isNumeric(numTow)) {
            throw new UnsupportedMathOperationException("Please set a numeric value!");
        }
        return math.sum(NumberConverter.convertToDouble(numOne), NumberConverter.convertToDouble(numTow));
    }

    @RequestMapping(
            value = "/subtraction/{numOne}/{numTow}",
            method = RequestMethod.GET
    )
    public Double subtraction(@PathVariable("numOne") String numOne, @PathVariable("numTow") String numTow) {
        if(!NumberConverter.isNumeric(numOne) || !NumberConverter.isNumeric(numTow)) {
            throw new UnsupportedMathOperationException("Please set a numeric value!");
        }
        return math.subtraction(NumberConverter.convertToDouble(numOne), NumberConverter.convertToDouble(numTow));
    }

    @RequestMapping(
            value = "/multiplication/{numOne}/{numTow}",
            method = RequestMethod.GET
    )
    public Double multiplication(@PathVariable("numOne") String numOne, @PathVariable("numTow") String numTow) {
        if(!NumberConverter.isNumeric(numOne) || !NumberConverter.isNumeric(numTow)) {
            throw new UnsupportedMathOperationException("Please set a numeric value!");
        }
        return math.multiplication(NumberConverter.convertToDouble(numOne), NumberConverter.convertToDouble(numTow));
    }

    @RequestMapping(
            value = "/division/{numOne}/{numTow}",
            method = RequestMethod.GET
    )
    public Double division(@PathVariable("numOne") String numOne, @PathVariable("numTow") String numTow) {
        if(!NumberConverter.isNumeric(numOne) || !NumberConverter.isNumeric(numTow)) {
            throw new UnsupportedMathOperationException("Please set a numeric value!");
        }
        return math.division(NumberConverter.convertToDouble(numOne), NumberConverter.convertToDouble(numTow));
    }

    @RequestMapping(
            value = "/average/{numOne}/{numTow}",
            method = RequestMethod.GET
    )
    public Double average(@PathVariable("numOne") String numOne, @PathVariable("numTow") String numTow) {
        if(!NumberConverter.isNumeric(numOne) || !NumberConverter.isNumeric(numTow)) {
            throw new UnsupportedMathOperationException("Please set a numeric value!");
        }
        return math.average(NumberConverter.convertToDouble(numOne), NumberConverter.convertToDouble(numTow));
    }

    @RequestMapping(
            value = "/squareRoot/{number}",
            method = RequestMethod.GET
    )
    public Double squareRoot(@PathVariable("number") String number) {
        if(!NumberConverter.isNumeric(number)) {
            throw new UnsupportedMathOperationException("Please set a numeric value!");
        }
        return math.squareRoot(NumberConverter.convertToDouble(number));
    }
}
