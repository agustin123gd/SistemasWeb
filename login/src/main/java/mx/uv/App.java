package mx.uv;

import static spark.Spark.*;
import com.google.gson.*;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        options("/*", (request, response) -> {

            String accessControlRequestHeaders = request.headers("Access-Control-Request-Headers");
            if (accessControlRequestHeaders != null) {
                response.header("Access-Control-Allow-Headers", accessControlRequestHeaders);
            }

            String accessControlRequestMethod = request.headers("Access-Control-Request-Method");
            if (accessControlRequestMethod != null) {
                response.header("Access-Control-Allow-Methods", accessControlRequestMethod);
            }

            return "OK";
        });
        before((request, response) -> response.header("Access-Control-Allow-Origin", "*"));

        System.out.println( "Hello World!" );
        get("/registro", (rq,rs)->{
            String nombre = rq.queryParams("nombre");
            String contraseña = rq.queryParams("pass");
            if (nombre.equals("agustin") && contraseña.equals("root")){
                return "Bienvenido al registro de usuarios <table class=table><thead><tr><th scope=Nombre>Nombre</th><th scope=Contraseña>contraseña</th></tr></thead><tbody><tr><td>"+ nombre + "</td><td>"+  contraseña + "</td></tr></tbody></table><a href='http://127.0.0.1:5501/login.html'>regresar</a>";
            }else{
                return "Usuario o contraseña incorrectos <a href='http://127.0.0.1:5501/login.html'>regresar</a>";
            }
        });

        get("/add", (rq,rs)->{
            String nombre = rq.queryParams("nombre");
            String contraseña = rq.queryParams("pass");
            
            return "Tu cuenta a sido registrada <table class=table><thead><tr><th scope=Nombre>Nombre</th><th scope=Contraseña>contraseña</th></tr></thead><tbody><tr><td>"+ nombre + "</td><td>"+  contraseña + "</td></tr></tbody></table><a href='http://127.0.0.1:5501/login.html'>regresar</a>";
        });
    }
    
}