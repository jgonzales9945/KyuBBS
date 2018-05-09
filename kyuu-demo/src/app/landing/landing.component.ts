import { Component, OnInit } from '@angular/core';
import { CategoryService } from '../services/category.service';
import { Category } from '../models/Category';
import {Router} from '@angular/router';
@Component({
  selector: 'app-landing',
  templateUrl: './landing.component.html',
  styleUrls: ['./landing.component.css'],

})
export class LandingComponent implements OnInit {




  constructor(private cservice: CategoryService, private router: Router) {    }

  ngOnInit() {
    
  this.cservice.allCategories().subscribe(categories =>
  
  {console.log(categories)});

    let activeFace = '';
    window.setInterval(function(){
      let cubix = document.getElementsByClassName("cube");
  
      
    
    for(let i =0;i<cubix.length;i++){
    
     if(activeFace){
       cubix[i].classList.remove(activeFace);
     }
    
    let dice = Math.floor(Math.random() * 5); 
    
    let newFace = 'show-'+dice;
    //console.log(dice);
    
    
     cubix[i].classList.add(newFace);
     activeFace = newFace;
  
         }
  
  
    }, 2000);

}


  rotateCubes(){
    let cubix = document.getElementsByClassName("cube");

    let activeFace = '';
  
  for(let i =0;i<cubix.length;i++){
  
   if(activeFace){
     cubix[i].classList.remove(activeFace);
   }
  
  let dice = Math.floor(Math.random() * 5); 
  
  let newFace = 'show-'+dice;
  console.log("going!");
  
  
   cubix[i].classList.add(newFace);
   activeFace = newFace;

       }


  }



}
