package com.openshift.fordevelopers;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Set;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


@Path("/posts")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class PostResource {
  private Set<Post> lastPosts = Collections.newSetFromMap(Collections.synchronizedMap(new LinkedHashMap<>()));

  public PostResource() {
  }

  @GET
  public Response list() {
    return Response.ok(lastPosts).build();
  }

  @POST
  public Response add(Post post) {
    lastPosts.add(post);
    return Response.ok().build();
  }

  @DELETE
  public Response delete(Post post) {
    return Response.ok().build();
  }
}