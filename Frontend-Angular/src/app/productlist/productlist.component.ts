import { Component, OnInit } from '@angular/core';
import { ProductserviceService } from 'src/app/productservice.service';
import { Router } from '@angular/router';
import { Product } from 'src/app/product';




@Component({
  selector: 'app-productlist',
  templateUrl: './productlist.component.html',
  styleUrls: ['./productlist.component.css']
})
export class ProductlistComponent implements OnInit {

  products: Array<Product> = [];

  constructor(private route: Router, private service: ProductserviceService){ }


  ngOnInit(): void {
    this.getProducts();
    this.getTotal();
  }
  getTotal(){
    var total = 0;
    for(var i = 0; i < this.products.length; i++){
        var product = this.products[i];
        total += (product.protein);
    }
    return total;
  }
  getProducts() {
    this.service.fetchProductListFromRemote().subscribe(
      data => this.products = data, error => console.log("Exception occurred 1"),
    )
  }
  isEmpty()
  {
    if (this.products == null)
    {
      return true;
    }
    else { return false; }
  }

  goToAddProduct() {
    this.route.navigate(['/addproduct']);
  }

  goToUpdateProduct(id: number) {
    console.log("id: "+ id);
    this.route.navigate(['/editproduct', id]);
  }


  goToViewProduct(id: number){
    this.route.navigate(['/viewproduct', id]);

  }

  deleteProduct(id: number) {
    if (confirm('Are you sure ?'))
  return this.service.deleteProductBdyIdFromRemote(id).subscribe(
    success =>{
      ("Product deleted succesfully");
    },
    error=> {console.log("occured 2"); this.getProducts()}
   )
  }
  


}
