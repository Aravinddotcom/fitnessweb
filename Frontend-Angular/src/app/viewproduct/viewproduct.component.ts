import { Component, OnInit } from '@angular/core';
import { Product } from '../product';
import { ActivatedRoute, Router } from '@angular/router';
import { ProductserviceService } from '../productservice.service';

@Component({
  selector: 'app-viewproduct',
  templateUrl: './viewproduct.component.html',
  styleUrls: ['./viewproduct.component.css']
})
export class ViewproductComponent implements OnInit {
  product = new Product();

  constructor(private route:Router, private service: ProductserviceService, private activatedRouter: ActivatedRoute) { }

  ngOnInit(): void {
    let id = parseInt(this.activatedRouter.snapshot.paramMap.get('id')!);
    this.service.fetchProductBdyIdFromRemote(id).subscribe(
    data=>{
      console.log("data received");
      this.product = data;
    },
      error => console.log("Exception Occured")
    )
  }
  gotolist() {
    this.route.navigate(['productlist']);
  }

}
