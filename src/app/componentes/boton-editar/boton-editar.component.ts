import { Component, Input } from '@angular/core';
import { ModalDismissReasons, NgbDatepickerModule, NgbModal } from '@ng-bootstrap/ng-bootstrap';

@Component({
  selector: 'app-boton-editar',
   templateUrl: './boton-editar.component.html',
  styleUrls: ['./boton-editar.component.css']
})
export class BotonEditarComponent {
  @Input() propiedadesModal: any;
  closeResult = '';

	constructor(private modalService: NgbModal) {}

  open(content:any) {
	console.log("propiedades", this.propiedadesModal)
		this.modalService.open(content, { ariaLabelledBy: 'modal-basic-title' }).result.then(
			(result) => {
				this.closeResult = `Closed with: ${result}`;
			},
			(reason) => {
				this.closeResult = `Dismissed ${this.getDismissReason(reason)}`;
			},
		);
	}

	private getDismissReason(reason: any): string {
		if (reason === ModalDismissReasons.ESC) {
			return 'by pressing ESC';
		} else if (reason === ModalDismissReasons.BACKDROP_CLICK) {
			return 'by clicking on a backdrop';
		} else {
			return `with: ${reason}`;
		}
	}
}



// public onOpenModalEditar(modo:String, educacion?: Educacion):void{
//   const container=document.getElementById('main-container');
//   const button=document.createElement('button');
  

//   button.type="button";
//   button.style.display='none';
//   button.setAttribute('data-toggle', 'modal');
//   if(modo==='fotoPortada'){
//     button.setAttribute('data-target','');
//     this.modal = new window.bootstrap.Modal(document.getElementById(""));
//     this.modal.show();

//   } else if (modo==='fotoPerfil'){
//     this.eliminarEducacion=educacion;
//     button.setAttribute('data-target','#eliminarEducacionModal');
//     this.modal = new window.bootstrap.Modal(document.getElementById("eliminarEducacionModal"));
//     this.modal.show();
  

//   } else if (modo==='editar'){
//     this.editarEducacion=educacion;
//     button.setAttribute('data-target','#editarEducacionModal');
//     this.modal = new window.bootstrap.Modal(document.getElementById("editarEducacionModal"));
//     this.modal.show();

//   }
//   container?.appendChild(button);
//   console.log(container);
  
//   button.click();
// }