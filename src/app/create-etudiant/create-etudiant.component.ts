import { EtudiantService } from '../etudiant.service';
import { Etudiant } from '../etudiant';
import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-create-etudiant',
  templateUrl: './create-etudiant.component.html',
  styleUrls: ['./create-etudiant.component.css']
})

export class CreateEtudiantComponent implements OnInit {

  etudiant: Etudiant = new Etudiant();
  submitted = false;

  constructor(private etudiantService: EtudiantService,
    private router: Router) { }

  ngOnInit() {
  }

  newEtudiant(): void {
    this.submitted = false;
    this.etudiant = new Etudiant();
  }

  save() {
    this.etudiantService.createEtudiant(this.etudiant)
      .subscribe(data => console.log(data), error => console.log(error));
    this.etudiant = new Etudiant();
    this.gotoList();
  }

  onSubmit() {
    this.submitted = true;
    this.save();    
  }

  gotoList() {
    this.router.navigate(['/etudiants']);
  }
}
