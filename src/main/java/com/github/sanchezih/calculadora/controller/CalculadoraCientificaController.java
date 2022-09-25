package com.github.sanchezih.calculadora.controller;

import java.math.BigInteger;
import javax.websocket.server.PathParam;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cientifica")
public class CalculadoraCientificaController {

  @RequestMapping(value = "/cuadrado", method = RequestMethod.GET)
  public double cuadrado(@PathParam("numero") Double numero) {
    return Math.pow(numero, 2);
  }

  @RequestMapping(value = "/factorial", method = RequestMethod.GET)
  public BigInteger factorial(@PathParam("numero") Integer numero) {
    BigInteger result = BigInteger.ONE;
    for (int i = 2; i <= numero; i++) {
      result = result.multiply(BigInteger.valueOf(i));
    }
    return result;
  }

  @RequestMapping(value = "/primo", method = RequestMethod.GET)
  public boolean esPrimo(@PathParam("numero") Integer numero) {
    for (int i = 2; i <= numero / 2; i++) {
      if (numero % i == 0) {
        return false;
      }
    }
    return true;
  }

}
