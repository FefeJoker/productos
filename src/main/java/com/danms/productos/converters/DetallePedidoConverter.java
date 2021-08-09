package com.danms.productos.converters;

import com.danms.productos.model.DetallePedido;

import javax.persistence.AttributeConverter;

public class DetallePedidoConverter implements AttributeConverter<DetallePedido, Integer> {

    @Override
    public Integer convertToDatabaseColumn(DetallePedido cliente) {
            return cliente.getId();
    }

    @Override
    public DetallePedido convertToEntityAttribute(Integer idCliente) {
        //TODO
        //Traer el cliente del microservicio de usuarios
        DetallePedido detalle = new DetallePedido();
        detalle.setId(idCliente);
        return detalle;
    }
}