import { CommonModule } from '@angular/common';
import { Component, Input } from '@angular/core';
export interface Product { 
  id: number;
  name: string;
  description: string;
  image: string;
 }
@Component({
	selector: 'app-product-details', 
	imports: [
	CommonModule], 
	templateUrl: './product-details.component.html', 
	styleUrl: './product-details.component.css'
})
export class ProductDetailsComponent{
  @Input() product!: Product;
}