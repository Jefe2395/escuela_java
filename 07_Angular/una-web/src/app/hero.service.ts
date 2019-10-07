import { Injectable } from '@angular/core';
import { Hero } from './model/Hero';
import { HEROES } from './model/array-heros';
import { MessageService } from './message.service';
import { stringify } from '@angular/compiler/src/util';

@Injectable({
  providedIn: 'root'
})
export class HeroService {

  arrayHeroes: Hero[];
  constructor(private messageService: MessageService) {
    let i = 0;
    this.arrayHeroes = [];
    for (i = 0; i < HEROES.length; i++) {
      this.arrayHeroes.push(HEROES[i]);
    }
  }

  getHeroes(): Hero[] {
    this.messageService.add('HeroService: capturando heroes');
    return HEROES;
  }

  addHero(nameH: string, imagenH: string): void {
    this.messageService.add('Hero added');
    HEROES.push({ id: HEROES.length + 1, name: nameH, imagen: imagenH });
  }
}
