
import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { environment } from '../../environments/environment';
import { Category } from '../models/Category';

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
export class CategoryService{




    subscribers: BehaviorSubject<Category> = new BehaviorSubject<Category>(null);

 

constructor(private http: HttpClient) {


}

public allCategories (){
    console.log(API_URL+'/category');
    return this.http.get<Category>(API_URL+'/category',HTTP_OPTIONS);

}

public addCategory(cat : Category){
return this.http.post(API_URL+'/category',JSON.stringify(cat),HTTP_OPTIONS);

}

public deleteCategory(cat : Category){

  return this.http.delete(API_URL+'/category/delete/'+cat.categoryId,HTTP_OPTIONS);
}

}