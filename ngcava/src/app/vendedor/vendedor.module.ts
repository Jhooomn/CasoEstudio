import { NgModule } from "@angular/core";
import { MaterialModule } from "../material/material.module";
import { SharedModule } from "../shared/shared.module";
import { ProductoForm } from "./forms/products/products.form";
import { VendedorHomeComponent } from "./home/home.component";
import { VendedorLayoutComponent } from "./layout/layout.component";
import { ProductsComponent } from "./products/products.component";
import { VendedorRoutingModule } from "./vendedor-routing.module";
import { VentasVendedorComponent } from "./ventas/ventas.component";

@NgModule({
    declarations: [
        VendedorLayoutComponent,
        VendedorHomeComponent,
        ProductsComponent,
        VentasVendedorComponent,
        ProductoForm
    ],
    imports: [
        MaterialModule,
        SharedModule,
        VendedorRoutingModule
    ],
    providers: []
})
export class VendedorModule{}