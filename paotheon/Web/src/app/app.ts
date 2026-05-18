import { Component, signal } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { ReceitasList } from './receitas-list/receitas-list';

@Component({
  selector: 'app-root',
  imports: [RouterOutlet,ReceitasList],
  templateUrl: './app.html',
  styleUrl: './app.css'
})
export class App {
  protected readonly title = signal('Web');
}
