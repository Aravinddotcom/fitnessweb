import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { HomeComponent } from './components/home/home.component';
import { LoginComponent } from './components/login/login.component';
import { MenuComponent } from './components/menu/menu.component';
import { DashboardComponent } from './components/dashboard/dashboard.component';
import {MatToolbarModule} from '@angular/material/toolbar';
import {MatButtonModule} from '@angular/material/button';
import {MatFormFieldModule} from '@angular/material/form-field'
import { MatInputModule} from '@angular/material/input';
import { FormsModule } from '@angular/forms';
import { NgModel } from '@angular/forms';
import {HttpClientModule, HTTP_INTERCEPTORS} from "@angular/common/http";
import { AuthGuard } from './services/auth.guard';
import { LoginService } from './services/login.service';
import { ContactUsComponent } from './components/contact-us/contact-us.component';
import { FooterComponent } from './components/footer/footer.component';
import { ErrorComponent } from './components/error/error.component';
import { ViewassetComponent } from './components/viewasset/viewasset.component';
import { SellassetComponent } from './components/sellasset/sellasset.component';
import {MatCardModule} from '@angular/material/card';
import {MatExpansionModule} from '@angular/material/expansion';
import {MatIconModule} from '@angular/material/icon';
import {MatTableModule} from '@angular/material/table';
import { VieweachstockComponent } from './components/vieweachstock/vieweachstock.component';
import { VieweachmutualComponent } from './components/vieweachmutual/vieweachmutual.component';
import { AllassetpriceComponent } from './components/allassetprice/allassetprice.component';
import { RegistrationComponent } from './registration/registration.component';
import { ProductlistComponent } from './productlist/productlist.component';
import { ViewproductComponent } from './viewproduct/viewproduct.component'; 
import { AddproductComponent } from './addproduct/addproduct.component'; 
import { EditproductComponent } from './editproduct/editproduct.component';
import { AddfoodComponent } from './addfood/addfood.component';
import { EditfoodComponent } from './editfood/editfood.component';
import { FoodlistComponent } from './foodlist/foodlist.component';
import { ViewfoodComponent } from './viewfood/viewfood.component';
import { CalculateproteinComponent } from './calculateprotein/calculateprotein.component'; 
import {NgbModule} from '@ng-bootstrap/ng-bootstrap';
import { AddInvoiceComponent } from './add-invoice/add-invoice.component';
import { DialogComponent } from './dialog/dialog.component';
import { HomeInComponent } from './home-in/home-in.component';
import { InvoiceComponent } from './invoice/invoice.component';
import { InvoiceTotalComponent } from './invoice-total/invoice-total.component';
import { TodoComponent } from './todo/todo.component';
import { InvoiceService } from './services/invoice.service';
import { MatSidenavModule } from '@angular/material/sidenav';
import { MatDialogModule } from '@angular/material/dialog';
import {MatRippleModule} from '@angular/material/core';
import {MatDatepickerModule} from '@angular/material/datepicker';
import { MaterialModule } from './material/material.module';
import {MatSelectModule} from '@angular/material/select';

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    LoginComponent,
    MenuComponent,
    DashboardComponent,
    ContactUsComponent,
    FooterComponent,
    ErrorComponent,
    ViewassetComponent,
    SellassetComponent,
    VieweachstockComponent,
    VieweachmutualComponent,
    AllassetpriceComponent,
    RegistrationComponent,
    ProductlistComponent,
    ViewproductComponent,
    AddproductComponent,
    EditproductComponent,
    AddfoodComponent,
    EditfoodComponent,
    FoodlistComponent,
    ViewfoodComponent,
    CalculateproteinComponent,
    AddInvoiceComponent,
    DialogComponent,
    HomeInComponent,
    InvoiceComponent,
    InvoiceTotalComponent,
    TodoComponent,
    
 
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    MatToolbarModule,
    MatButtonModule,
    MatFormFieldModule,
    MatInputModule,
    FormsModule,
    HttpClientModule,
    MatCardModule,
    MatExpansionModule,
    MatIconModule,
    MatTableModule,
    NgbModule,
    MatSidenavModule,
    MatDialogModule,
    MatRippleModule,
    MatDatepickerModule,
    MaterialModule,
    MatSelectModule
   ],
  providers: [AuthGuard,LoginService,InvoiceService],
  bootstrap: [AppComponent]
})
export class AppModule { }
