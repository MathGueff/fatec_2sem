import { Component, Input, Output, EventEmitter } from '@angular/core';
import { RouterLink } from '@angular/router';


@Component({
  selector: 'app-category-card',
  standalone: true,
  imports: [],
  templateUrl: './category-card.component.html',
  styleUrl: './category-card.component.css'
})
export class CategoryCardComponent {
  @Input() category : any;

  @Output() selectCategoryEvent = new EventEmitter<string>();

  changeCategorySelected(){
    this.selectCategoryEvent.emit(this.category.title);
  }
}
