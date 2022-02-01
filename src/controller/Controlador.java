package controller;

import dao.UsuarioDAO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.UsuarioModel;
import view.frmUsuarioList;

public class Controlador implements ActionListener{
    UsuarioDAO dao = new UsuarioDAO();
    UsuarioModel u = new UsuarioModel();
    frmUsuarioList vista = new frmUsuarioList();
    DefaultTableModel modelo = new DefaultTableModel();
    
    public Controlador(frmUsuarioList v){
        this.vista = v;
        this.vista.btnBuscar.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==vista.btnBuscar){
            listar(vista.tLista);
        }
    }
    
    public void listar(JTable tabla){
        modelo = (DefaultTableModel)tabla.getModel();
        List<UsuarioModel> lista = dao.listar();
        Object[] object = new Object[5];
        for(int i=0; i<lista.size(); i++){
            object[0] = lista.get(i).getIdusuario();
            object[1] = lista.get(i).getNombres();
            object[2] = lista.get(i).getUsuario();
            //object[0] = lista.get(i).getContrasena();
            object[3] = lista.get(i).getIdrol();
            //object[0] = lista.get(i).getFoto();
            object[4] = lista.get(i).isEstado();
            modelo.addRow(object);
        }
        
        vista.tLista.setModel(modelo);
    }
}
