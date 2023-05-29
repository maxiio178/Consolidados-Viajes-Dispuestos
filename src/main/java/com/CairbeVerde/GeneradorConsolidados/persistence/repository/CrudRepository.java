package com.CairbeVerde.GeneradorConsolidados.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CrudRepository extends JpaRepository<>{
    @Query("SELECT empresas.nombre AS Empresa, items.nitEmpresa AS NIT, items.fechaPlanilla AS fechaEntrada, " +
            "empresas.dane AS DANE, items.fechaSalida AS fechaSalida, items.camionesCodigo AS Placa, " +
            "items.horaLlegada AS Ingreso, items.horaSalida AS Salida, items.pesoBruto AS PBruto, " +
            "items.camionesPeso AS Tara, items.pesoFinal AS Toneladas, items.mcubico AS M3, items.ruta AS ruta, " +
            "barrios.nombre AS barrio, items.observaciones AS observaciones, " +
            "CONCAT(planillasRecepcion.codigoPlanilla, planillasRecepcion.turnosIdTurnos, items.item) AS registro " +
            "FROM Items items " +
            "JOIN items.empresas empresas " +
            "JOIN items.planillasRecepcion planillasRecepcion " +
            "JOIN items.barrios barrios " +
            "WHERE SUBSTRING(items.fechaPlanilla, 1, 7) = SUBSTRING('2023-04-27', 1, 7) " +
            "AND items.tipo = '1' " +
            "AND items.nitEmpresa = '900074102-5' " +
            "ORDER BY items.fechaPlanilla ASC, items.horaLlegada")
    List<Object[]> getItemsByFechaPlanillaAndNitEmpresa(String fechaPlanilla, String nitEmpresa);

}
