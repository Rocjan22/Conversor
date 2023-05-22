/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Rocjan
 */
public class MODELO {
    
    //Declaracion de variables
    private double ValorInicial, ValorFinal;
    

    //Getters y Setters
    public double getValorInicial() {
        return ValorInicial;
    }

    public void setValorInicial(double ValorInicial) {
        this.ValorInicial = ValorInicial;
    }

    public double getValorFinal() {
        return ValorFinal;
    }

    public void setValorFinal(double ValorFinal) {
        this.ValorFinal = ValorFinal;
    }
    
    
//Conversion de misma unidad
    public double Igual()
    {
        this.ValorFinal = this.ValorInicial;
        return this.ValorFinal;
    }
    

//Conversion temperatura
    
    //Celsius a Fahrenheit
    public double CelsiusFahrenheit()
    {
        this.ValorFinal = (this.ValorInicial * 1.8) + 32;
        return this.ValorFinal;
    }
    
    //Celsius a Kelvin
    public double CelsiusKelvin()
    {
        this.ValorFinal = this.ValorInicial + 273.15;
        return this.ValorFinal;
    }
    
    //Fahrenheit a Celsius
    public double FahrenheitCelsius()
    {
        this.ValorFinal = (this.ValorInicial - 32) / 1.8;
        return this.ValorFinal;
    }
    
    //Fahrenheit a Kelvin
    public double FahrenheitKelvin()
    {
        this.ValorFinal = (5/9)*(this.ValorInicial - 32) + 273.15;
        return this.ValorFinal;
    }
    
    //Kelvin a Celsius
    public double KelvinCelsius()
    {
        this.ValorFinal = this.ValorInicial - 273.15;
        return this.ValorFinal;
    }
    
    //Kelvin a Fahrenheit
    public double KelvinFahrenheit()
    {
        this.ValorFinal = (1.8)*(this.ValorInicial - 273.15) + 32;
        return this.ValorFinal;
    }
    

//Conversion moneda a fecha 21/05/2023
    
    //MXN a USD
    public double MxnUsd()
    {
        this.ValorFinal = this.ValorInicial * 0.056284403;
        return this.ValorFinal;
    }

    //MXN a EUR
    public double MxnEur()
    {
        this.ValorFinal = this.ValorInicial * 0.052005565;
        return this.ValorFinal;
    }

    //MXN a GBP
    public double MxnGbp()
    {
        this.ValorFinal = this.ValorInicial * 0.045219193;
        return this.ValorFinal;
    }

    //USD a MXN
    public double UsdMxn()
    {
        this.ValorFinal = this.ValorInicial * 17.766911;
        return this.ValorFinal;
    }

    //USD a EUR
    public double UsdEur()
    {
        this.ValorFinal = this.ValorInicial * 0.92397826;
        return this.ValorFinal;
    }

    //USD a GBP
    public double UsdGbp()
    {
        this.ValorFinal = this.ValorInicial * 0.8034054;
        return this.ValorFinal;
    }

    //EUR a USD
    public double EurUsd()
    {
        this.ValorFinal = this.ValorInicial * 1.0822765;
        return this.ValorFinal;
    }

    //EUR a MXN
    public double EurMxn()
    {
        this.ValorFinal = this.ValorInicial * 19.228711;
        return this.ValorFinal;
    }

    //EUR a GBP
    public double EurGbp()
    {
        this.ValorFinal = this.ValorInicial * 0.86950682;
        return this.ValorFinal;
    }

    //GBP a EUR
    public double GbpEur()
    {
        this.ValorFinal = this.ValorInicial * 1.1500772;
        return this.ValorFinal;
    }

    //GBP a USD
    public double GbpUsd()
    {
        this.ValorFinal = this.ValorInicial * 1.2447016;
        return this.ValorFinal;
    }

    //GBP a MXN
    public double GbpMxn()
    {
        this.ValorFinal = this.ValorInicial * 22.114142;
        return this.ValorFinal;
    }


//Conversion peso
    
    //Miligramos a gramos
    public double MgGr()
    {
        this.ValorFinal = this.ValorInicial / 1000;
        return this.ValorFinal;
    }
    
    //Miligramos a kilogramos
    public double MgKg()
    {
        this.ValorFinal = this.ValorInicial / 1000000;
        return this.ValorFinal;
    }
    
    //Miligramos a toneladas
    public double MgTon()
    {
        this.ValorFinal = this.ValorInicial / 1000000000;
        return this.ValorFinal;
    }
    
