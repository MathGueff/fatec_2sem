import { Component } from '@angular/core';
import { HeaderComponent } from "../header/header.component";
import { NavbarComponent } from "../navbar/navbar.component";
import { CategoryBarComponent } from "../category-bar/category-bar.component";
import { CourseComponent } from "../course/course.component";
import { CourseDetailsComponent } from "../course-details/course-details.component";
import { RouterOutlet } from '@angular/router';

@Component({
  selector: 'app-main',
  standalone: true,
  imports: [HeaderComponent, NavbarComponent, CategoryBarComponent, CourseComponent, CourseDetailsComponent,RouterOutlet],
  templateUrl: './main.component.html',
  styleUrl: './main.component.css'
})
export class MainComponent {

}
