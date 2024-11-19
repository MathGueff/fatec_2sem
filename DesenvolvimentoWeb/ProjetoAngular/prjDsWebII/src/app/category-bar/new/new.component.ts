import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { FormBuilder, FormGroup, ReactiveFormsModule, Validators } from '@angular/forms'

@Component({
  selector: 'app-new',
  standalone: true,
  imports: [ReactiveFormsModule, CommonModule],
  //templateUrl: './new.component.html',
  template: `
    <form [formGroup] = "categoryForm" (ngSubmit)="onSubmit()" class="m-2">
      <label for="title" class="form-label">Título:</label>
      <input formControlName="title" type="text" id="title" class="form-control col-3">
      <div *ngIf="!categoryForm.get('title')?.valid && categoryForm.get('title')?.touched">Título inválido</div>
      <label for="image" class="form-label">Imagem:</label>
      <input formControlName="image" type="text" id="image" class="form-control col-3">
      <div *ngIf="!categoryForm.get('image')?.valid && categoryForm.get('image')?.touched">Imagem inválida </div>
      <button type="submit" class="btn btn-dark mt-4">Cadastrar</button>
    </form>
  `,
  styleUrl: './new.component.css'
})
export class NewComponent {
  categoryForm: FormGroup;
  // FormBuilder
  // FormGroup
  // FormControl
  constructor(private fb: FormBuilder) {
    this.categoryForm = this.fb.group({
      title: ["", [Validators.required]],
      image: ["", [Validators.required, Validators.minLength(5)]],
    });
  }

  onSubmit() {
    if(this.categoryForm.valid){
      console.log(this.categoryForm.value);

    }
  }
}
