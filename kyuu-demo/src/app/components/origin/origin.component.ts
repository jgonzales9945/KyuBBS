import { Component, OnInit } from '@angular/core';
import { NgModel } from '@angular/forms';
import{ Thread } from '../../models/Thread';
import { Pipe, PipeTransform } from '@angular/core';
import { User } from '../../models/User';

@Component({
  selector: 'app-origin',
  templateUrl: './origin.component.html',
  styleUrls: ['./origin.component.css']
})
export class OriginComponent implements OnInit {








  rope = Array<Thread>();
  fiber = new Thread();

user = new User();

  shift : boolean;
words : string;
 counter : Number;
  constructor() { }

  ngOnInit() {
    //this.fiber.Text = "Root Node";
   // this.fiber.ID = "anonymous123";
    this.rope.push(this.fiber);
    this.counter = 1;
    console.log(this.rope);
    this.user.username = "anonymous";
    this.openModal(false);

  }


  addThread(e : Event){
    
    e.preventDefault();
    let temp = new Thread();
    let day = new Date();

   // temp.ID = this.user.username;
   // temp.Text = this.words;
   // temp.Date = day.toString();

    if(this.shift){
this.words += '\n';
    }
else if(this.words!=undefined && this.words.trim()!=""){
  console.log(this.words);
    this.rope.push(temp);
    this.words = "";
}



setTimeout(function(){    
  let myElement = document.getElementById('box');

myElement.scrollTop = myElement.scrollHeight;},1);


  }

  getShift(e : KeyboardEvent){


    if(e.keyCode==16)
    this.shift = !this.shift;
    
console.log(this.shift);
  
  }

hello(hi : boolean){

  let mainbody = document.getElementById('mainbody');
console.log(hi);
 // mainbody.style.marginLeft = hi ? "200px" : "0px";


}


openModal(yes : boolean){

  if(yes)
document.getElementById('nameset').style.display = 'block';
else
document.getElementById('nameset').style.display = 'none';

}

setName(name : string){

this.user.username = name;
this.openModal(false);
}


}


