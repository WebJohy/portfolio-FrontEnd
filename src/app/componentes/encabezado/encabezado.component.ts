import { HttpErrorResponse } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { Usuario } from 'src/app/models/usuario';
import { HeaderService } from 'src/app/servicios/header.service';
import { PorfolioService } from 'src/app/servicios/porfolio.service';

@Component({
  selector: 'app-encabezado',
  templateUrl: './encabezado.component.html',
  styleUrls: ['./encabezado.component.css']
})
export class EncabezadoComponent implements OnInit {

  public usuario : Usuario | undefined;
  public editUsuario : Usuario | undefined;

  

  constructor(private headerService : HeaderService){}

  
   ngOnInit(): void {
    this.getUser();
  }

  public getUser(): void {
    this.headerService.getUser().subscribe({
      next: (responce: Usuario) => {
        this.usuario=responce;
    },
    error: (error:HttpErrorResponse)=>{
      alert(error.message);
    }
  })
}
}
