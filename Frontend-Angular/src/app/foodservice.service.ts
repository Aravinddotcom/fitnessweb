import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Food } from './food';

@Injectable({
  providedIn: 'root'
})
export class FoodserviceService {

  constructor(private http:HttpClient) { }

  fetchFoodListFromRemote():Observable<any>{
    return this.http.get<any>("http://localhost:8091/getproductlist");
  }
  addFoodToRemote(food : Food):Observable<any>{
    return this.http.post("http://localhost:8091/addproduct",food);
  }
  updateFoodToRemote(food: Food): Observable<any>{
    return this.http.post<any>('http://localhost:8091/editproduct',food);
  }

  fetchFoodBdyIdFromRemote(id: number): Observable<any> {
    return this.http.get<any>('http://localhost:8091/getproductbyid/'+id);
  }
  deleteFoodBdyIdFromRemote(id: number): Observable<any> {
    return this.http.delete<any>('http://localhost:8091/product/' + id);
  }

}
