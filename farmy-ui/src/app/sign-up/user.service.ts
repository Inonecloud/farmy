import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {SignupModel} from './signup.model';
import {Observable} from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  private apiUrl = 'http://localhost:8080/api/user/signup';


  constructor(private http: HttpClient) {
  }

  signup(data: SignupModel): Observable<any>{
    return this.http.post(this.apiUrl, data)
  }
}