    //Miligramos a libras
    public double MgLb()
    {
        this.ValorFinal = this.ValorInicial * 0.000002205;
        return this.ValorFinal;
    }
    
    //Miligramos a onzas
    public double MgOz()
    {
        this.ValorFinal = this.ValorInicial * 0.000035274;
        return this.ValorFinal;
    }
    
    //Gramos a miligramos
    public double GrMg()
    {
        this.ValorFinal = this.ValorInicial * 1000;
        return this.ValorFinal;
    }
    
    //Gramos a kilogramos
    public double GrKg()
    {
        this.ValorFinal = this.ValorInicial / 1000;
        return this.ValorFinal;
    }
    
    //Gramos a toneladas
    public double GrTon()
    {
        this.ValorFinal = this.ValorInicial / 1000000;
        return this.ValorFinal;
    }
    
    //Gramos a libras
    public double GrLb()
    {
        this.ValorFinal = this.ValorInicial * 0.002204624;
        return this.ValorFinal;
    }
    
    //Gramos a onzas
    public double GrOz()
    {
        this.ValorFinal = this.ValorInicial * 0.035274;
        return this.ValorFinal;
    }
    
    //Kilogramos a miligramos
    public double KgMg()
    {
        this.ValorFinal = this.ValorInicial * 1000000;
        return this.ValorFinal;
    }
    
    //Kilogramos a gramos
    public double KgGr()
    {
        this.ValorFinal = this.ValorInicial * 1000;
        return this.ValorFinal;
    }
    
    //Kilogramos a toneladas
    public double KgTon()
    {
        this.ValorFinal = this.ValorInicial / 1000;
        return this.ValorFinal;
    }
    
    //Kilogramos a libras
    public double KgLb()
    {
        this.ValorFinal = this.ValorInicial * 2.2046;
        return this.ValorFinal;
    }
    
    //Kilogramos a onzas
    public double KgOz()
    {
        this.ValorFinal = this.ValorInicial * 35.274;
        return this.ValorFinal;
    }
    
    //Toneladas a miligramos
    public double TonMg()
    {
        this.ValorFinal = this.ValorInicial * 1000000000;
        return this.ValorFinal;
    }
    
    //Toneladas a gramos
    public double TonGr()
    {
        this.ValorFinal = this.ValorInicial * 1000000;
        return this.ValorFinal;
    }
    
    //Toneladas a kilogramos
    public double TonKg()
    {
        this.ValorFinal = this.ValorInicial * 1000;
        return this.ValorFinal;
    }
    
    //Toneladas a libras
    public double TonLb()
    {
        this.ValorFinal = this.ValorInicial * 2204.6226;
        return this.ValorFinal;
    }
    
    //Toneladas a onzas
    public double TonOz()
    {
        this.ValorFinal = this.ValorInicial * 35273.9619;
        return this.ValorFinal;
    }
    
    //Libras a miligramos
    public double LbMg()
    {
        this.ValorFinal = this.ValorInicial * 453592.37;
        return this.ValorFinal;
    }
    
    //Libras a gramos
    public double LbGr()
    {
        this.ValorFinal = this.ValorInicial * 453.59237;
        return this.ValorFinal;
    }
    
    //Libras a kilogramos
    public double LbKg()
    {
        this.ValorFinal = this.ValorInicial * 0.45359237;
        return this.ValorFinal;
    }
    
    //Libras a toneladas
    public double LbTon()
    {
        this.ValorFinal = this.ValorInicial * 0.00045359237;
        return this.ValorFinal;
    }
    
    //Libras a onzas
    public double LbOz()
    {
        this.ValorFinal = this.ValorInicial * 16;
        return this.ValorFinal;
    }
    
    //Onzas a miligramos
    public double OzMg()
    {
        this.ValorFinal = this.ValorInicial * 28349.523125;
        return this.ValorFinal;
    }
    
    //Onzas a gramos
    public double OzGr()
    {
        this.ValorFinal = this.ValorInicial * 28.349523125;
        return this.ValorFinal;
    }

    //Onzas a kilogramos
    public double OzKg()
    {
        this.ValorFinal = this.ValorInicial * 0.028349523125;
        return this.ValorFinal;
    }

    //Onzas a toneladas
    public double OzTon()
    {
        this.ValorFinal = this.ValorInicial * 0.000028349523125;
        return this.ValorFinal;
    }

    //Onzas a libras
    public double OzLb()
    {
        this.ValorFinal = this.ValorInicial / 16;
        return this.ValorFinal;
    }


//Conversion longitud

