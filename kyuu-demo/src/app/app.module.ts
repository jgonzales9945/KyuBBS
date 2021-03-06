import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';

import { AppComponent } from './app.component';

import {NgbModule} from '@ng-bootstrap/ng-bootstrap';
import { Alt1Component } from './components/alt1/alt1.component';
import { AppRoutingModule } from './app-routing.module';
import { OriginComponent } from './components/origin/origin.component';
import { LandingComponent } from './landing/landing.component';
import { CategoryService } from './services/category.service';
import { HttpClientModule } from '@angular/common/http';

@NgModule({
  declarations: [
    AppComponent,
    Alt1Component,
    OriginComponent,
    LandingComponent,

  ],
  imports: [NgbModule.forRoot(),
    FormsModule,
    BrowserModule,
    AppRoutingModule,
    HttpClientModule
  ],
  providers: [CategoryService],
  bootstrap: [AppComponent]
})
export class AppModule { }
