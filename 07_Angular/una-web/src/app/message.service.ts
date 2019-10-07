import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class MessageService {
  messages: string[] = []; // New Array()

  add(messages: string): void {
    this.messages.push(messages);
  }
  clear(): void {
    this.messages = [];
  }
}
