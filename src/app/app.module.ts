import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { EncabezadoComponent } from './componentes/encabezado/encabezado.component';
import { AcercaDeComponent } from './componentes/acerca-de/acerca-de.component';
import { ExperienciaComponent } from './componentes/experiencia/experiencia.component';
import { EducacionesComponent } from './componentes/educaciones/educaciones.component';
import { HabilidadesComponent } from './componentes/habilidades/habilidades.component';
import { HttpClientModule } from '@angular/common/http';
import { ProyectosComponent } from './componentes/proyectos/proyectos.component';
import { BotonEditarComponent } from './componentes/boton-editar/boton-editar.component';
import { BotonEliminarComponent } from './componentes/boton-eliminar/boton-eliminar.component';
import { FormsModule } from '@angular/forms';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';
import { EducacionComponent } from './componentes/educaciones/educacion/educacion.component';
import { NgCircleProgressModule } from 'ng-circle-progress';
import { InicioSesionComponent } from './componentes/inicio-sesion/inicio-sesion.component';

@NgModule({
  declarations: [
    AppComponent,
    EncabezadoComponent,
    AcercaDeComponent,
    ExperienciaComponent,
    EducacionesComponent,
    HabilidadesComponent,
    ProyectosComponent,
    BotonEditarComponent,
    BotonEliminarComponent,
    EducacionComponent,
    InicioSesionComponent
  ],
  imports: [
    BrowserModule,
    NgCircleProgressModule.forRoot({
      // set defaults here
      radius: 80,
      backgroundPadding: -8,
      backgroundColor: "#e8c5c5",
      animation:true,
      showSubtitle: false,
      clockwise: false,
      titleFontSize: "35",
      unitsFontSize: "30",
      outerStrokeWidth: 16,
      innerStrokeWidth: 8,
      outerStrokeColor: "#e413da",
      innerStrokeColor: "#f6e5e8",
      animationDuration: 300,
      outerStrokeLinecap: "butt",
      
    }),
    AppRoutingModule,
    HttpClientModule,
    FormsModule,
    NgbModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
