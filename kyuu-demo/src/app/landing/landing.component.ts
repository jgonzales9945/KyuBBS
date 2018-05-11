import { Component, OnInit } from '@angular/core';
import { CategoryService } from '../services/category.service';
import { BoardService } from '../services/board.service';
import { IpService } from '../services/ip.service';
import { Category } from '../models/Category';
import { Board } from '../models/Board';
import {Router} from '@angular/router';
import * as $ from 'jquery';
@Component({
  selector: 'app-landing',
  templateUrl: './landing.component.html',
  styleUrls: ['./landing.component.css'],

})
export class LandingComponent implements OnInit {




  constructor(private iservice : IpService, private bservice: BoardService, private cservice: CategoryService, private router: Router) {   


   }

categoryList : Array<Category> = new Array();
boardList : Array<Board> = new Array();
  
kyb : Array<String> = ['K','Y','U','U','B','B','S'];

ngOnInit() {
    //lets get all of our categories

  this.cservice.allCategories().subscribe(category => 
    {this.categoryList = JSON.parse(JSON.stringify(category));
    
  
    
    });

    this.bservice.allBoards().subscribe(board => 
      {this.boardList = JSON.parse(JSON.stringify(board));
      console.log(board);
      }
    );




      
//lets get all of our boards
 



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
  
  
    }, 1000);

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

  
   cubix[i].classList.add(newFace);
   activeFace = newFace;

       }


  }



  playAccordion(e : Event){

    let acc = document.getElementsByClassName("accordion");
    let d = e.srcElement;
    let panel = d.nextElementSibling;
   d.classList.toggle("active"); 
   panel.classList.toggle("panelActive");
  }



}
