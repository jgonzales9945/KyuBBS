
import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { environment } from '../../environments/environment';
import { Board } from '../models/Board';

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
export class BoardService{




    subscribers: BehaviorSubject<Board> = new BehaviorSubject<Board>(null);

 

constructor(private http: HttpClient) {


}

public allBoards (){

    return this.http.get<Board>(API_URL+'/board',HTTP_OPTIONS);

}

public addBoard(b : Board){
return this.http.post(API_URL+'/board',JSON.stringify(b),HTTP_OPTIONS);

}

public deleteBoard(b : Board){

  return this.http.delete(API_URL+'/board/delete/'+b.id,HTTP_OPTIONS);
}

}