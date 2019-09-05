import { Component, OnInit } from '@angular/core';
import { Perfil } from '../../models/Perfil';
import { PerfilServiciosService } from 'src/app/services/perfil-servicios.service';
import { Router } from '@angular/router';
import { FormGroup, FormBuilder} from '@angular/forms';

@Component({
  selector: 'app-alta',
  templateUrl: './alta.component.html',
  styleUrls: ['./alta.component.css']
})
export class AltaComponent implements OnInit {
 
  perfil: Perfil = new Perfil();

  constructor(private router: Router, private perfilService: PerfilServiciosService) { }


  altaPerfil() {
    this.perfilService.altaPerfil(this.perfil)
        .subscribe( data => {
          
        });
      };

  ngOnInit() {
  };

}
