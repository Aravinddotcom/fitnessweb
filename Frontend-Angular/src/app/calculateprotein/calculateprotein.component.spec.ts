import { ComponentFixture, TestBed } from '@angular/core/testing';


import { CalculateproteinComponent } from './calculateprotein.component';

describe('CalculateproteinComponent', () => {
  let component: CalculateproteinComponent;
  let fixture: ComponentFixture<CalculateproteinComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CalculateproteinComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(CalculateproteinComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
