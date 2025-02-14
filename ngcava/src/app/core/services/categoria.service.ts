import { HttpClient } from "@angular/common/http";
import { Injectable } from "@angular/core";
import { environment } from '../../../environments/environment';
import { Categoria } from "../models/categoria";

@Injectable({
    providedIn: 'root'
})
export class CategoriaService{

    constructor(private http: HttpClient){}

    url: string = `${environment.apiUrl}/categorias`;

    getAll(){
        return this.http.get<Categoria[]>(this.url, {observe: 'response'});
    }
}