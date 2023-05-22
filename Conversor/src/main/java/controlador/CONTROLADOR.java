/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.DefaultComboBoxModel;
import modelo.MODELO;
import vista.VISTA;

/**
 *
 * @author Rocjan
 */

public class CONTROLADOR implements ActionListener, ItemListener{
    
    private VISTA view;
    private MODELO model;
    
    
    public String[] getUnidades(String unidad)
    {
        int x=8;
        if(unidad.equalsIgnoreCase("Moneda"))
        {
            x=4;
        }
        
        if(unidad.equalsIgnoreCase("Peso"))
        {
            x=6;
        }
        
        if(unidad.equalsIgnoreCase("Temperatura"))
        {
            x=3;
        }
        String[] unidades = new String[x];
        if(unidad.equalsIgnoreCase("Moneda"))
        {
            unidades[0] = "Pesos Mexicanos";
            unidades[1] = "Dolares Estadounidenses";
            unidades[2] = "Euros";
            unidades[3] = "Libras Esterlinas";
        }
        
        if(unidad.equalsIgnoreCase("Longitud"))
        {
            unidades[0] = "Milimetros";
            unidades[1] = "Centimetros";
            unidades[2] = "Metros";
            unidades[3] = "Kilometros";
            unidades[4] = "Millas";
            unidades[5] = "Yardas";
            unidades[6] = "Pies";
            unidades[7] = "Pulgadas";
        }
        
        if(unidad.equalsIgnoreCase("Peso"))
        {
            unidades[0] = "Miligramos";
            unidades[1] = "Gramos";
            unidades[2] = "Kilogramos";
            unidades[3] = "Toneladas";
            unidades[4] = "Libras";
            unidades[5] = "Onzas";
        }
        
        if(unidad.equalsIgnoreCase("Temperatura"))
        {
            unidades[0] = "Grados Celsius";
            unidades[1] = "Grados Fahrenheit";
            unidades[2] = "Grados Kelvin";
        }
        
        return unidades;
    }
    
    public CONTROLADOR(VISTA view, MODELO model)
    {
        this.view = view;
        this.model = model;
        this.view.btnConvertir.addActionListener(this);
        this.view.cboConvertir.addItemListener(this);
    }
    
    public void iniciar()
    {
        view.setTitle("Conversor");
        view.setLocationRelativeTo(null);
    }
    
