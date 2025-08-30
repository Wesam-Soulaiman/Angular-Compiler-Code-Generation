import { Component } from '@angular/core';
import { Product, ProductDetailsComponent } from '../product-details/product-details.component';
import { CommonModule } from '@angular/common';
@Component({
	selector: 'app-product-list', 
	templateUrl: './product-list.component.html', 
	imports: [
	CommonModule, 
	ProductDetailsComponent], 
	styleUrls: [
	'./product-list.component.css']
})
export class ProductListComponent{
  selectedProduct : any = null;
  products : Product[] = [
	{id: 1, name: 'camera', description: 'Camera Description', image: 'https://via.placeholder.com/150'}, 
	{id: 2, name: 'laptop', description: 'Laptop Description', image: 'https://via.placeholder.com/150'}, 
	{id: 3, name: 'shampoo', description: 'Shampoo Description', image: 'https://via.placeholder.com/150'}];
  selectProduct(product: Product): void {
  this.selectedProduct = product;
}
}