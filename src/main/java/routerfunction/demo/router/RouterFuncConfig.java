package routerfunction.demo.router;

        import org.springframework.context.annotation.Bean;
        import org.springframework.context.annotation.Configuration;
        import org.springframework.http.MediaType;
        import org.springframework.web.reactive.function.server.RequestPredicates;
        import org.springframework.web.reactive.function.server.RouterFunction;
        import org.springframework.web.reactive.function.server.RouterFunctions;
        import org.springframework.web.reactive.function.server.ServerResponse;
        import routerfunction.demo.handler.HandlerFunc;

@Configuration
public class RouterFuncConfig {

    @Bean
    public RouterFunction<ServerResponse> route(HandlerFunc handlerFunc){
        return RouterFunctions.route(RequestPredicates.GET("/")
                .and(RequestPredicates.accept(MediaType.APPLICATION_JSON)),handlerFunc::getName);
    }
}
