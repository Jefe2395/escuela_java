import { Component, OnInit } from '@angular/core';
import { Hero } from '../model/hero';

@Component({
  selector: 'app-mi-control',
  templateUrl: './mi-control.component.html',
  styleUrls: ['./mi-control.component.css']
})
export class MiControlComponent implements OnInit {
  static comtIds = 0;
  propiedadHola = 'Vamos a tomar unas cañas!';
  hero: Hero = {
    id: 1,
    name : 'Iron Man',
    imagen: ''
  };
  constructor() {
    MiControlComponent.comtIds++;
    this.hero.id = MiControlComponent.comtIds;
  }

  ngOnInit() {
  }

}
