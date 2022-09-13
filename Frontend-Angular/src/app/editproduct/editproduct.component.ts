import { Component, OnInit } from '@angular/core';
import { Product } from '../product';
import { ActivatedRoute, Router } from '@angular/router';
import { ProductserviceService } from '../productservice.service';

@Component({
  selector: 'app-editproduct',
  templateUrl: './editproduct.component.html',
  styleUrls: ['./editproduct.component.css']
})
export class EditproductComponent implements OnInit {
  productToUpdate = new Product();
  constructor(private route: Router, private service: ProductserviceService, private _activatedRoute: ActivatedRoute) { }

  ngOnInit(): void {
    let id= parseInt(this._activatedRoute.snapshot.paramMap.get('id')!);
    this.service.fetchProductBdyIdFromRemote(id).subscribe(
      data=> {
        console.log("Data fetched successfully");
        this.productToUpdate = data; // This line allows us to update the view in a smooth way

      },
      error => console.log("Exception on fetching product by id to edit")
    )
  }
  updateProductformsubmit()
  {
    this.service.updateProductToRemote(this.productToUpdate).subscribe
    (
      data =>{
        console.log("Data updated successfully");
        this.route.navigate(['productlist']);
      },
      error =>{
        console.log("");
        this.route.navigate(['productlist']);
      }
    )
  }

  gotolist() {
    this.route.navigate(['productlist']);
  }

}
