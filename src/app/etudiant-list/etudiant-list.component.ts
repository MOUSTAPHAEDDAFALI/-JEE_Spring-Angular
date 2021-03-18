import { EtudiantDetailsComponent } from './../etudiant-details/etudiant-details.component';
import { Observable } from "rxjs";
import { EtudiantService } from "../etudiant.service";
import { Etudiant } from "../etudiant";
import { Component, OnInit } from "@angular/core";
import { Router } from '@angular/router';

@Component({
  selector: "app-etudiant-list",
  templateUrl: "./etudiant-list.component.html",
  styleUrls: ["./etudiant-list.component.css"]
})
export class EtudiantListComponent implements OnInit {
  etudiants: Observable<Etudiant[]>;

  constructor(private etudiantService: EtudiantService,
    private router: Router) {}

  ngOnInit() {
    this.reloadData();
  }

  reloadData() {
    this.etudiants = this.etudiantService.getEtudiantsList();
  }

  deleteEtudiant(id: number) {
    this.etudiantService.deleteEtudiant(id)
      .subscribe(
        data => {
          console.log(data);
          this.reloadData();
        },
        error => console.log(error));
  }

  etudiantDetails(id: number){
    this.router.navigate(['details', id]);
  }

  updateEtudiant(id: number){
    this.router.navigate(['update', id]);
  }
}
