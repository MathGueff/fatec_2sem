import { CourseComponent } from './../course/course.component';
import { Course } from './../models/course';
import { Component } from '@angular/core';
import { RouterLink } from '@angular/router';

@Component({
  selector: 'app-course-details',
  standalone: true,
  imports: [RouterLink],
  templateUrl: './course-details.component.html',
  styleUrl: './course-details.component.css'
})
export class CourseDetailsComponent {
}
