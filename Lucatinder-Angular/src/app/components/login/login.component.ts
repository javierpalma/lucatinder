import { Component, OnInit } from '@angular/core';
import { FormGroup, FormBuilder } from '@angular/forms';
import { PerfilServiciosService } from 'src/app/services/perfil-servicios.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  formGroup: FormGroup;

  constructor(private perfilService: PerfilServiciosService,
    private fb: FormBuilder, private router: Router) { }

  ngOnInit() {
    this.formGroup = this.fb.group({
      id: ''
    });
  }

  login(formValue: any) {
    this.perfilService.login(formValue.id).subscribe(
      perfil => {
        
        if(perfil==null){
          this.router.navigate(['alta']);
        }
        else{
          alert(perfil);
        }
      }
    );
  }
}
