import { Component, EventEmitter, Input, OnInit, Output } from '@angular/core';
import { Invoice } from '../interfaces/Invoice';

@Component({
  selector: 'app-home-in',
  templateUrl: './home-in.component.html',
  styleUrls: ['./home-in.component.css']
})
export class HomeInComponent implements OnInit {
  @Output() triggerRender = new EventEmitter();
  @Input() invoices!: Invoice[];
  @Input() sidebar: any;
  constructor() { }

  ngOnInit(): void {
  }
  numberOfInvoices() {
    if (this.invoices.length === 1) {
      return 'There is only one task';
    } else if (this.invoices.length === 0) {
      return 'No tasks to display';
    }
    return `There are ${this.invoices.length} tasks.`
  }

  emitTriggerRender() {
    this.triggerRender.emit();
  }

}
