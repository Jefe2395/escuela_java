import { Injectable } from '@angular/core';
import { Hero } from './model/hero';
import { HEROES } from './model/array-heros';
import { Observable, of } from 'rxjs';
import { HttpClient, HttpHeaders } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class HeroRestService {
  urlApiRest = 'http://localhost:8084/CRUD_Vista_JSTL/api/heroes';
  httpOptions = {
    headers: new HttpHeaders({ 'Content-Type': 'application/json' })
  };
  constructor(private httpCli: HttpClient) {
  }

  /*getHeroes(): Observable<Hero[]> {
    return of(this.arrayHeroes);
    // Devovlemos un observable que encapsulamos el array.
    // Inmediatamente emite el evento que ya tiene el array
  }*/

  getHeroes(): Observable<Hero[]> {
    let observResp: Observable<Hero[]>;
    observResp = this.httpCli.get<Hero[]>(this.urlApiRest);
    return observResp;
    // Aqui no definimos las callback, mejor que las defina donde se necesitan.
    // Devolvemos el observable para que pueda gestionar fuera del servicio
  }

  addHero(nameH: string, imagenH: string): void {
    HEROES.push({ id: HEROES.length + 1, name: nameH, imagen: imagenH });
  }
  add(newHero: Hero): Observable<any> {
    return this.httpCli.post(this.urlApiRest, newHero, this.httpOptions);
  }

}

