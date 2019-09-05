import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Perfil } from '../models/Perfil';

@Injectable({
  providedIn: 'root'
})
export class PerfilServiciosService {

  public API = '//localhost:8080/API';

  constructor(private http: HttpClient) { }


  login(id: string){
    return this.http.get<Perfil>(this.API+'/login/'+id);
  }


  public altaPerfil(perfil) {
    return this.http.post<Perfil>(this.API + "/addPerfil", perfil);

  }

  public listarPerfil(id) {
    return this.http.get<Perfil[]>(this.API+"/listado/" + id);
  }

  public contacto() {
    return this.http.get<Perfil[]>(this.API+"/contacto/{id}");
  }

  

  





}