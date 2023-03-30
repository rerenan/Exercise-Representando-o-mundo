import java.util.List;

public class Topico {
    private String titulo;
    private String teoria;
    private List<Exercicio> exercicios;
    private String desafios;
    private String video;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTeoria() {
        return teoria;
    }

    public void setTeoria(String teoria) {
        this.teoria = teoria;
    }

    public String getDesafios() {
        return desafios;
    }

    public void setDesafios(String desafios) {
        this.desafios = desafios;
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }

    public List<Exercicio> getExercicios() {
        return exercicios;
    }

    public void setExercicios(List<Exercicio> exercicios) {
        this.exercicios = exercicios;
    }
}
