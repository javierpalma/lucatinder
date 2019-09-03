import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

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
}
