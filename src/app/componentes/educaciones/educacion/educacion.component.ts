import { Component, Input } from '@angular/core';
import { Educacion } from 'src/app/models/educacion';
import { EducacionService } from 'src/app/servicios/educacion.service';

@Component({
  selector: 'app-educacion',
  templateUrl: './educacion.component.html',
  styleUrls: ['./educacion.component.css']
})
export class EducacionComponent {
@Input() educacion: any;
imagenValida:boolean | undefined = false;
constructor(private educacionesService:EducacionService) {}
ngOnInit():void{
  this.verificarImagenes();
}

verificarImagenes() {
    console.log('educacion? ', this.educacion)
    this.imagenValida = this.educacionesService.validarUrlImagen(this.educacion.imagenEdu);
  
}

}

