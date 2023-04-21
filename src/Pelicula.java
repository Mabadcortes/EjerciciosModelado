import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("af6386fb-f5ae-4c54-8c4c-326d3984fab1")
public class Pelicula {
    @objid ("09040218-b9db-4719-87bf-595a1c2a6c70")
    private int Codigo;

    @objid ("a029f687-a657-4921-b51c-b5bcc731c188")
    private String titulo;

    @objid ("e88f84f9-45e0-4b14-94f7-1157c5e6383b")
    private String genero;

    @objid ("14c73437-7993-48d3-9114-4d00f8f1c92c")
    private String pais;

    @objid ("37164a4b-5f72-4318-9a52-11e05680de42")
    private int añoProduccion;

    @objid ("a2cd385b-d0a0-4a6e-903d-f01bf88bef03")
    private int stock;

    @objid ("45dd2f4c-a651-437f-8c82-2f315d45a947")
    public List<Alquiler>  = new ArrayList<Alquiler> ();

    @objid ("9667533f-9c90-4e26-807f-8061bee41d9d")
    public boolean CompararCodigo(final int CodPel) {
        // TODO Auto-generated return
        return false;
    }

    @objid ("8cca5baa-93fe-4357-9c26-fd0efbc1d1c4")
    public void disminuirStock() {
    }

    @objid ("01387762-0b03-4f47-8ce1-1dba4f82c0de")
    public void aumentarStock() {
    }

    @objid ("ae439f5c-8dd1-48f7-8bb2-e1f2ab38c1da")
    public int getStock() {
        // TODO Auto-generated return
        return 0;
    }

}
