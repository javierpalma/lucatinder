import { Component, OnInit } from '@angular/core';
import { PerfilServiciosService } from 'src/app/services/perfil-servicios.service';


@Component({
  selector: 'app-listado',
  templateUrl: './listado.component.html',
  styleUrls: ['./listado.component.css']
})
export class ListadoComponent implements OnInit {

  

  constructor(private perfilService: PerfilServiciosService) { }

  ngOnInit() {
    
  }

}
