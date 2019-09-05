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
    window.sessionStorage.setItem("idPerfil",id);
    return this.http.get<Perfil>(this.API+'/login/'+id);
  }


  public altaPerfil(perfil) {
    window.sessionStorage.setItem("idPerfil",perfil.idPerfil);
    return this.http.post<Perfil>(this.API + "/addPerfil", perfil);

  }

  public listarPerfil() {
    return this.http.get<Perfil[]>(this.API+"/listado/" + window.sessionStorage.getItem("idPerfil"));
  }

  public listarcontacto() {
    alert("idPErfil: "+window.sessionStorage.getItem("idPerfil"));
    return this.http.get<Perfil[]>(this.API+"/contacto/" + window.sessionStorage.getItem("idPerfil"));
  }
  public darLike(idOtroPerfil: string){
    return this.http.get(this.API+"/addLike/"+window.sessionStorage.getItem("idPerfil")+"/"+idOtroPerfil)
  }

  

  





}