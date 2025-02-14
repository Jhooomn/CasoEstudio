import { NgModule } from "@angular/core";
import { RouterModule, Routes } from "@angular/router";
import { AdminHomeComponent } from "./home/home.component";
import { AdminLayoutComponent } from "./layout/layout.component";

const ROUTES : Routes = [
    { 
        path: '', 
        component: AdminLayoutComponent,
        children: [
            { path: '', redirectTo: '/home', pathMatch: 'full' },
            { path: 'home', component: AdminHomeComponent }
        ]
    }
];

@NgModule({
    imports: [RouterModule.forChild(ROUTES)],
    exports: [RouterModule]
})
export class AdminRoutingModule{}