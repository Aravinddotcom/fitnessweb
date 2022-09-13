package com.fitnessweb.rbcdemo.service;

import com.fitnessweb.rbcdemo.model.Todo;
import com.fitnessweb.rbcdemo.repo.TodoRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class TodoService {
    private final TodoRepo invoiceRepo;

    @Autowired
    public TodoService(TodoRepo invoiceRepo) {
        this.invoiceRepo = invoiceRepo;
    }

    public List<Todo> findAllInvoices(){
        return invoiceRepo.findAll();
    }


    public Todo addInvoice(Todo invoice){
        return invoiceRepo.save(invoice);
    }


     public void deleteInvoice(Long id){
        try{
            invoiceRepo.deleteById(id);
        }
        catch (Exception e){
            throw e;
        }

     }

    public Todo updateInvoice(Todo invoice) {
        return invoiceRepo.save(invoice);
    }
}
