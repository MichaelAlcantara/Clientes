import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Cliente } from '../cliente';
import { ClientesService } from 'src/app/clientes.service';

@Component({
  selector: 'app-clientes-lista',
  templateUrl: './clientes-lista.component.html',
  styleUrls: ['./clientes-lista.component.css']
})
export class ClientesListaComponent implements OnInit {

  clientes: Cliente[] = [];

  constructor(private service: ClientesService, private router: Router) { }

  ngOnInit(): void {
    this.service.getClientes().subscribe(resposta => this.clientes = resposta);
  }

  novoCadastro(){
    //Rota para criar novos clientes
    this.router.navigate(['/clientes-form'])
  }

}
