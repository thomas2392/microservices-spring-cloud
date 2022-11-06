package com.thomas.hrpayroll.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thomas.hrpayroll.entities.Payment;
import com.thomas.hrpayroll.entities.Worker;
import com.thomas.hrpayroll.feignclients.WorkerFeignClient;

@Service
public class PaymentService {

	@Autowired
	private WorkerFeignClient feignClient;

	public Payment getPayment(long workerId, int days) {
		Worker worker = feignClient.findById(workerId).getBody();
		return new Payment(worker.getName(), worker.getDailyIncome(), days);
	}
}
