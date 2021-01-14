
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import Entity.AslabEntity07096;
import Entity.DaftarprakEntity07096;
import Entity.PraktikanEntity07096;
import java.util.ArrayList;
import java.util.Date;
/**
 *
 * @author LENOVO
 */
public class AdminController07096 implements ControllerInterface07096 {
    int indexLogin = 0;
        public AdminController07096(){
        }
        public void dataAslab(){
            String npmAslab[]={"01","02","03","04","05","06","07"};
            String passwordAslab [] = {"01","02","03","04","05","06","07"};
            String namaAslab [] = {"Michel","Alan","Odil","Fitria","Sita","Eric","Fernanda"};
            String notelpAslab[] = {"01","02","03","04","05","06","07"};
            String tglLahirAslab []= {"04/05/2000","01/12/2000","03/3/2000","23/6/2000","11/3/2000","13/9/2000","22/12/2000"};
            String laboratorium [] = {"RPL","SO","BASPROG","BASPROG","SO","RPL","RPL"};
             for (int i = 0; i < npmAslab.length; i ++){
                 AllObjectModel07096.aslabmodel07096.insertAslab(new AslabEntity07096 (npmAslab[i],passwordAslab [i],namaAslab[i],
                 notelpAslab[i],new Date (tglLahirAslab [i]),laboratorium[i]));
             } 

        }
public void viewAslab(){
    AllObjectModel07096.aslabmodel07096.view();
}
public void listPendaftarPraktikum(){
    AllObjectModel07096.aslabmodel07096.view();
}
    @Override
    public void login(String npm, String password) {
        indexLogin = AllObjectModel07096.aslabmodel07096.cekData(npm, password);
    }
    
     public AslabEntity07096 aslabEntity() {
        return AllObjectModel07096.aslabmodel07096.showDataAslab(indexLogin);
    }
    public void updateIsVerified(int index,int indexPrak,PraktikanEntity07096 praktikanentity07096){
    AllObjectModel07096.daftarprakmodel07096.updateIsVerified(index, new DaftarprakEntity07096 (indexPrak, praktikanentity07096,true));
    }
    
    public ArrayList<DaftarprakEntity07096> cekdaftarprakmodel(){
    return AllObjectModel07096.daftarprakmodel07096.getDaftarprakArrayList();
    }    

    
}
