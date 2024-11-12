import { Component } from '@angular/core';
import { FormBuilder, FormGroup, ReactiveFormsModule } from '@angular/forms'

@Component({
  selector: 'app-new',
  standalone: true,
  imports: [ReactiveFormsModule],
  //templateUrl: './new.component.html',
  template: `
    <form [formGroup] = "categoryForm" (ngSubmit)="onSubmit()" class="m-2">
      <label for="title" class="form-label">Título:</label>
      <input type="text" id="title" class="form-control col-3">
      <label for="image" class="form-label">Imagem:</label>
      <input type="text" id="image" class="form-control col-3">
      <button type="submit" class="btn btn-dark mt-4">Cadastrar</button>
    </form>
  `,
  styleUrl: './new.component.css'
})
export class NewComponent {
  categoryForm : FormGroup;
  //FormBuilder
  //FormGroup
  //FormControl
  constructor(private fb: FormBuilder){}
}
