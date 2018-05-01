import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';


import { AppComponent } from './app.component';

import {NgbModule} from '@ng-bootstrap/ng-bootstrap';
import { Alt1Component } from './components/alt1/alt1.component';
import { AppRoutingModule } from './app-routing.module';
import { OriginComponent } from './components/origin/origin.component';
@NgModule({
  declarations: [
    AppComponent,
    Alt1Component,
    OriginComponent
  ],
  imports: [NgbModule.forRoot(),
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
