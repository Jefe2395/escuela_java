import { Component, OnInit } from '@angular/core';
import { MessageService } from '../message.service';

@Component({
  selector: 'app-messages',
  templateUrl: './messages.component.html',
  styleUrls: ['./messages.component.css']
})
export class MessagesComponent implements OnInit {
  // Angilar genera el servicio y lo "inyecta" en nuestro componente
  constructor(private messageService: MessageService) { }

  ngOnInit() {
  }

}
