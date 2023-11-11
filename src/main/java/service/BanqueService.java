package service;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;
import metier.Compte;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@WebService
public class BanqueService {

    @WebMethod
    public double conversion (@WebParam double montant) {
        return montant*3.36;
    }
    @WebMethod
    public Compte getCompte(@WebParam int code) {
        return new Compte(code, 0, new Date());

    }
    @WebMethod
    List<Compte> getComptes(){
        List<Compte> list = new ArrayList<>();
        Date d = new Date(12, 01, 23);
        Compte cmt = new Compte(0, 100.6, d);
        list.add(cmt);
        return list;
    }


}

