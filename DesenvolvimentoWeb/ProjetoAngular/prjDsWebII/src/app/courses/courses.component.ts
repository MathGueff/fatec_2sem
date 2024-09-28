import { CommonModule } from '@angular/common';
import { Courses } from './../models/courses';
import { Component } from '@angular/core';

@Component({
  selector: 'app-courses',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './courses.component.html',
  styleUrl: './courses.component.css'
})
export class CoursesComponent {
  courses : Courses[] = [
    {id:1,idCategory:1,title:'Pinchers',description : 'Aprenda sobre todos os pinchers e porque eles tremem tanto', cost: 250.00, image: 'assets/pincher_tremendo.jpg', duration:1200},
    {id:2,idCategory:2,title:'Doberman',description : 'Entenda porque eles são tão parecidos com o pincher da foto', cost: 12000.00, image: 'assets/doberman_e_pincher.jpg', duration:1},
    {id:3,idCategory:4,title:'Fiapo de Manga',description : 'Entenda porque ele é tão amado pelo povo brasileiro', cost: 1.00, image: 'assets/fiapo.jpg', duration:200},
    {id:4,idCategory:6,title:'Dalmatas',description : 'Aprenda a saber se são realmente 101 dalmatas', cost: 8000.00, image: 'assets/cento_e_um_dalmata.jpg', duration:10000}
  ]
}
