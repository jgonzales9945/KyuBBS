import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

import {AppComponent} from './app.component';
import {Alt1Component} from './components/alt1/alt1.component';
import {OriginComponent} from './components/origin/origin.component';
import{LandingComponent} from './landing/landing.component';
export const routes: Routes = [
    {path: '',redirectTo:'origin',pathMatch: 'full'},
    { path: 'main', component: AppComponent },
    {path: 'origin', component: OriginComponent},
    { path: 'alt1', component: Alt1Component },
    {path: 'landing', component: LandingComponent}
];

@NgModule({
    imports: [ RouterModule.forRoot(routes)],
    exports: [ RouterModule ]
})
export class AppRoutingModule {}