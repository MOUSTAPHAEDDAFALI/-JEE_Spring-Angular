import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { UpdateEtudiantComponent } from './update-etudiant.component';

describe('UpdateEtudiantComponent', () => {
  let component: UpdateEtudiantComponent;
  let fixture: ComponentFixture<UpdateEtudiantComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ UpdateEtudiantComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(UpdateEtudiantComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