    public void actionPerformed(ActionEvent e)
    {
        model.setValorInicial(Double.parseDouble(view.txtCantidad.getText()));
        
        
        //switch para identificar la conversion a realizar
        switch(view.cboConvertir.getSelectedIndex())
        {
            case 0: //Moneda
                switch(view.cboInicial.getSelectedIndex())
                {
                    case 0: //MXN
                        switch(view.cboFinal.getSelectedIndex())
                        {
                            case 0: //MXN
                                model.Igual();
                                break;
                        
                            case 1: //USD
                                model.MxnUsd();
                                break;
    
                            case 2: //EUR
                                model.MxnEur();
                                break;
                        
                            case 3: //GBP
                                model.MxnGbp();
                                break;
                        }
                        break;
                    
                    case 1: //USD
                        switch(view.cboFinal.getSelectedIndex())
                        {
                            case 0: //MXN
                                model.UsdMxn();
                                break;
                        
                            case 1: //USD
                                model.Igual();
                                break;
    
                            case 2: //EUR
                                model.UsdEur();
                                break;
                        
                            case 3: //GBP
                                model.UsdGbp();
                                break;
                        }
                        break;

                    case 2: //EUR
                        switch(view.cboFinal.getSelectedIndex())
                        {
                            case 0: //MXN
                                model.EurMxn();
                                break;
                        
                            case 1: //USD
                                model.EurUsd();
                                break;
    
                            case 2: //EUR
                                model.Igual();
                                break;
                        
                            case 3: //GBP
                                model.EurGbp();
                                break;
                        }
                        break;
                    
                    case 3: //GBP
                        switch(view.cboFinal.getSelectedIndex())
                        {
                            case 0: //MXN
                                model.GbpMxn();
                                break;
                        
                            case 1: //USD
                                model.GbpUsd();
                                break;
    
                            case 2: //EUR
                                model.GbpEur();
                                break;
                        
                            case 3: //GBP
                                model.Igual();
                                break;
                        }
                        break;
                }
                break;
            
            case 1: //Longitud
                switch(view.cboInicial.getSelectedIndex())
                {
                    case 0: //Milimetros
                        switch(view.cboFinal.getSelectedIndex())
                        {
                            case 0: //Milimetros
                                model.Igual();
                                break;
                    
                            case 1: //Centimetros
                                model.MmCm();
                                break;

                            case 2: //Metros
                                model.MmM();
                                break;
                    
                            case 3: //Kilometros
                                model.MmKm();
                                break;
                     
                            case 4: //Millas
                                model.MmMi();
                                break;
                    
                            case 5: //Yardas
                                model.MmYd();
                                break;

                            case 6: //Pies
                                model.MmFt();
                                break;
                    
                            case 7: //Pulgadas
                                model.MmIn();
                                break;
                        }
                        break;
                    
                    case 1: //Centimetros
                        switch(view.cboFinal.getSelectedIndex())
                        {
                            case 0: //Milimetros
                                model.CmMm();
                                break;
                    
                            case 1: //Centimetros
                                model.Igual();
                                break;

                            case 2: //Metros
                                model.CmM();
                                break;
                    
                            case 3: //Kilometros
                                model.CmKm();
                                break;
                     
                            case 4: //Millas
                                model.CmMi();
                                break;
                    
                            case 5: //Yardas
                                model.CmYd();
                                break;

                            case 6: //Pies
                                model.CmFt();
                                break;
                    
                            case 7: //Pulgadas
                                model.CmIn();
                                break;
                        }
                        break;

                    case 2: //Metros
                        switch(view.cboFinal.getSelectedIndex())
                        {
                            case 0: //Milimetros
                                model.MMm();
                                break;
                    
                            case 1: //Centimetros
                                model.MCm();
                                break;

                            case 2: //Metros
                                model.Igual();
                                break;
                    
                            case 3: //Kilometros
                                model.MKm();
                                break;
                     
                            case 4: //Millas
                                model.MMi();
                                break;
                    
                            case 5: //Yardas
                                model.MYd();
                                break;

                            case 6: //Pies
                                model.MFt();
                                break;
                    
                            case 7: //Pulgadas
                                model.MIn();
                                break;
                        }
                        break;
                    
                    case 3: //Kilometros
                        switch(view.cboFinal.getSelectedIndex())
                        {
                            case 0: //Milimetros
                                model.KmMm();
                                break;
                    
                            case 1: //Centimetros
                                model.KmCm();
                                break;

                            case 2: //Metros
                                model.KmM();
                                break;
                    
                            case 3: //Kilometros
                                model.Igual();
                                break;
                     
                            case 4: //Millas
                                model.KmMi();
                                break;
                    
                            case 5: //Yardas
                                model.KmYd();
                                break;

                            case 6: //Pies
                                model.KmFt();
                                break;
                    
                            case 7: //Pulgadas
                                model.KmIn();
                                break;
                        }
                        break;
                     
                    case 4: //Millas
                        switch(view.cboFinal.getSelectedIndex())
                        {
                            case 0: //Milimetros
                                model.MiMm();
                                break;
                    
                            case 1: //Centimetros
                                model.MiCm();
                                break;

                            case 2: //Metros
                                model.MiM();
                                break;
                    
                            case 3: //Kilometros
                                model.MiKm();
                                break;
                     
                            case 4: //Millas
                                model.Igual();
                                break;
                    
                            case 5: //Yardas
                                model.MiYd();
                                break;

                            case 6: //Pies
                                model.MiFt();
                                break;
                    
                            case 7: //Pulgadas
                                model.MiIn();
                                break;
                        }
                        break;
                    
                    case 5: //Yardas
                        switch(view.cboFinal.getSelectedIndex())
                        {
                            case 0: //Milimetros
                                model.YdMm();
                                break;
                    
                            case 1: //Centimetros
                                model.YdCm();
                                break;

                            case 2: //Metros
                                model.YdM();
                                break;
                    
                            case 3: //Kilometros
                                model.YdKm();
                                break;
                     
                            case 4: //Millas
                                model.YdMi();
                                break;
                    
                            case 5: //Yardas
                                model.Igual();
                                break;

                            case 6: //Pies
                                model.YdFt();
                                break;
                    
                            case 7: //Pulgadas
                                model.YdIn();
                                break;
                        }
                        break;

                    case 6: //Pies
                        switch(view.cboFinal.getSelectedIndex())
                        {
                            case 0: //Milimetros
                                model.FtMm();
                                break;
                    
                            case 1: //Centimetros
                                model.FtCm();
                                break;

                            case 2: //Metros
                                model.FtM();
                                break;
                    
                            case 3: //Kilometros
                                model.FtKm();
                                break;
                     
                            case 4: //Millas
                                model.FtMi();
                                break;
                    
                            case 5: //Yardas
                                model.FtYd();
                                break;

                            case 6: //Pies
                                model.Igual();
                                break;
                    
                            case 7: //Pulgadas
                                model.FtIn();
                                break;
                        }
                        break;
                    
                    case 7: //Pulgadas
                        switch(view.cboFinal.getSelectedIndex())
                        {
                            case 0: //Milimetros
                                model.InMm();
                                break;
                    
                            case 1: //Centimetros
                                model.InCm();
                                break;

                            case 2: //Metros
                                model.InM();
                                break;
                    
                            case 3: //Kilometros
                                model.InKm();
                                break;
                     
                            case 4: //Millas
                                model.InMi();
                                break;
                    
                            case 5: //Yardas
                                model.InYd();
                                break;

                            case 6: //Pies
                                model.InFt();
                                break;
                    
                            case 7: //Pulgadas
                                model.Igual();
                                break;
                        }
                        break;
                }
                break;
                
            case 2: //Peso
                switch(view.cboInicial.getSelectedIndex())
                {
                    case 0: //Miligramos
                        switch(view.cboFinal.getSelectedIndex())
                        {
                            case 0: //Miligramos
                                model.Igual();
                                break;
                    
                            case 1: //Gramos
                                model.MgGr();
                                break;

                            case 2: //Kilogramos
                                model.MgKg();
                                break;
                    
                            case 3: //Toneladas
                                model.MgTon();
                                break;
                        
                            case 4: //Libras
                                model.MgLb();
                                break;
                    
                            case 5: //Onzas
                                model.MgOz();
                                break;
                        }
                        break;
                    
                    case 1: //Gramos
                        switch(view.cboFinal.getSelectedIndex())
                        {
                            case 0: //Miligramos
                                model.GrMg();
                                break;
                    
                            case 1: //Gramos
                                model.Igual();
                                break;

                            case 2: //Kilogramos
                                model.GrKg();
                                break;
                    
                            case 3: //Toneladas
                                model.GrTon();
                                break;
                        
                            case 4: //Libras
                                model.GrLb();
                                break;
                    
                            case 5: //Onzas
                                model.GrOz();
                                break;
                        }
                        break;

                    case 2: //Kilogramos
                        switch(view.cboFinal.getSelectedIndex())
                        {
                            case 0: //Miligramos
                                model.KgMg();
                                break;
                    
                            case 1: //Gramos
                                model.KgGr();
                                break;

                            case 2: //Kilogramos
                                model.Igual();
                                break;
                    
                            case 3: //Toneladas
                                model.KgTon();
                                break;
                        
                            case 4: //Libras
                                model.KgLb();
                                break;
                    
                            case 5: //Onzas
                                model.KgOz();
                                break;
                        }
                        break;
                    
                    case 3: //Toneladas
                        switch(view.cboFinal.getSelectedIndex())
                        {
                            case 0: //Miligramos
                                model.TonMg();
                                break;
                    
                            case 1: //Gramos
                                model.TonGr();
                                break;

                            case 2: //Kilogramos
                                model.TonKg();
                                break;
                    
                            case 3: //Toneladas
                                model.Igual();
                                break;
                        
                            case 4: //Libras
                                model.TonLb();
                                break;
                    
                            case 5: //Onzas
                                model.TonOz();
                                break;
                        }
                        break;
                        
                    case 4: //Libras
                        switch(view.cboFinal.getSelectedIndex())
                        {
                            case 0: //Miligramos
                                model.LbMg();
                                break;
                    
                            case 1: //Gramos
                                model.LbGr();
                                break;

                            case 2: //Kilogramos
                                model.LbKg();
                                break;
                    
                            case 3: //Toneladas
                                model.LbTon();
                                break;
                        
                            case 4: //Libras
                                model.Igual();
                                break;
                    
                            case 5: //Onzas
                                model.LbOz();
                                break;
                        }
                        break;
                    
                    case 5: //Onzas
                        switch(view.cboFinal.getSelectedIndex())
                        {
                            case 0: //Miligramos
                                model.OzMg();
                                break;
                    
                            case 1: //Gramos
                                model.OzGr();
                                break;

                            case 2: //Kilogramos
                                model.OzKg();
                                break;
                    
                            case 3: //Toneladas
                                model.OzTon();
                                break;
                        
                            case 4: //Libras
                                model.OzLb();
                                break;
                    
                            case 5: //Onzas
                                model.Igual();
                                break;
                        }
                        break;
                }
                break;
                
            case 3: //Temperatura
                switch(view.cboInicial.getSelectedIndex())
                {
                    case 0: //C
                        switch(view.cboFinal.getSelectedIndex())
                        {
                            case 0: //C
                                model.Igual();
                                break;
                    
                            case 1: //F
                                model.CelsiusFahrenheit();
                                break;

                            case 2: //K
                                model.CelsiusKelvin();
                                break;
                        }
                        break;
                    
                    case 1: //F
                        switch(view.cboFinal.getSelectedIndex())
                        {
                            case 0: //C
                                model.FahrenheitCelsius();
                                break;
                    
                            case 1: //F
                                model.Igual();
                                break;

                            case 2: //K
                                model.FahrenheitKelvin();
                                break;
                        }
                        break;

                    case 2: //K
                        switch(view.cboFinal.getSelectedIndex())
                        {
                            case 0: //C
                                model.KelvinCelsius();
                                break;
                    
                            case 1: //F
                                model.KelvinFahrenheit();
                                break;

                            case 2: //K
                                model.Igual();
                                break;
                        }
                        break;
                }
                break;
        }
        
        view.lblRes1.setText(view.txtCantidad.getText() + " " + view.cboInicial.getSelectedItem().toString() + " =");
        view.lblRes2.setText(String.valueOf(model.getValorFinal()) + " " + view.cboFinal.getSelectedItem().toString());   
    }
    
    @Override
    public void itemStateChanged(ItemEvent evt)
    {
        if (evt.getStateChange() == ItemEvent.SELECTED)
        {
            view.cboInicial.setModel(new DefaultComboBoxModel(this.getUnidades(view.cboConvertir.getSelectedItem().toString())));
            view.cboFinal.setModel(new DefaultComboBoxModel(this.getUnidades(view.cboConvertir.getSelectedItem().toString())));
        }
    }
    
}
