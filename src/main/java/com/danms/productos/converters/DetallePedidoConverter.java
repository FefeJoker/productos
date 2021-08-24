package com.danms.productos.converters;

import com.danms.productos.model.DetallePedido;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.reactive.function.client.WebClient;

import javax.persistence.AttributeConverter;

public class DetallePedidoConverter implements AttributeConverter<DetallePedido, Integer> {

    @Override
    public Integer convertToDatabaseColumn(DetallePedido cliente) {
            return cliente.getId();
    }

    @Override
    public DetallePedido convertToEntityAttribute(Integer idCliente) {
        String url = "http://backend.fehler.gregoret.com.ar:8085/usuarios-service" + "api";
        WebClient client = WebClient.create(url);
        ResponseEntity<DetallePedido> result = client.get()
                .uri("/api/cliente/{id}", idCliente).accept(MediaType.APPLICATION_JSON)
                .retrieve()
                .toEntity(DetallePedido.class)
                .or(null)
                .block();

        return result.getBody();
    }
}