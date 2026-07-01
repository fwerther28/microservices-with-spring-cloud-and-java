package com.github.fwerther28.rest_with_spring_boot_and_java.controllers;

import com.github.fwerther28.rest_with_spring_boot_and_java.exception.UnsuppoortedMathOperationException;
import com.github.fwerther28.rest_with_spring_boot_and_java.math.SimpleMath;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.github.fwerther28.rest_with_spring_boot_and_java.converters.NumberConverter.convertToDouble;
import static com.github.fwerther28.rest_with_spring_boot_and_java.converters.NumberConverter.isNumeric;

@RestController
@RequestMapping("/math")
public class MathController {

	@Autowired
	private SimpleMath math;
	
	// http://localhost:8080/math/sum/3/5
	@GetMapping(value = "/sum/{numberOne}/{numberTwo}")
	public Double sum(
			@PathVariable("numberOne") String numberOne,
			@PathVariable("numberTwo") String numberTwo
	) throws Exception {
		if(!isNumeric(numberOne) || !isNumeric(numberTwo))
			throw new UnsuppoortedMathOperationException("Please set a numeric value!");
		return math.sum(convertToDouble(numberOne), convertToDouble(numberTwo));
	}

	@GetMapping(value = "/subtraction/{numberOne}/{numberTwo}")
	public Double subtraction(
			@PathVariable(value = "numberOne") String numberOne,
			@PathVariable(value = "numberTwo") String numberTwo
	) throws Exception {
		if (!isNumeric(numberOne) || !isNumeric(numberTwo))
			throw new UnsuppoortedMathOperationException("Please set a numeric value!");
		return math.subtraction(convertToDouble(numberOne), convertToDouble(numberTwo));
	}

	@GetMapping(value = "/multiplication/{numberOne}/{numberTwo}")
	public Double multiplication(
			@PathVariable(value = "numberOne") String numberOne,
			@PathVariable(value = "numberTwo") String numberTwo
	) throws Exception {
		if (!isNumeric(numberOne) || !isNumeric(numberTwo)) {
			throw new UnsuppoortedMathOperationException("Please set a numeric value!");
		}
		return math.multiplication(convertToDouble(numberOne), convertToDouble(numberTwo));
	}

	@GetMapping(value = "/division/{numberOne}/{numberTwo}")
	public Double division(
			@PathVariable(value = "numberOne") String numberOne,
			@PathVariable(value = "numberTwo") String numberTwo
	) throws Exception {
		if (!isNumeric(numberOne) || !isNumeric(numberTwo)) {
			throw new UnsuppoortedMathOperationException("Please set a numeric value!");
		}

		if (convertToDouble(numberTwo) == 0D) {
			throw new UnsuppoortedMathOperationException("Division by zero is not allowed!");
		}
		return math.division(convertToDouble(numberOne), convertToDouble(numberTwo));
	}

	@GetMapping(value = "/mean/{numberOne}/{numberTwo}")
	public Double mean(
			@PathVariable(value = "numberOne") String numberOne,
			@PathVariable(value = "numberTwo") String numberTwo
	) throws Exception {
		if (!isNumeric(numberOne) || !isNumeric(numberTwo)) {
			throw new UnsuppoortedMathOperationException("Please set a numeric value!");
		}
		return math.mean(convertToDouble(numberOne), convertToDouble(numberTwo));
	}

	@GetMapping(value = "/squareRoot/{number}")
	public Double squareRoot(
			@PathVariable(value = "number") String number
	) throws Exception {
		if (!isNumeric(number)) {
			throw new UnsuppoortedMathOperationException("Please set a numeric value!");
		}

		double numberConverted = convertToDouble(number);

		if (numberConverted < 0) {
			throw new UnsuppoortedMathOperationException("Square root of a negative number is not allowed");
		}

		return math.squareRoot(numberConverted) ;
	}

	// http://localhost:8080/math/subtraction/3/5
	// http://localhost:8080/math/division/3/5
	
}
