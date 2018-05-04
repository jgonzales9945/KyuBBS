import { Component, OnInit } from '@angular/core';
import { UserService } from '../../services/user.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-nav',
  templateUrl: './nav.component.html',
  styleUrls: ['./nav.component.css']
})
export class NavComponent implements OnInit {

  loggedIn: boolean = (localStorage.getItem('user') !== null) ? true : false;

  constructor(private userService: UserService, private router: Router) {
    this.userService.getLoggedIn().subscribe(loggedIn => {
      this.loggedIn = this.loggedIn;
    });
  }

  logout() {
    localStorage.clear();
    this.userService.loggedIn.next(false);
    this.router.navigate(['login']);
  }

  ngOnInit() { }

}
