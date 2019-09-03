import { Component, OnInit } from '@angular/core';
import { ServiciosPerfilService } from 'src/app/services/servicios-perfil.service';
import { Perfil } from 'src/app/model/Perfil';

@Component({
  selector: 'app-registro',
  templateUrl: './registro.component.html',
  styleUrls: ['./registro.component.css']
})
export class RegistroComponent implements OnInit {

  perfil: Perfil = new Perfil();

  constructor(private perfilServicio: ServiciosPerfilService) { }

  ngOnInit() {
  }

  addPerfil(): void{
    console.info(this.perfil);
    this.perfilServicio.addPerfil(this.perfil)
      .subscribe(data => {
        alert("Perfil generado de forma correcta");
    });
  }
}
