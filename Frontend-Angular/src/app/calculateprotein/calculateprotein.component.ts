import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import {NgbModal, ModalDismissReasons} from '@ng-bootstrap/ng-bootstrap';

@Component({
  selector: 'app-calculateprotein',
  templateUrl: './calculateprotein.component.html',
  styleUrls: ['./calculateprotein.component.css']
})
export class CalculateproteinComponent implements OnInit {
     closeResult = '';

  constructor(private modalService: NgbModal,private router: Router) { }


  ngOnInit(): void {
  }
  
  protein = { "weight": 0,  "a":2.2, "b":0.8};
  
  calculate() : any {
       return Math.round(this.protein.weight * this.protein.a * this.protein.b);
  }

  protein1 = { "weight": 0,  "a":2.2, "b":1};
  calculate1() : any {
       return  Math.round(this.protein1.weight * this.protein1.a * this.protein1.b);
  }

  protein2 = { "weight": 0,  "a":2.2, };
  calculate2() : any {
       return  Math.round(this.protein2.weight * this.protein2.a);
  }

  protein3 = { "weight": 0,  "a":2.2, "b":12};
  
  calculate3() : any {
       return Math.round(this.protein3.weight * this.protein3.a * this.protein3.b);
  }

  open(content: any) {
     this.modalService.open(content, {ariaLabelledBy: 'modal-basic-title'}).result.then((result) => {
       this.closeResult = `Closed with: ${result}`;
     }, (reason) => {
       this.closeResult = `Dismissed ${this.getDismissReason(reason)}`;
     });
   }
 
   private getDismissReason(reason: any): string {
     if (reason === ModalDismissReasons.ESC) {
       return 'by pressing ESC';
     } else if (reason === ModalDismissReasons.BACKDROP_CLICK) {
       return 'by clicking on a backdrop';
     } else {
       return `with: ${reason}`;
     }
   }
   gotorefresh(){
    window.location.reload();
  }
}

