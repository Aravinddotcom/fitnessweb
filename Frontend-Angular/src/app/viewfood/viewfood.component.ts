import { Component, OnInit } from '@angular/core';
import { Food } from '../food';
import { ActivatedRoute, Router } from '@angular/router';
import { FoodserviceService } from '../foodservice.service';


@Component({
  selector: 'app-viewfood',
  templateUrl: './viewfood.component.html',
  styleUrls: ['./viewfood.component.css']
})
export class ViewfoodComponent implements OnInit {
  food = new Food();

  constructor(private route:Router, private service: FoodserviceService, private activatedRouter: ActivatedRoute) { }

  ngOnInit(): void {
    let id = parseInt(this.activatedRouter.snapshot.paramMap.get('id')!);
    this.service.fetchFoodBdyIdFromRemote(id).subscribe(
    data=>{
      console.log("data received");
      this.food = data;
    },
      error => console.log("Exception Occured")
    )
  }
  gotolist() {
    this.route.navigate(['foodlist']);
  }


}
