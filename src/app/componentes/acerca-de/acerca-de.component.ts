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
  constructor(private datosPorfolio:PorfolioService) { }

  public editar (){
    console.log("Editar");
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


 








