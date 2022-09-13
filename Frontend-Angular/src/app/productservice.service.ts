import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Product } from './product';

@Injectable({
  providedIn: 'root'
})
export class ProductserviceService {

  constructor(private http:HttpClient) { }
  fetchProductListFromRemote():Observable<any>{
    return this.http.get<any>("http://localhost:8090/getproductlist");
  }
  addProductToRemote(product : Product):Observable<any>{
    return this.http.post("http://localhost:8090/addproduct",product);
  }
  updateProductToRemote(product: Product): Observable<any>{
    return this.http.post<any>('http://localhost:8090/editproduct',product);
  }

  fetchProductBdyIdFromRemote(id: number): Observable<any> {
    return this.http.get<any>('http://localhost:8090/getproductbyid/'+id);
  }
  deleteProductBdyIdFromRemote(id: number): Observable<any> {
    return this.http.delete<any>('http://localhost:8090/product/' + id);
  }
}
