package com.example.david.myheroku;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
//ratpack
import ratpack.exec.Blocking;
import ratpack.hikari.HikariModule;
import ratpack.server.BaseDir;
import ratpack.server.RatpackServer;
import ratpack.groovy.template.TextTemplateModule;
import ratpack.guice.Guice;
import ratpack.test.embed.EmbeddedApp;
//import static org.junit.Assert.assertEquals;
import static ratpack.groovy.Groovy.groovyTemplate;

import java.util.*;
import java.sql.*;

import javax.sql.DataSource;

//retrofit

package my.app;

import ratpack.server.RatpackServer;

public class Main {
    public static void main(String... args) throws Exception {
        RatpackServer.start(server -> server
                .handlers(chain -> chain
                        .get(ctx -> ctx.render("Hello World!"))
                        .get(":name", ctx -> ctx.render("Hello " + ctx.getPathTokens().get("name") + "!"))
                )
        );
    }
}

//        final Button button = findViewById(R.id.heroku_button);
//        button.setOnClickListener(new View.OnClickListener() {
//                                      public void onClick(View v) {


                                          // Code here executes on main thread after user presses button
                                      }
                                      )}

    //Button herokuButton = (Button) findViewById(R.id.herokuButton);
        )}
