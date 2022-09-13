import { Component, OnInit } from '@angular/core';
import { User } from '../user';
import { RegistrationService } from '../registration.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-registration',
  templateUrl: './registration.component.html',
  styleUrls: ['./registration.component.css']
})
export class RegistrationComponent implements OnInit {
  user = new User();
  msg='';

  constructor(private service: RegistrationService, private router: Router) { }

  ngOnInit(): void {
  }
  registerUser(){
    this.service.registerUserFromRemote(this.user).subscribe(
      data =>{
        console.log("response received");
        this.router.navigate(['/login'])
        this.msg="Registration successful";
      },
      error => {
        console.log("Exception occured");
        this.msg = error.error;
      }
    )
  }
}

