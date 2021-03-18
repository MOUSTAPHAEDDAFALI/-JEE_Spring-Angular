import { Etudiant } from '../etudiant';
import { Component, OnInit, Input } from '@angular/core';
import { EtudiantService } from '../etudiant.service';
import { EtudiantListComponent } from '../etudiant-list/etudiant-list.component';
import { Router, ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-etudiant-details',
  templateUrl: './etudiant-details.component.html',
  styleUrls: ['./etudiant-details.component.css']
})
export class EtudiantDetailsComponent implements OnInit {

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

  list(){
    this.router.navigate(['etudiants']);
  }
}
