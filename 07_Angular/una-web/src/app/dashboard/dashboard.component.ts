import { Component, OnInit } from '@angular/core';
import {HeroService} from '../hero.service';
import { Hero } from '../model/hero';

@Component({
  selector: 'app-dashboard',
  templateUrl: './dashboard.component.html',
  styleUrls: ['./dashboard.component.css']
})
export class DashboardComponent implements OnInit {
  heroes: Hero[];
  constructor(private heroService: HeroService) { }

  ngOnInit() {
    // Cogemos solo lso 4 primeros elementos del Array:
    this.heroes = this.heroService.getHeroes().slice(0, 4);
  }

}
