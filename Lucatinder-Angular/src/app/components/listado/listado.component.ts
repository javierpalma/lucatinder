import { Component, OnInit } from '@angular/core';
import { PerfilServiciosService } from 'src/app/services/perfil-servicios.service';
import { Perfil } from 'src/app/models/Perfil';


@Component({
  selector: 'app-listado',
  templateUrl: './listado.component.html',
  styleUrls: ['./listado.component.css']
})
export class ListadoComponent implements OnInit {

  

  constructor(private perfilService: PerfilServiciosService) { }

  listarPerfil(): void{
    this.perfilService.listarPerfil()
  }

  ngOnInit() {
  
  }

}
