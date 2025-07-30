import {Component, inject} from '@angular/core';
import {SignUpFormComponent} from './sign-up-form/sign-up-form.component';
import {SignupModel} from './signup.model';
import {UserService} from './user.service';

@Component({
  selector: 'app-sign-up',
  imports: [
    SignUpFormComponent
  ],
  templateUrl: './sign-up.component.html',
  styleUrl: './sign-up.component.scss'
})
export class SignUpComponent {
private userService = inject(UserService)
  onSignUp(data:SignupModel){
    console.log(data);

    this.userService.signup({
      firstName: data.firstName,
      lastName: data.lastName,
      email: data.email,
      phoneNumber: data.phoneNumber,
      password: data.password,
      repeatedPassword: data.repeatedPassword
    }).subscribe({
      next: () => {
        console.log('Signup successful!');
      }
    })
  }
}
