import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { PerfilComponent } from './perfil/perfil.component';

import { HeaderComponent } from './components/header/header.component';
import { FooterComponent } from './components/footer/footer.component';
import { ListadoComponent } from './components/listado/listado.component';

@NgModule({
  declarations: [
    AppComponent,
    PerfilComponent,
   
    HeaderComponent,
    FooterComponent,
    ListadoComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
