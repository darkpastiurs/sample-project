package sv.com.sample.web;

import java.io.Serializable;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

@Named(value = "sampleController")
@ViewScoped
public class SampleController implements Serializable {
    private static final long serialVersionUID = 1L;

    private String saludo = "Hello World!";

    public String getSaludo() {
        return saludo;
    }

    public void setSaludo(String saludo) {
        this.saludo = saludo;
    }
}
