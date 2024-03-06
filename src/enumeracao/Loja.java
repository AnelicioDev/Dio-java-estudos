package enumeracao;

import javax.xml.crypto.Data;
import java.util.Date;

public class Loja {
    private int id;
    private Date dataAtual;
    private Status status;

    public Loja(int id, Date dataAtual, Status status) {
        this.id = id;
        this.dataAtual = dataAtual;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public Date getDataAtual() {
        return dataAtual;
    }

    public Status getStatus() {
        return status;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDataAtual(Date dataAtual) {
        this.dataAtual = dataAtual;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Loja{" +
                "id=" + id +
                ", dataAtual=" + dataAtual +
                ", status=" + status +
                '}';
    }
}
