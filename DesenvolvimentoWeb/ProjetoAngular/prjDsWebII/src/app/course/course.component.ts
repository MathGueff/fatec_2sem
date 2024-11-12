import { CommonModule } from '@angular/common';
import { Course } from '../models/course';
import { Component, OnInit } from '@angular/core';
import {ActivatedRoute, Router, RouterLink, RouterLinkActive} from '@angular/router';
import { BehaviorSubject, Observable } from 'rxjs';
import { ICourse } from './course.model';

@Component({
  selector: 'app-courses',
  standalone: true,
  imports: [CommonModule,RouterLink,RouterLinkActive],
  templateUrl: './course.component.html',
  styleUrl: './course.component.css'
})
export class CourseComponent implements OnInit{

  private courseSubject : BehaviorSubject<ICourse[]> = new BehaviorSubject([] as any);
  data$: Observable<ICourse[]> = this.courseSubject.asObservable();
  constructor(private activatedRoute : ActivatedRoute, private router : Router) {}

  ngOnInit(): void {
    this.activatedRoute.params.subscribe((params) => {
      const id = params['id'];
      const list = this.courses.filter(
        (course) => course.idCategory == Number(id)
      );
      this.courseSubject.next(list);
    })
  }

  courses : Course[] = [
    {id:1,idCategory:1,title:'Pinchers',description : 'Aprenda sobre todos os pinchers e porque eles tremem tanto', cost: 250.00, image: 'assets/pincher_tremendo.jpg', duration:1200},
    {id:2,idCategory:2,title:'Doberman',description : 'Entenda porque eles são tão parecidos com o pincher da foto', cost: 12000.00, image: 'assets/doberman_e_pincher.jpg', duration:1},
    {id:3,idCategory:4,title:'Fiapo de Manga',description : 'Entenda porque ele é tão amado pelo povo brasileiro', cost: 1.00, image: 'assets/fiapo.jpg', duration:200},
    {id:4,idCategory:6,title:'Dalmatas',description : 'Aprenda a saber se são realmente 101 dalmatas', cost: 8000.00, image: 'assets/cento_e_um_dalmata.jpg', duration:10000},
    {id:5,idCategory:3,title:'Aauau',description : 'AUAUAUAUAAUAUAUUAUAVAUAUAUAUAAUAUAUUAUAAUAUAUAUAAUAUAUUAUAAUAUAUAUAAUAUAUUAUAAUAUAUAUAAUAUAUUAUAAUAUAUAUAAUAUAUUAUAAUAUAUAUAAUAUAUUAUA', cost: 10.00, image: 'assets/cento_e_um_dalmata.jpg', duration:1},
    {id:6,idCategory:7,title:'Leão',description : 'POUCO TEXTO', cost: 10.00, image: 'assets/fiapo.jpg', duration:1}
  ]
}
