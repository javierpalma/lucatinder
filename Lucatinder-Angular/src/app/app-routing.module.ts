import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AltaComponent } from './components/alta/alta.component';
import { ListadoComponent } from './components/listado/listado.component';
import { LoginComponent } from './components/login/login.component';
import { ContactosComponent } from './components/contactos/contactos.component';

const routes: Routes = [
  {path: 'alta', component: AltaComponent},
  {path: '', component:LoginComponent},
  {path: 'listado', component: ListadoComponent},
  {path: 'listado/:id', component: ListadoComponent},
  {path: 'contacto', component: ContactosComponent},
  {path: 'contacto/:id', component: ContactosComponent}
 
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
