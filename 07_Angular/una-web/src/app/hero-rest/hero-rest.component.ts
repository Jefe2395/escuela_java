import { Component, OnInit } from '@angular/core';
import { HeroRestService } from '../hero-rest.service';
import { Hero } from '../model/hero';
import { Observable } from 'rxjs';
import {HttpClient} from '@angular/common/http';
import { TouchSequence } from 'selenium-webdriver';

@Component({
  selector: 'app-hero-rest',
  template: `<h2>Listado heroes REST</h2>
  <ul>
    <li *ngFor = "let hero of HeroesRecibidos"> {{hero.id}} - {{hero.name}} </li>
  </ul>
  <div>
    <input [(ngModel)] ="id" placeholder="Id">
    <input [(ngModel)] ="name" placeholder="name">
    <input type="button" (click)="enviar()" value="ENVIAR">
  </div>`
})
export class HeroRestComponent implements OnInit {
  HeroesRecibidos: Hero[];

  constructor(private heroRestSrv: HeroRestService) { }
  id: string;
  name: string;
  enviar() {
    const nuevoHeroe = new Hero();
    // tslint:disable-next-line: radix
    nuevoHeroe.id = parseInt(this.id);
    nuevoHeroe.name = this.name;
    this.heroRestSrv.add(nuevoHeroe).subscribe((obj) => {this.ngOnInit; });
  }
  ngOnInit() {
    console.log('Empezamos a pedir los datos');
    let observArrayHeroes: Observable<Hero[]>;
    observArrayHeroes = this.heroRestSrv.getHeroes();
    // LA ejecucion continua hasta que el array es recibido.
    // Para recibirlo asincronamente nos suscrfibimos al Observable

    // 1. Manera en la que no funciona
    /*let funcionAcisameCuandoLoTengas = function (heroesRec) {
      this.HeroesRecibidos = heroesRec;
      console.log("Hemos recibido los heroes");
    }*/
    // observArrayHeroes.subscribe(funcionAcisameCuandoLoTengas);

    // 2. Manera que funciona
    observArrayHeroes.subscribe(heroesRec => this.HeroesRecibidos = heroesRec);
    console.log('Nos hemos suscrito');

    // 3.Funciona y lo escribimos todo en una linea
    // .heroRestSrv.getHeroes().subscribe(heroesRec => this.HeroesRecibidos = heroesRec);

  }

}
