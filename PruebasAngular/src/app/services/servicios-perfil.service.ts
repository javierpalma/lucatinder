import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Perfil } from '../model/Perfil';

@Injectable({
  providedIn: 'root'
})
export class ServiciosPerfilService {

  public API ='//localhost:8080/API';


  constructor(private http: HttpClient) {
   }

   login(id: string){
     return this.http.get(this.API+'/login/' + id);
   }

   addPerfil(perfil){
     return this.http.post<Perfil>(this.API+'/addPerfil', perfil);
   }
}
