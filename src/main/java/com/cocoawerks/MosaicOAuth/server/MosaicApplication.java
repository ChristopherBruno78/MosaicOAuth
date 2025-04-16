package com.cocoawerks.MosaicOAuth.server;

import com.cocoawerks.mosaic.server.MosaicServletInitializer;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan
@EntityScan("com.cococaworks.MosaicOAuth.shared")
public class MosaicApplication
  extends MosaicServletInitializer
  implements CommandLineRunner {

  public static void main(String[] args) {
    SpringApplication.run(MosaicApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {}
}
