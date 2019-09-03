import { Component, OnInit } from '@angular/core';

import { Router } from '@angular/router';
import { User } from '../models/user';
import { ServiceService } from '../service/service.service';

@Component({
  selector: 'app-add-user',
  templateUrl: './add-user.component.html',
  styleUrls: ['./add-user.component.css']
})
export class AddUserComponent implements OnInit {

  user: User = new User();

  constructor(private router: Router, private ServiceService: ServiceService) {

  }

  createUser(): void {
    this.ServiceService.createUser(this.user)
        .subscribe( data => {
          alert("Usuario DEGENERADO de forma correcta");
        });

  };

  ngOnInit() {
  }

}
