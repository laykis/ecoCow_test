package ecocow.movierecapi.util.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

@Getter
@Setter
public class Response {

    public Response(){

    }

    public Response(String txid, HttpStatus status, String message) {
        this.txid = txid;
        this.status = status;
        this.message = message;
    }
    public Response(String txid, HttpStatus status, String message, Object data) {
        this.txid = txid;
        this.status = status;
        this.message = message;
        this.data = data;
    }

    private String txid;
    private HttpStatus status;
    private String message;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Object data;
}
