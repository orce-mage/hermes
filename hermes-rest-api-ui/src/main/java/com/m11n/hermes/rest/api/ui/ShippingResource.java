package com.m11n.hermes.rest.api.ui;

import com.m11n.hermes.core.service.MagentoService;
import com.m11n.hermes.core.service.SshService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.Collections;
import java.util.List;
import java.util.Map;

@Path("/shipping")
@Produces(MediaType.APPLICATION_JSON)
@Controller
public class ShippingResource {
    private static final Logger logger = LoggerFactory.getLogger(ShippingResource.class);

    @Inject
    private MagentoService magentoService;

    @Inject
    private SshService sshService;

    @Value("${hermes.server.inbox.dir}")
    private String serverInboxDir;

    @Value("${hermes.server.intern.inbox.dir}")
    private String serverInternInboxDir;

    @GET
    @Path("/shipment")
    @Produces(MediaType.APPLICATION_JSON)
    public Response createShipment(@QueryParam("orderId") String orderId) throws Exception {
        return Response.ok(Collections.singletonMap("shipmentId", magentoService.createShipment(orderId))).build();
    }

    @GET
    @Path("/label")
    @Produces(MediaType.APPLICATION_JSON)
    public Response createLabel(@QueryParam("orderId") String orderId) throws Exception {
        List<Map<String, Object>> result = magentoService.createIntrashipLabel(orderId);
        return Response.ok(result).build();
    }

    @GET
    @Path("/status")
    @Produces(MediaType.APPLICATION_JSON)
    public Response status(@QueryParam("orderId") String orderId) {
        return Response.ok(magentoService.getIntrashipStatuses(orderId)).build();
    }

    @GET
    @Path("/flush")
    @Produces(MediaType.APPLICATION_JSON)
    public Response flush() throws Exception{
        try {
            sshService.connect();
            sshService.exec("mv " + serverInboxDir + "/* " + serverInternInboxDir);
            sshService.disconnect();

            return Response.ok().build();
        } catch (Exception e) {
            logger.error(e.toString(), e);
        }

        return Response.serverError().build();
    }
}
