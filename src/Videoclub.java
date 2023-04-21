import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("6ea5f887-9277-46b1-afe0-7212c21b5e99")
public class Videoclub {
    @objid ("0f815df5-faf0-43af-bae3-801c83928602")
    public List<Pelicula>  = new ArrayList<Pelicula> ();

    @objid ("84f0153e-7cc0-477d-8de3-9f05a53ef1a6")
    public List<Cliente>  = new ArrayList<Cliente> ();

    @objid ("f2e357eb-d8d7-44ad-93cc-cc38612fee51")
    public List<Alquiler>  = new ArrayList<Alquiler> ();

    @objid ("424ca9b6-4dab-4466-9f05-3c57a5b195db")
    public boolean AlquilarPelicula(final String NIF, final String CodPel) {
        // TODO Auto-generated return
        return false;
    }

    @objid ("6c18fc64-e0a3-4fab-b71f-a9abe8059f39")
    public boolean DevolverPelicula(final String NIF, final int CodPel) {
        // TODO Auto-generated return
        return false;
    }

}
