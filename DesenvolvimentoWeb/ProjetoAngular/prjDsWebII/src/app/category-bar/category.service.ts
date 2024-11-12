import { HttpClient } from "@angular/common/http";
import { Injectable } from "@angular/core";

@Injectable({
  providedIn: 'root',
})

export class CategoryService{
  constructor(private httpClient:HttpClient){}
  getList = () => {
    const response = this.httpClient.get("https://apimocha.com/fatecangular/category");
    return response;
  };
}
