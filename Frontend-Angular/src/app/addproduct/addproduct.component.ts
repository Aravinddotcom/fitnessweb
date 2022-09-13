import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { ProductserviceService } from '../productservice.service';
import { Product } from '../product';


@Component({
  selector: 'app-addproduct',
  templateUrl: './addproduct.component.html',
  styleUrls: ['./addproduct.component.css']
})
export class AddproductComponent implements OnInit {

  product = new Product();
  constructor(private router: Router,private service: ProductserviceService) { }

  ngOnInit(): void {
  }
  addProductformsubmit()
  {
  this.service.addProductToRemote(this.product).subscribe
  (
    data =>{
      console.log("Data added successfully");
      this.router.navigate(['productlist']);
    },
    error =>console.log("Error")
  )
  }
  
  
    gotolist() {
      this.router.navigate(['productlist']);
    }

}
