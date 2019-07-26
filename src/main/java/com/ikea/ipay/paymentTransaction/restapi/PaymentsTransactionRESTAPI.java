package com.ikea.ipay.paymentTransaction.restapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ikea.ipay.paymentTransaction.entity.Card;
import com.ikea.ipay.paymentTransaction.entity.CheckBalanceResult;
import com.ikea.ipay.paymentTransaction.service.PaymentTransactionService;

@RestController
@RequestMapping("PaymentTransaction")
public class PaymentsTransactionRESTAPI {
	
	@Autowired PaymentTransactionService paymentTransactionservice;
	
	@GetMapping(path= "/CheckBalance/Card/{cardno}", produces = "application/json")
	public ResponseEntity<CheckBalanceResult> CheckBalance(@PathVariable(value="cardno") String cardno) {
		CheckBalanceResult card = paymentTransactionservice.getCardBalance(cardno);
		return new ResponseEntity<CheckBalanceResult>(card, HttpStatus.OK);
	}

}
