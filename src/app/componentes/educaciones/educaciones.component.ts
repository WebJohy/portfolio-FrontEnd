import { HttpErrorResponse } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { Educacion } from 'src/app/models/educacion';
import { EducacionService } from 'src/app/servicios/educacion.service';
declare var window:any;

@Component({
  selector: 'app-educaciones',
  templateUrl: './educaciones.component.html',
  styleUrls: ['./educaciones.component.css']
})



export class EducacionesComponent implements OnInit {

public educaciones: Educacion[]=[];
public editarEducacion:Educacion | undefined;
public eliminarEducacion:Educacion | undefined;
imagenValida:boolean | undefined = false;

modal:any;

constructor(private educacionesService:EducacionService) {}

ngOnInit(): void {
  this.getEducaciones();
  }

  public getEducaciones():void{
      console.log(`llega educaciones`)
    this.educacionesService.getEducacion().subscribe({
      next:(Response: Educacion[]) =>{
        this.educaciones=Response;
      },
      error:(error:HttpErrorResponse) =>{
        alert(error.message);
      },
     })
   }

 

  public onOpenModal(modo:String, educacion?: Educacion):void{
    const container=document.getElementById('main-container');
    const button=document.createElement('button');
    console.log(container);

    button.type="button";
    button.style.display='none';
    button.setAttribute('data-toggle', 'modal');
    if(modo==='add'){
      button.setAttribute('data-target','#addEducacionModal');
      this.modal = new window.bootstrap.Modal(document.getElementById("addEducacionModal"));
      this.modal.show();

    } else if (modo==='eliminar'){
      this.eliminarEducacion=educacion;
      button.setAttribute('data-target','#eliminarEducacionModal');
      this.modal = new window.bootstrap.Modal(document.getElementById("eliminarEducacionModal"));
      this.modal.show();
    

    } else if (modo==='editar'){
      this.editarEducacion=educacion;
      button.setAttribute('data-target','#editarEducacionModal');
      this.modal = new window.bootstrap.Modal(document.getElementById("editarEducacionModal"));
      this.modal.show();

    }
    container?.appendChild(button);
    console.log(container);
    
    button.click();
  }
  public onAddEducacion(addForm: NgForm):void{
    document.getElementById('add-educacion-form')?.click();
    this.educacionesService.addEducacion(addForm.value).subscribe({
      next: (response: Educacion)=>{
        console.log(response);
        this.getEducaciones();
        addForm.reset();
      },
      error:(error:HttpErrorResponse)=>{
        alert(error.message);
        addForm.reset();
      }
    })
  }
  public onEditarEducacion(educacion: Educacion){
    this.editarEducacion=educacion;
    console.log(educacion)
      document.getElementById('add-educacion-form')?.click();
      this.educacionesService.editarEducacion(educacion).subscribe({
      next: (response: Educacion)=>{
        console.log(response);
        this.getEducaciones();
      },
      error:(error:HttpErrorResponse)=>{
        alert(error.message);
      }
     })
  }

  public onEliminarEducacion(idEdu: number):void{
      console.log("llega")
      this.educacionesService.eliminarEducacion(idEdu).subscribe({
      next: (response: void)=>{
        console.log(response);
        this.getEducaciones();
      },
      error:(error:HttpErrorResponse)=>{
        alert(error.message);
      }
     })
  }

  public onCloseModal():void{
    this.modal.hide();
    

    }

}
