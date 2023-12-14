// app.module.ts

import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';

import { AppComponent } from './app.component';
import { HomeComponent } from './home/home.component';
import { EditorComponent } from './editor/editor.component';
import { SettingsComponent } from './settings/settings.component';

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    EditorComponent,
    SettingsComponent,
  ],
  imports: [BrowserModule, AppRoutingModule],
  providers: [],
  bootstrap: [AppComponent],
})
export class AppModule {}
