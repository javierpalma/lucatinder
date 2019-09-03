import { Injectable } from '@angular/core';

import { HttpClient, HttpHeaders } from '@angular/common/http';
import { User } from '../models/user';

@Injectable({
  providedIn: 'root'
})
export class ServiceService {

  constructor(private http:HttpClient) {}

  private userUrl = 'http://localhost:8080/user-portal/users';

  public createUser(user) {
    return this.http.post<User>(this.userUrl, user);
  }
  
}
