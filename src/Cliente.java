import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("b7ecb186-1f0c-4326-baeb-54c9dcd6e11a")
public class Cliente {
    @objid ("97f5a1ab-b99c-44ef-a07d-297f27d8cbc1")
    private String NIF;

    @objid ("db5725ef-8343-49ed-a9fd-0148c75eb94e")
    private String nombre;

    @objid ("f664d86a-7539-4cba-8cd6-2ab7b19516d1")
    private String direccion;

    @objid ("f286f30e-dadc-46ea-9e83-dbc0ab074fd7")
    private String telefono;

    @objid ("94e418f9-0306-4a8b-aec9-d08eee1c724c")
    private String email;

    @objid ("9540a5df-0738-43fd-a6a4-137e4e0995ee")
    private String numSocio;

    @objid ("b042c47d-8ee9-439b-85a9-aad5423a724b")
    private Date fecAlta;

    @objid ("377d44a0-8ef9-4ead-aed0-579c89c48c6e")
    private float sancion;

    @objid ("11042db9-984f-4bc6-824e-e86cd615a352")
    public List<Alquiler>  = new ArrayList<Alquiler> ();

    @objid ("45b69940-37b8-4cfa-be00-6d6966e3813d")
    public float getSancion() {
        // TODO Auto-generated return
        return 0f;
    }

    @objid ("ca57930c-dfa4-43fd-8ebc-8215a97fead3")
    public void setSancion(final float importe) {
    }

    @objid ("19e66299-bc44-44e7-a5da-72e86d401543")
    public boolean CompararNIF(final String NIF) {
        // TODO Auto-generated return
        return false;
    }

}
