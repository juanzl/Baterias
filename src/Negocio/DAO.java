/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Negocio;

import java.util.List;

/**
 *
 * @author juancarloslizarragaencinas
 */
public interface DAO<T, K>{
    
void guardar(T a);

void editar(T a);

void eliminar(T a);

   
  List<T> obtenerTodos();

    T obtener(K id);


}

