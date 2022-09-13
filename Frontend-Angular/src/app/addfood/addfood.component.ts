import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { FoodserviceService } from '../foodservice.service';
import { Food } from '../food';

@Component({
  selector: 'app-addfood',
  templateUrl: './addfood.component.html',
  styleUrls: ['./addfood.component.css']
})
export class AddfoodComponent implements OnInit {

  food = new Food();
  constructor(private router: Router,private service: FoodserviceService) { }


  ngOnInit(): void {
  }
  addFoodformsubmit()
  {
  this.service.addFoodToRemote(this.food).subscribe
  (
    data =>{
      console.log("Data added successfully");
      this.router.navigate(['foodlist']);
    },
    error =>console.log("Error")
  )
  }
  
  
    gotolist() {
      this.router.navigate(['foodlist']);
    }

}