    //Milimetros a centimetros
    public double MmCm()
    {
        this.ValorFinal = this.ValorInicial / 10;
        return this.ValorFinal;
    }

    //Milimetros a metros
    public double MmM()
    {
        this.ValorFinal = this.ValorInicial / 1000;
        return this.ValorFinal;
    }

    //Milimetros a kilometros
    public double MmKm()
    {
        this.ValorFinal = this.ValorInicial / 1000000;
        return this.ValorFinal;
    }

    //Milimetros a millas
    public double MmMi()
    {
        this.ValorFinal = this.ValorInicial * 0.00000062137;
        return this.ValorFinal;
    }

    //Milimetros a yardas
    public double MmYd()
    {
        this.ValorFinal = this.ValorInicial * 0.001093613;
        return this.ValorFinal;
    }

    //Milimetros a pies
    public double MmFt()
    {
        this.ValorFinal = this.ValorInicial * 0.00328084;
        return this.ValorFinal;
    }

    //Milimetros a pulgadas
    public double MmIn()
    {
        this.ValorFinal = this.ValorInicial * 0.03937;
        return this.ValorFinal;
    }

    //Centimetros a milimetros
    public double CmMm()
    {
        this.ValorFinal = this.ValorInicial * 10;
        return this.ValorFinal;
    }

    //Centimetros a metros
    public double CmM()
    {
        this.ValorFinal = this.ValorInicial / 100;
        return this.ValorFinal;
    }

    //Centimetros a Kilometros
    public double CmKm()
    {
        this.ValorFinal = this.ValorInicial * 100000;
        return this.ValorFinal;
    }

    //Centimetros a millas
    public double CmMi()
    {
        this.ValorFinal = this.ValorInicial * 0.0000062137;
        return this.ValorFinal;
    }

    //Centimetros a yardas
    public double CmYd()
    {
        this.ValorFinal = this.ValorInicial * 0.010936133;
        return this.ValorFinal;
    }

    //Centimetros a pies
    public double CmFt()
    {
        this.ValorFinal = this.ValorInicial * 0.0328084;
        return this.ValorFinal;
    }

    //Centimetros a pulgadas
    public double CmIn()
    {
        this.ValorFinal = this.ValorInicial * 0.3937;
        return this.ValorFinal;
    }

    //Metros a milimetros
    public double MMm()
    {
        this.ValorFinal = this.ValorInicial * 1000;
        return this.ValorFinal;
    }
    //Metros a milimetros
    public double MCm()
    {
        this.ValorFinal = this.ValorInicial * 100;
        return this.ValorFinal;
    }

    //Metros a kilometros
    public double MKm()
    {
        this.ValorFinal = this.ValorInicial / 1000;
        return this.ValorFinal;
    }

    //Metros a millas
    public double MMi()
    {
        this.ValorFinal = this.ValorInicial * 0.000621371;
        return this.ValorFinal;
    }
    
    //Metros a yardas
    public double MYd()
    {
        this.ValorFinal = this.ValorInicial * 1.0936133;
        return this.ValorFinal;
    }

    //Metros a pies
    public double MFt()
    {
        this.ValorFinal = this.ValorInicial * 3.28084;
        return this.ValorFinal;
    }

    //Metros a pulgadas
    public double MIn()
    {
        this.ValorFinal = this.ValorInicial * 39.37;
        return this.ValorFinal;
    }

    //Kilometros a milimetros
    public double KmMm()
    {
        this.ValorFinal = this.ValorInicial * 1000000;
        return this.ValorFinal;
    }

    //Kilometros a centimetros
    public double KmCm()
    {
        this.ValorFinal = this.ValorInicial * 100000;
        return this.ValorFinal;
    }

    //Kilometros a metros
    public double KmM()
    {
        this.ValorFinal = this.ValorInicial * 1000;
        return this.ValorFinal;
    }

    //Kilometros a millas
    public double KmMi()
    {
        this.ValorFinal = this.ValorInicial * 0.621371;
        return this.ValorFinal;
    }

    //Kilometros a yardas
    public double KmYd()
    {
        this.ValorFinal = this.ValorInicial * 1093.6133;
        return this.ValorFinal;
    }

    //Kilometros a pies
    public double KmFt()
    {
        this.ValorFinal = this.ValorInicial * 3280.84;
        return this.ValorFinal;
    }

    //Kilometros a pulgadas
    public double KmIn()
    {
        this.ValorFinal = this.ValorInicial * 39370.07874;
        return this.ValorFinal;
    }

