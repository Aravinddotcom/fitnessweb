package com.fitnessweb.rbcdemo;

import com.fitnessweb.rbcdemo.model.Todo;
import com.fitnessweb.rbcdemo.service.TodoService;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/invoices")
public class TodoController {
	private final TodoService invoiceService;

	public TodoController(TodoService invoiceService) {
		this.invoiceService = invoiceService;
	}

	@GetMapping("/all")
	public ResponseEntity<List<Todo>> getAllInvoices() {
		List<Todo> invoices = invoiceService.findAllInvoices();
		return new ResponseEntity<>(invoices, HttpStatus.OK);
	}

	@PostMapping("/add")
	public ResponseEntity<Todo> addInvoice(@RequestBody Todo invoice) {
		Todo newInvoice = invoiceService.addInvoice(invoice);
		return new ResponseEntity<>(newInvoice, HttpStatus.CREATED);
	}

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<?> deleteInvoice(@PathVariable("id") Long id) {
		invoiceService.deleteInvoice(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}

	@PutMapping("/update")
	public ResponseEntity<Todo> updateInvoice(@RequestBody Todo invoice) {
		Todo updateInvoice = invoiceService.updateInvoice(invoice);
		return new ResponseEntity<>(updateInvoice, HttpStatus.OK);
	}

}
