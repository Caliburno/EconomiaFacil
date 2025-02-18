package com.example.economiafacil.model;
import java.util.ArrayList;
import java.util.List;

public class CatalogoConceptos {

    private List<Conceptos> conceptos;

    public CatalogoConceptos() {
        conceptos = new ArrayList<>();

    Conceptos saldo = new Conceptos("Saldo","Saldo del mes anterior", Categorias.INGRESOS);
    Conceptos sueldo = new Conceptos("Sueldo", "Sueldo fijo", Categorias.INGRESOS);
    Conceptos honorarios = new Conceptos("Honorarios","Honorarios profesionales", Categorias.INGRESOS);
    Conceptos renta = new Conceptos("Renta","Otros ingresos fijos, como un alquiler", Categorias.INGRESOS);
    Conceptos otrosIngresos = new Conceptos("Otros Ingresos","Ingresos variables, eventuales y miscelaneos", Categorias.INGRESOS);
    Conceptos vivienda = new Conceptos("Vivienda", "Alquiler, hipoteca", Categorias.GASTOS_FIJOS);
    Conceptos serviciosPublicos = new Conceptos("Servicios","Servicios públicos y gastos comunes", Categorias.GASTOS_FIJOS);
    Conceptos telecomunicaciones = new Conceptos("Telecomunicaciones","Gastos de internet, banda ancha, contratos de celular, telefonía fija", Categorias.GASTOS_FIJOS);
    Conceptos prevision = new Conceptos("Seguros y previsión","Seguros personales y del hogar, empresas de seguridad, servicios de acompañante y funerarios", Categorias.GASTOS_FIJOS);
    Conceptos colegio = new Conceptos("Educación","Cuotas mensuales de colegios privados y guarderías, así como cursos pagos", Categorias.GASTOS_FIJOS);
    Conceptos suscripciones = new Conceptos("Suscripciones","Netflix, Sporify, gimnasios", Categorias.GASTOS_FIJOS);
    Conceptos vehiculos = new Conceptos("Vehículos","Seguro, patente, garage, nafta, mantenimiento", Categorias.GASTOS_FIJOS);
    Conceptos impuestos = new Conceptos("Impuestos","Impuestos activos y gastos administrativos, como manutención de cuentas bancarias o contribución inmoviliaria", Categorias.GASTOS_FIJOS);
    Conceptos comida = new Conceptos("Supermercado","Artículos de primera necesidad, alimentos y productos de limpieza", Categorias.GASTOS_VARIABLES);
    Conceptos transporte = new Conceptos("Transporte","Boletos, Uber, taxis", Categorias.GASTOS_VARIABLES);
    Conceptos salud = new Conceptos("Salud y bienestar","Consultas médicas, medicación, estudios, tratamientos", Categorias.GASTOS_VARIABLES);
    Conceptos cuidadoPersonal = new Conceptos("Cuidado personal","Peluquería, cosmética y tratamientos de belleza", Categorias.GASTOS_VARIABLES);
    Conceptos mascotas = new Conceptos("Mascotas","Comida, arena sanitaria, veterinaria, juguetes", Categorias.GASTOS_VARIABLES);
    Conceptos mantenimiento = new Conceptos("Mantenimiento","Arreglos del hogar, mano de obra, repuestos", Categorias.GASTOS_VARIABLES);
    Conceptos papeleria = new Conceptos("Papelería y educación","Artículos de papelería, libros, cursos y seminarios pagos, útiles escolares, fotocopias", Categorias.GASTOS_VARIABLES);
    Conceptos ocio = new Conceptos("Entretenimiento y ocio","Salidas, hobbies, restaurantes, actividades recreativas", Categorias.GASTOS_VARIABLES);
    Conceptos comprasEventuales = new Conceptos("Compras eventuales","Ropa, calzado, muebls, electrodomésticos", Categorias.GASTOS_VARIABLES);
    Conceptos miscelaneos = new Conceptos("Miscelaneos","Otros gastos variables", Categorias.GASTOS_VARIABLES);
    Conceptos tarjetaDeCredito = new Conceptos("Tarjeta de crédito","Compras hechas con tarjetas de crédito", Categorias.DEUDAS);
    Conceptos prestamos = new Conceptos("Prestamos","Cuotas mensuales de prestamos", Categorias.DEUDAS);
    Conceptos otrasDeudas = new Conceptos("Otras deudas","Otras deudas", Categorias.DEUDAS);
    Conceptos ahorro = new Conceptos("Ahorro e inversión","Dinero apartado para ahorrar, gastos de inversiones, saldos a fin de mes", Categorias.AHORRO);
    }

    public List<Conceptos> getConceptos() {
        return conceptos;
    }
}
