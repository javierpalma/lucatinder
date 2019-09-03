import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

//Nuevo

import { AddUserComponent } from './add-user/add-user.component';

//Creo las rutas
const routes: Routes = [
  { path: 'add', component: AddUserComponent }
];

//Todo esto ya estaba al ppio
@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
