package org.occiware.clouddesigner.occi.docker.connector.dockermachine.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.InputOutput;

@SuppressWarnings("all")
public class DockerConfig {
  private final static String DOCKER_PROPERTIES_PROPERTY = "docker.properties";
  
  public Properties loadConfig() {
    try {
      final Properties p = new Properties();
      InputStream _resourceAsStream = DockerConfig.class.getResourceAsStream(("/" + DockerConfig.DOCKER_PROPERTIES_PROPERTY));
      p.load(_resourceAsStream);
      return p;
    } catch (final Throwable _t) {
      if (_t instanceof IOException) {
        final IOException e = (IOException)_t;
        InputOutput.<String>println("Erreur \n\n\n\n");
        throw new RuntimeException(e);
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
  }
}
