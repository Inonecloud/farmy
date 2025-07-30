import {Component, output, signal} from '@angular/core';
import {FormsModule} from '@angular/forms';
import {SignupModel} from '../signup.model';

@Component({
  selector: 'app-sign-up-form',
  standalone: true,
  imports: [FormsModule],
  templateUrl: './sign-up-form.component.html',
  styleUrl: './sign-up-form.component.scss'
})
export class SignUpFormComponent {
  signup = output<SignupModel>()
  enteredFirstName = signal('')
  enteredLastName = signal('')
  enteredEmail = signal('')
  enteredPhone = signal('')
  enteredPassword = signal('')
  enteredRepeatedPassword = signal('')


  onSubmit(){
    this.signup.emit({
      firstName: this.enteredFirstName(),
      lastName: this.enteredLastName(),
      email: this.enteredEmail(),
      phoneNumber: this.enteredPhone(),
      password: this.enteredPassword(),
      repeatedPassword: this.enteredRepeatedPassword()
    })
    this.enteredFirstName.set('')
    this.enteredLastName.set('')
    this.enteredEmail.set('')
    this.enteredPhone.set('')
    this.enteredPassword.set('')
    this.enteredRepeatedPassword.set('')
  }

}
