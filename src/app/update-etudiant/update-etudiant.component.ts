import { Component, OnInit } from '@angular/core';
import { Etudiant } from '../etudiant';
import { ActivatedRoute, Router } from '@angular/router';
import { EtudiantService } from '../etudiant.service';

@Component({
  selector: 'app-update-etudiant',
  templateUrl: './update-etudiant.component.html',
  styleUrls: ['./update-etudiant.component.css']
})
export class UpdateEtudiantComponent implements OnInit {

  id: number;
  etudiant: Etudiant;

  constructor(private route: ActivatedRoute,private router: Router,
    private etudiantService: EtudiantService) { }

  ngOnInit() {
    this.etudiant = new Etudiant();

    this.id = this.route.snapshot.params['id'];
    
    this.etudiantService.getEtudiant(this.id)
      .subscribe(data => {
        console.log(data)
        this.etudiant = data;
      }, error => console.log(error));
  }

  updateEtudiant() {
    this.etudiantService.updateEtudiant(this.id, this.etudiant)
      .subscribe(data => console.log(data), error => console.log(error));
    this.etudiant = new Etudiant();
    this.gotoList();
  }

  onSubmit() {
    this.updateEtudiant();    
  }

  gotoList() {
    this.router.navigate(['/etudiants']);
  }
}
