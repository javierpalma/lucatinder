import { Component, OnInit } from '@angular/core';
import { ServiciosPerfilService } from '../services/servicios-perfil.service';
import { FormBuilder, FormGroup } from "@angular/forms";
import { Perfil } from "../model/Perfil"
  import { from } from 'rxjs';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  formGroup: FormGroup;

  constructor(private perfilService: ServiciosPerfilService, 
              private fb: FormBuilder) { }

  ngOnInit() {
    this.formGroup = this.fb.group({
      id: ''
    });
  }

  login(formValue: any){
    this.perfilService.login(formValue.id).subscribe(perfil => alert('login correcto: '));
  }
}
