import { Component, OnInit } from '@angular/core';
import { Food } from '../food';
import { ActivatedRoute, Router } from '@angular/router';
import { FoodserviceService } from '../foodservice.service';

@Component({
  selector: 'app-editfood',
  templateUrl: './editfood.component.html',
  styleUrls: ['./editfood.component.css']
})
export class EditfoodComponent implements OnInit {
  foodToUpdate = new Food();

  constructor(private route: Router, private service: FoodserviceService, private _activatedRoute: ActivatedRoute) { }

  ngOnInit(): void {
    let id= parseInt(this._activatedRoute.snapshot.paramMap.get('id')!);
    this.service.fetchFoodBdyIdFromRemote(id).subscribe(
      data=> {
        console.log("Data fetched successfully");
        this.foodToUpdate = data; // This line allows us to update the view in a smooth way

      },
      error => console.log("Exception on fetching food by id to edit")
    )
  }

  updateFoodformsubmit()
  {
    this.service.updateFoodToRemote(this.foodToUpdate).subscribe
    (
      data =>{
        console.log("Data updated successfully");
        this.route.navigate(['foodlist']);
      },
      error =>{
        console.log("");
        this.route.navigate(['foodlist']);
      }
    )
  }

  gotolist() {
    this.route.navigate(['foodlist']);
  }


}
