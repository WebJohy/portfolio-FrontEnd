import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs/internal/Observable';
import { environment } from 'src/environments/environment';
import { Educacion } from '../models/educacion';

@Injectable({
  providedIn: 'root'
})
export class EducacionService {
  private apiServerUrl=environment.apiBaseUrl;
  


  constructor(private http:HttpClient) { }

  public getEducacion():Observable<Educacion[]>{
    return this.http.get<Educacion[]>(`${this.apiServerUrl}/educacion/all`);
  }
  public addEducacion(educacion:Educacion):Observable<Educacion>{
    return this.http.post<Educacion>(`${this.apiServerUrl}/educacion/add`, educacion);
  }

  public editarEducacion(educacion:Educacion):Observable<Educacion>{
    return this.http.put<Educacion>(`${this.apiServerUrl}/educacion/editar`, educacion);
  }

  public eliminarEducacion(educacionId: number):Observable<void>{
    return this.http.delete<void>(`${this.apiServerUrl}/educacion/eliminar/${educacionId}`);
  }


  public validarUrlImagen(url:string):Promise<boolean|undefined>{
    console.log(`llega funcion`)
    return this.http.head(url, { observe: 'response' }) 
      .toPromise()
      .then(response => {
        console.log(response)
        return response?.status === 200 && response?.headers.get('content-type')?.startsWith('image/');
      })
      .catch(() => {
        console.log(`error`)
        return false;
      });
  }

}
