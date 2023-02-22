
package com.openshift.fordevelopers;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import io.quarkus.hibernate.orm.panache.Panache;


@Path("/posts")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class PostResource {
  public PostResource() {
  }

  @GET
  public Response list() {
    return Response.ok(Post.listAll()).build();
  }

  @POST
  @Transactional
  public Response add(Post post) {
    post.persist();
    return Response.ok(Post.listAll()).build();
  }

  @DELETE
  @Transactional
  public Response delete(Post post) {
    EntityManager em = Panache.getEntityManager();
    em.remove(em.contains(post) ? post : em.merge(post));
    return Response.ok().build();
  }
}
