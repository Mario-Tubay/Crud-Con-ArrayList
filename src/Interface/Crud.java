/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import java.util.ArrayList;

public interface Crud <T> {
    ArrayList ingresar(T t);
    void modificar();
    void consulta();
}
