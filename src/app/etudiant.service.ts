import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class EtudiantService {

  private baseUrl = 'http://localhost:5000/etudiants';

  constructor(private http: HttpClient) { }

  getEtudiant(id: number): Observable<any> {
    return this.http.get(`${this.baseUrl}/${id}`);
  }

  createEtudiant(etudiant: Object): Observable<Object> {
    return this.http.post(`${this.baseUrl}`, etudiant);
  }

  updateEtudiant(id: number, value: any): Observable<Object> {
    return this.http.put(`${this.baseUrl}/${id}`, value);
  }

  deleteEtudiant(id: number): Observable<any> {
    return this.http.delete(`${this.baseUrl}/${id}`, { responseType: 'text' });
  }

  getEtudiantsList(): Observable<any> {
    return this.http.get(`${this.baseUrl}`);
  }
}
