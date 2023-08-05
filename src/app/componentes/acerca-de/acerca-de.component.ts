import { Component, OnInit } from '@angular/core';
import { PorfolioService } from 'src/app/servicios/porfolio.service';

@Component({
  selector: 'app-acerca-de',
  templateUrl: './acerca-de.component.html',
  styleUrls: ['./acerca-de.component.css']
})

export class AcercaDeComponent implements OnInit {
  miPorfolio: any;
  usuarioLogueado: boolean = false;
  propiedadesModal: any;
  fotoPerfil: any = { titulo: "Foto de perfil", descripcion: "Nueva URL para foto de perfil" };
  acercaDe: any = { titulo: "Acerca de", descripcion: "Nueva descripicion sobre mi"};
  nombreTitulo: any = { titulo: "Ingrese su nombre y título", descripcion: "Ingrese el nombre para mostrar", subdescripcion:"Ingrese su nuevo titulo"};
  

  constructor(private datosPorfolio:PorfolioService) { }

  public editar (propiedades: string){
    console.log("propiedades", propiedades);
    if(propiedades === 'fotoPerfil'){
      this.propiedadesModal = this.fotoPerfil;
    }else if(propiedades === 'acercaDe'){
      this.propiedadesModal = this.acercaDe;
    }else if(propiedades === 'nombreTitulo'){
      this.propiedadesModal = this.nombreTitulo;
     }
     console.log(this.propiedadesModal);
  }
 
  public eliminar (){
    console.log("Eliminar");
  }

  ngOnInit(): void {
    this.datosPorfolio.obtenerDatos().subscribe(data => {
      console.log(data);
      this.miPorfolio = data; 
    });
    this.usuarioLogueado = true;
  }
}


 








