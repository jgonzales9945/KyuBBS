
import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { environment } from '../../environments/environment';
import { Category } from '../models/Category';

import { BehaviorSubject } from 'rxjs';
//

const API_URL = environment.apiUrl;
const HTTP_OPTIONS = {
  headers: new HttpHeaders({
    'Content-Type': 'application/json'
  })
}


@Injectable()
export class CategoryService{




    subscribers: BehaviorSubject<Category> = new BehaviorSubject<Category>(null);

 

constructor(private http: HttpClient) {


}

public allCategories (){
    console.log(API_URL+'/category');
    return this.http.get<Category>(API_URL+'/category',HTTP_OPTIONS);

}

}