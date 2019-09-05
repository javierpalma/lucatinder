import { Component, OnInit, Input } from '@angular/core';
import { Perfil } from 'src/app/models/Perfil';
import { PerfilServiciosService } from 'src/app/services/perfil-servicios.service';

@Component({
  selector: 'app-perfil',
  templateUrl: './perfil.component.html',
  styleUrls: ['./perfil.component.css']
})
export class PerfilComponent implements OnInit {
  @Input() perfil: Perfil;

  constructor(private perfilService: PerfilServiciosService) { }

  ngOnInit() {
  }
  
  public darLike(idOtroPerfil: string){
    return this.perfilService.darLike(idOtroPerfil).subscribe(data=> alert("Has hecho like"));
  }

}
