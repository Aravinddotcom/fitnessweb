import { Component, Input, OnChanges, SimpleChanges } from '@angular/core';
import { Invoice } from '../interfaces/Invoice';

@Component({
  selector: 'app-invoice-total',
  templateUrl: './invoice-total.component.html',
  styleUrls: ['./invoice-total.component.css']
})
export class InvoiceTotalComponent implements OnChanges {
  @Input() invoices!: Invoice[];
  paidSum!: number;
  pendingSum!: number;
  totalSum!: number;

  constructor() { }

  ngOnChanges(changes : SimpleChanges): void {
    this.calculateSums();
  }
  calculateSums() {
    this.paidSum = 0;
    this.pendingSum = 0;
    this.totalSum = 0;

    this.invoices.forEach((invoice) => {
      this.totalSum = this.totalSum + invoice.total;
      if (invoice.isPaid) {
        this.paidSum = this.paidSum + invoice.total;
      } else {
        this.pendingSum = this.pendingSum + invoice.total;
      }
    });
  }

}
