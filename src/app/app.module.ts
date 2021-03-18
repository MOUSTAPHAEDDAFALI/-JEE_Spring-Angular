import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { CreateEtudiantComponent } from './create-etudiant/create-etudiant.component';
import { EtudiantDetailsComponent } from './etudiant-details/etudiant-details.component';
import { EtudiantListComponent } from './etudiant-list/etudiant-list.component';
import { HttpClientModule } from '@angular/common/http';
import { UpdateEtudiantComponent } from './update-etudiant/update-etudiant.component';
@NgModule({
  declarations: [
    AppComponent,
    CreateEtudiantComponent,
    EtudiantDetailsComponent,
    EtudiantListComponent,
    UpdateEtudiantComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
