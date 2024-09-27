import { Component } from '@angular/core';
import { HeaderComponent } from "../header/header.component";
import { NavbarComponent } from "../navbar/navbar.component";
import { CategoryBarComponent } from "../category-bar/category-bar.component";
import { CoursesComponent } from "../courses/courses.component";

@Component({
  selector: 'app-main',
  standalone: true,
  imports: [HeaderComponent, NavbarComponent, CategoryBarComponent, CoursesComponent],
  templateUrl: './main.component.html',
  styleUrl: './main.component.css'
})
export class MainComponent {

}
