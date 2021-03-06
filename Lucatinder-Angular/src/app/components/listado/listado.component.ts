import { Component, OnInit } from '@angular/core';
import { PerfilServiciosService } from 'src/app/services/perfil-servicios.service';
import { Perfil } from 'src/app/models/Perfil';
import { ArrayType } from '@angular/compiler';
import { Router, ActivatedRoute } from '@angular/router';



@Component({
  selector: 'app-listado',
  templateUrl: './listado.component.html',
  styleUrls: ['./listado.component.css']
})
export class ListadoComponent implements OnInit {

  id: any;
  listPerfil: Perfil[];

  constructor(private router: Router, private perfilService: PerfilServiciosService, private activeRute: ActivatedRoute) {
    
   }

  ngOnInit() {
    this.activeRute.params.subscribe(data =>{
        this.id=data.id;
    })

    this.perfilService.listarPerfil()
    .subscribe(data => {
      this.listPerfil=data;
    });
  };

}
