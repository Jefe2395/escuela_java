import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-mi-control',
  templateUrl: './mi-control.component.html',
  styleUrls: ['./mi-control.component.css']
})
export class MiControlComponent implements OnInit {

  propiedadHola = "Vamos a comer ya!";
  constructor() { }

  ngOnInit() {
  }

}