    //Millas a milimetros
    public double MiMm()
    {
        this.ValorFinal = this.ValorInicial * 1609344;
        return this.ValorFinal;
    }

    //Millas a centimetros
    public double MiCm()
    {
        this.ValorFinal = this.ValorInicial * 160934.4;
        return this.ValorFinal;
    }

    //Millas a metros
    public double MiM()
    {
        this.ValorFinal = this.ValorInicial * 1609.344;
        return this.ValorFinal;
    }

    //Millas a kilometros
    public double MiKm()
    {
        this.ValorFinal = this.ValorInicial * 1.609344;
        return this.ValorFinal;
    }

    //Millas a yardas
    public double MiYd()
    {
        this.ValorFinal = this.ValorInicial * 1760;
        return this.ValorFinal;
    }

    //Millas a pies
    public double MiFt()
    {
        this.ValorFinal = this.ValorInicial * 5280;
        return this.ValorFinal;
    }

    //Millas a pulgadas
    public double MiIn()
    {
        this.ValorFinal = this.ValorInicial * 63360;
        return this.ValorFinal;
    }

    //Yardas a milimetros
    public double YdMm()
    {
        this.ValorFinal = this.ValorInicial * 914.4;
        return this.ValorFinal;
    }

    //Yardas a centimetros
    public double YdCm()
    {
        this.ValorFinal = this.ValorInicial * 91.44;
        return this.ValorFinal;
    }

    //Yardas a metros
    public double YdM()
    {
        this.ValorFinal = this.ValorInicial * 0.9144;
        return this.ValorFinal;
    }

    //Yardas a kilometros
    public double YdKm()
    {
        this.ValorFinal = this.ValorInicial * 0.0009144;
        return this.ValorFinal;
    }

    //Yardas a millas
    public double YdMi()
    {
        this.ValorFinal = this.ValorInicial / 1760;
        return this.ValorFinal;
    }

    //Yardas a pies
    public double YdFt()
    {
        this.ValorFinal = this.ValorInicial * 3;
        return this.ValorFinal;
    }

    //Yardas a pulgadas
    public double YdIn()
    {
        this.ValorFinal = this.ValorInicial * 36;
        return this.ValorFinal;
    }

    //Pies a milimetros
    public double FtMm()
    {
        this.ValorFinal = this.ValorInicial * 304.8;
        return this.ValorFinal;
    }

    //Pies a centimetros
    public double FtCm()
    {
        this.ValorFinal = this.ValorInicial * 30.48;
        return this.ValorFinal;
    }

    //Pies a metros
    public double FtM()
    {
        this.ValorFinal = this.ValorInicial * 0.3048;
        return this.ValorFinal;
    }

    //Pies a kilometros
    public double FtKm()
    {
        this.ValorFinal = this.ValorInicial * 0.0003048;
        return this.ValorFinal;
    }

    //Pies a millas
    public double FtMi()
    {
        this.ValorFinal = this.ValorInicial / 5280;
        return this.ValorFinal;
    }

    //Pies a yardas
    public double FtYd()
    {
        this.ValorFinal = this.ValorInicial / 3;
        return this.ValorFinal;
    }

    //Pies a pulgadas
    public double FtIn()
    {
        this.ValorFinal = this.ValorInicial * 12;
        return this.ValorFinal;
    }

    //Pulgadas a milimetros
    public double InMm()
    {
        this.ValorFinal = this.ValorInicial * 25.4;
        return this.ValorFinal;
    }

    //Pulgadas a centimetros
    public double InCm()
    {
        this.ValorFinal = this.ValorInicial * 2.54;
        return this.ValorFinal;
    }

    //Pulgadas a metros
    public double InM()
    {
        this.ValorFinal = this.ValorInicial * 0.0254;
        return this.ValorFinal;
    }

    //Pulgadas a kilometros
    public double InKm()
    {
        this.ValorFinal = this.ValorInicial * 0.0000254;
        return this.ValorFinal;
    }

    //Pulgadas a millas
    public double InMi()
    {
        this.ValorFinal = this.ValorInicial / 63360;
        return this.ValorFinal;
    }

    //Pulgadas a yardas
    public double InYd()
    {
        this.ValorFinal = this.ValorInicial / 36;
        return this.ValorFinal;
    }

    //Pulgadas a pies
    public double InFt()
    {
        this.ValorFinal = this.ValorInicial / 12;
        return this.ValorFinal;
    }
    
}
