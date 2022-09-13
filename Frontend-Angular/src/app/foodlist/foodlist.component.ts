import { Component, OnInit } from '@angular/core';
import { FoodserviceService } from '../foodservice.service';
import { Router } from '@angular/router';
import { Food } from '../food';

@Component({
  selector: 'app-foodlist',
  templateUrl: './foodlist.component.html',
  styleUrls: ['./foodlist.component.css']
})
export class FoodlistComponent implements OnInit {

  foods: Array<Food> = [];
  constructor(private route: Router, private service: FoodserviceService) { }

  ngOnInit(): void {
    this.getFoods();
  }
  getTotal(){
    var total = 0;
    for(var i = 0; i < this.foods.length; i++){
        var product = this.foods[i];
        total += (product.protein);
    }
    return total;
  }
  getFoods() {
    this.service.fetchFoodListFromRemote().subscribe(
      data => this.foods = data, error => console.log("Exception occurred 1"),
    )
  }
  isEmpty()
  {
    if (this.foods == null)
    {
      return true;
    }
    else { return false; }
  }

  goToAddFood() {
    this.route.navigate(['/addfood']);
  }

  goToUpdateFood(id: number) {
    console.log("id: "+ id);
    this.route.navigate(['/editfood', id]);
  }


  goToViewFood(id: number){
    this.route.navigate(['/viewfood', id]);

  }

  deleteFood(id: number) {
    if (confirm('Are you sure ?'))
  return this.service.deleteFoodBdyIdFromRemote(id).subscribe(
    success =>{
      ("Food deleted succesfully");
    },
    error=> {console.log("occured 2"); this.getFoods()}
   )
  }

}
