import { Component, OnInit } from '@angular/core';
import { AllMutualFund } from 'src/app/model/availablemutualfund';
import { AllStock } from 'src/app/model/availablestock';
import { LoginService } from 'src/app/services/login.service';
import { MutualfundserviceService } from 'src/app/services/mutualfundservice.service';
import { StockserviceService } from 'src/app/services/stockservice.service';

@Component({
  selector: 'app-allassetprice',
  templateUrl: './allassetprice.component.html',
  styleUrls: ['./allassetprice.component.css']
})
export class AllassetpriceComponent implements OnInit {
  token: string | null = ""
  allMutualFund:AllMutualFund[]=[]
  allStock:AllStock[]=[]
  constructor(private loginService:LoginService,private mfservice:MutualfundserviceService,private sdService:StockserviceService) { }

  ngOnInit(): void {
    this.getAllMutualFundDetails();
    this.getAllStockDetail();
  }
  getTotal(){
    var total = 0;
    for(var i = 0; i < this.allStock.length; i++){
        var product = this.allStock[i];
        total += (product.proteinValue);
    }
    return total;
  }
  getTotalKcal(){
    var total = 0;
    for(var i = 0; i < this.allMutualFund.length; i++){
        var product = this.allMutualFund[i];
        total += (product.caloriesValue);
    }
    return total;
  }

  getAllMutualFundDetails()
  {
    this.token=  this.loginService.getToken();
    if(this.token!=null)
    {
      this.mfservice.getAllMutualFund().subscribe((data:AllMutualFund[])=>
      {
        console.log(data);
       this.allMutualFund=data
      },
      (error:any)=>
      {
        console.log(error);

      });

    }
  }

  getAllStockDetail()
  {
    this.token=  this.loginService.getToken();
    if(this.token!=null)
    {
      this.sdService.getAllStockDetails().subscribe((data:AllStock[])=>
      {
        console.log(data);
       this.allStock=data
      },
      (error:any)=>
      {
        console.log(error);

      });

    }

  }

}
