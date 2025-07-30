import { Component, signal } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import {SignUpFormComponent} from './sign-up/sign-up-form/sign-up-form.component';
import {SignUpComponent} from './sign-up/sign-up.component';

@Component({
  selector: 'app-root',
  imports: [RouterOutlet, SignUpFormComponent, SignUpComponent],
  templateUrl: './app.html',
  styleUrl: './app.scss'
})
export class App {
  protected readonly title = signal('farmy-ui');
}
