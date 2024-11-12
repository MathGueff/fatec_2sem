import { NewComponent } from './category-bar/new/new.component';
import { CourseComponent } from './course/course.component';
import { Routes } from '@angular/router';
import { CourseDetailsComponent } from './course-details/course-details.component';
import { CategoryBarComponent } from './category-bar/category-bar.component';

export const routes: Routes = [
  {path:'course', component: CourseComponent},
  {path:'course-details', component:CourseDetailsComponent},
  {path: 'course/:id', component: CourseComponent},
  {path: 'category/new', component:NewComponent},
];
