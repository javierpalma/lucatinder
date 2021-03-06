import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LoginComponent } from './components/login/login.component';
import { ReactiveFormsModule, FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { PerfilServiciosService } from './services/perfil-servicios.service';
import { AltaComponent } from './components/alta/alta.component';
import { FooterComponent } from './components/footer/footer.component';
import { HeaderComponent } from './components/header/header.component';
import { ListadoComponent } from './components/listado/listado.component';
import { PerfilComponent } from './components/perfil/perfil.component';
import { ContactosComponent } from './components/contactos/contactos.component';
import { Perfil2Component } from './components/perfil2/perfil2.component';


@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    AltaComponent,
    FooterComponent,
    HeaderComponent,
    ListadoComponent,
    PerfilComponent,
    ContactosComponent,
    Perfil2Component
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    ReactiveFormsModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [ PerfilServiciosService],
  bootstrap: [AppComponent]
})
export class AppModule { }
