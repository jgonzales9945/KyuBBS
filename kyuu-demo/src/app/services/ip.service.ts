
import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { environment } from '../../environments/environment';
import { Ip } from '../models/Ip';

import { BehaviorSubject } from 'rxjs';
import { JsonPipe } from '@angular/common';
//

const API_URL = environment.apiUrl;
const HTTP_OPTIONS = {
  headers: new HttpHeaders({
    'Content-Type': 'application/json'
  })
}


@Injectable()
export class IpService{




    subscribers: BehaviorSubject<Ip> = new BehaviorSubject<Ip>(null);

 

constructor(private http: HttpClient) {


}


public getIp(){

  return JSON.parse(JSON.stringify(this.http.get<Ip>('http://ip-api.com/json',HTTP_OPTIONS)));
}

}