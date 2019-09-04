import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LoginComponent } from './components/login/login.component';
import { ReactiveFormsModule, FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { PerfilServiciosService } from './services/perfil-servicios.service';
import { AltaComponent } from './components/alta/alta.component';

@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    AltaComponent
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
