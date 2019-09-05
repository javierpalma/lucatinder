import { Component, OnInit } from '@angular/core';
import { Perfil } from 'src/app/models/Perfil';
import { PerfilServiciosService } from 'src/app/services/perfil-servicios.service';

@Component({
  selector: 'app-contactos',
  templateUrl: './contactos.component.html',
  styleUrls: ['./contactos.component.css']
})
export class ContactosComponent implements OnInit {

  listPerfil: Perfil[];

  constructor(private perfilService: PerfilServiciosService) { }

  ngOnInit() {
    this.listaContacto();
  }

  public listaContacto(){
    return this.perfilService.listarcontacto().subscribe(data =>{
      this.listPerfil = data;
    })
  }

}
