package idade;

public class calculos {

    public int anos;
    public int meses;
    public int dias;

    public int idadeEmDias;

    public void calcularIdadeEmDias() {
        final int DIAS_EM_UM_ANO = 365;
        final int DIAS_EM_UM_MES = 30;

        this.idadeEmDias = (this.anos * DIAS_EM_UM_ANO) + (this.meses * DIAS_EM_UM_MES) + this.dias;
    }
}
