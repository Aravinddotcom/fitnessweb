import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ContactUsComponent } from './components/contact-us/contact-us.component';
import { DashboardComponent } from './components/dashboard/dashboard.component';
import { HomeComponent } from './components/home/home.component';
import { LoginComponent } from './components/login/login.component';
import { ErrorComponent } from './components/error/error.component';
import { SellassetComponent } from './components/sellasset/sellasset.component';
import { AuthGuard } from './services/auth.guard';
import { ViewassetComponent } from './components/viewasset/viewasset.component';
import { AllassetpriceComponent } from './components/allassetprice/allassetprice.component';
import { RegistrationComponent } from './registration/registration.component';
import { ViewproductComponent } from './viewproduct/viewproduct.component';
import { ProductlistComponent } from './productlist/productlist.component';
import { EditproductComponent } from './editproduct/editproduct.component';
import { AddproductComponent } from './addproduct/addproduct.component';
import { FoodlistComponent } from './foodlist/foodlist.component';
import { AddfoodComponent } from './addfood/addfood.component';
import { EditfoodComponent } from './editfood/editfood.component';
import { ViewfoodComponent } from './viewfood/viewfood.component';
import { CalculateproteinComponent } from './calculateprotein/calculateprotein.component';
import { TodoComponent } from './todo/todo.component';
import { AddInvoiceComponent } from './add-invoice/add-invoice.component';

const routes: Routes = [
  {
    path:'',
    component:HomeComponent,
    pathMatch:'full'
  },
  {
    path:"login",
    component:LoginComponent,
    pathMatch:"full"
  },
  {
    path:"dashboard",
    component:DashboardComponent,
    pathMatch:"full",
    canActivate:[AuthGuard]
  },
  {
    path:"contact",
    component:ContactUsComponent,
    pathMatch:"full",
  
  },
  {
    path:"viewasset",
    component:ViewassetComponent,
    pathMatch:"full",
    canActivate:[AuthGuard]
  
  },
  {
    path:"sellasset",
    component:SellassetComponent,
    pathMatch:"full",
    canActivate:[AuthGuard]
  
  },
  {
    path:"dietproduct",
    // path:"currentPrice",
    component:AllassetpriceComponent,
    pathMatch:"full",
    canActivate:[AuthGuard]
  
  },
  {
    path:'registration',
    component:RegistrationComponent
    
  },
  { path:'productlist',
    component:ProductlistComponent,
    canActivate:[AuthGuard]
  },
  {
    path: 'addproduct', 
    component: AddproductComponent,
    canActivate:[AuthGuard]
  },
  {
    path: 'editproduct/:id', 
    component: EditproductComponent,
    canActivate:[AuthGuard]
  },
  {
    path: 'editproduct', 
    component: EditproductComponent,
    canActivate:[AuthGuard]
  },
  {
    path: 'viewproduct', 
    component: ViewproductComponent,
    canActivate:[AuthGuard]
  },
  {
    path: 'viewproduct/:id', 
    component: ViewproductComponent,
    canActivate:[AuthGuard]
  },
  {
    path: 'productlist', 
    component: ProductlistComponent,
    pathMatch:"full",
    canActivate:[AuthGuard]
  },
  { path:'foodlist',
    component:FoodlistComponent,
    canActivate:[AuthGuard]
  },
  {
    path: 'addfood', 
    component: AddfoodComponent,
    canActivate:[AuthGuard]
  },
  {
    path: 'editfood/:id', 
    component: EditfoodComponent,
    canActivate:[AuthGuard]
  },
  {
    path: 'editfood', 
    component: EditfoodComponent,
    canActivate:[AuthGuard]
  },
  {
    path: 'viewfood', 
    component: ViewfoodComponent,
    canActivate:[AuthGuard]
  },
  {
    path: 'viewfood/:id', 
    component: ViewfoodComponent,
    canActivate:[AuthGuard]
  },
  {
    path: 'foodlist', 
    component: FoodlistComponent,
    pathMatch:"full",
    canActivate:[AuthGuard]
  },
  {
    path: 'calculate', 
    component: CalculateproteinComponent,
    canActivate:[AuthGuard]
  },
  {
    path:'todo',
    component:TodoComponent,
    canActivate:[AuthGuard]
  },
  { path: 'add', component: AddInvoiceComponent },
  { 
    path: '**', 
    component: ErrorComponent 
  }

];

@NgModule({
  imports: [RouterModule.forRoot(routes,{
    scrollPositionRestoration: 'enabled'
  })],
  exports: [RouterModule]
})
export class AppRoutingModule { }
