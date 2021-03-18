import { EtudiantDetailsComponent } from './etudiant-details/etudiant-details.component';
import { CreateEtudiantComponent } from './create-etudiant/create-etudiant.component';
import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { EtudiantListComponent } from './etudiant-list/etudiant-list.component';
import { UpdateEtudiantComponent } from './update-etudiant/update-etudiant.component';

const routes: Routes = [
  { path: '', redirectTo: 'etudiant', pathMatch: 'full' },
  { path: 'etudiants', component: EtudiantListComponent },
  { path: 'add', component: CreateEtudiantComponent },
  { path: 'update/:id', component: UpdateEtudiantComponent },
  { path: 'details/:id', component: EtudiantDetailsComponent },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
