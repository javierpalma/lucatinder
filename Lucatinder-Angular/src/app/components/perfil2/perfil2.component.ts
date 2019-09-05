import { Component, OnInit, Input } from '@angular/core';
import { Perfil } from 'src/app/models/Perfil';
import { PerfilServiciosService } from 'src/app/services/perfil-servicios.service';

@Component({
  selector: 'app-perfil2',
  templateUrl: './perfil2.component.html',
  styleUrls: ['./perfil2.component.css']
})
export class Perfil2Component implements OnInit {

  @Input() perfil: Perfil;

  constructor(private perfilService: PerfilServiciosService) { }

  ngOnInit() {
  }
  
  public darLike(idOtroPerfil: string){
    return this.perfilService.darLike(idOtroPerfil).subscribe(data=>{});
  }

}
