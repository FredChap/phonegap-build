package com.github.chrisprice.phonegapbuild.api.managers;

import com.github.chrisprice.phonegapbuild.api.data.me.MeResponse;
import com.sun.jersey.api.client.WebResource;

public interface MeManager {

  public static final String API_V1_PATH = "/api/v1";
  public static final String TOKEN_PATH = "/token";

  public WebResource createRootWebResource(String username, String password);

  public WebResource createRootWebResource(String username, String password, String proxyUri);
  public WebResource createRootWebResource(String username, String password, String proxyUri, String proxyUser, String proxyPwd);

  public MeResponse requestMe(WebResource resource);

}
